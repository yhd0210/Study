import pandas as pd
from collections import Counter

# ✅ header=2로 지정 (엑셀 상 3번째 줄 → Python index 2)
file_path = 'lotto.xlsx'
df = pd.read_excel(file_path, header=2)

# 컬럼명 확인
print("✅ 컬럼명:", df.columns.tolist())

# 컬럼명을 문자열로 통일 (예방 차원)
df.columns = df.columns.map(str)

# 당첨번호 및 보너스 컬럼
number_cols = ['1', '2', '3', '4', '5', '6']
bonus_col = '보너스'

# 컬럼 누락 여부 검사
missing_cols = [col for col in number_cols + [bonus_col] if col not in df.columns]
if missing_cols:
    raise ValueError(f"❗ 해당 컬럼이 없습니다: {missing_cols}")

# -----------------------------
# 1등 & 2등 번호 목록
# -----------------------------
first_prize_numbers = df[number_cols].apply(lambda row: sorted(row.values), axis=1).tolist()
second_prize_numbers = df[number_cols + [bonus_col]].apply(lambda row: sorted(row.values), axis=1).tolist()

# 입력
input_numbers = [5, 6, 11, 27, 43, 44]
input_numbers_set = set(input_numbers)

is_first_prize = False
is_second_prize = False

for idx, row in df.iterrows():
    win_nums = set([row['1'], row['2'], row['3'], row['4'], row['5'], row['6']])
    bonus_num = row['보너스']
    
    # 맞힌 개수
    matched = len(win_nums & input_numbers_set)

    if matched == 6:
        is_first_prize = True
    elif matched == 5 and bonus_num in input_numbers_set:
        is_second_prize = True

# 결과 출력
print(f"\n🎯 1등 당첨 여부: {is_first_prize}")
print(f"🎯 2등 당첨 여부: {is_second_prize}")
print(f"🎯 1등과 2등 모두 등장 여부: {is_first_prize and is_second_prize}")
