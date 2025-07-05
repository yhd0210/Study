import pandas as pd
import random
from collections import Counter

# ✅ 파일 읽기
file_path = 'lotto.xlsx'
df = pd.read_excel(file_path, header=2)

# ✅ 컬럼명 확인
print("✅ 컬럼명:", df.columns.tolist())

# ✅ 컬럼 세팅 (숫자형 컬럼 사용)
number_cols = [1, 2, 3, 4, 5, 6]
bonus_col = '보너스'
round_col = 'Unnamed: 1'  # 회차 컬럼

# ✅ 컬럼 누락 검사
missing_cols = [col for col in number_cols + [bonus_col] if col not in df.columns]
if missing_cols:
    raise ValueError(f"❗ 해당 컬럼이 없습니다: {missing_cols}")

# ✅ 1등과 2등 번호 목록
first_prize_numbers = df[number_cols].apply(lambda row: sorted(row.values), axis=1).tolist()
second_prize_numbers = df[number_cols + [bonus_col]].apply(lambda row: sorted(row.values), axis=1).tolist()

# ✅ 입력
input_numbers = [12, 13, 18, 27, 34, 45]
input_numbers_set = set(input_numbers)

is_first_prize = False
is_second_prize = False

for idx, row in df.iterrows():
    win_nums = set([row[1], row[2], row[3], row[4], row[5], row[6]])
    bonus_num = row[bonus_col]
    matched = len(win_nums & input_numbers_set)

    if matched == 6:
        is_first_prize = True
    elif matched == 5 and bonus_num in input_numbers_set:
        is_second_prize = True

print(f"\n🎯 1등 당첨 여부: {is_first_prize}")
print(f"🎯 2등 당첨 여부: {is_second_prize}")
print(f"🎯 1등과 2등 모두 등장 여부: {is_first_prize and is_second_prize}")

# ✅ 1등과 2등 번호 겹친 회차 찾기
overlap_count = 0
overlap_rounds = []

for i in range(len(first_prize_numbers)):
    first_set = set(first_prize_numbers[i])
    second_set = set(second_prize_numbers[i])
    if first_set == (second_set - {df.iloc[i][bonus_col]}):
        overlap_count += 1
        overlap_rounds.append(df.iloc[i][round_col])  # ✅ 수정 완료

total_rounds = len(df)
overlap_ratio = (overlap_count / total_rounds) * 100

print(f"\n📊 1등과 2등 번호가 겹친 회차 수: {overlap_count}회")
print(f"📊 총 회차: {total_rounds}회")
print(f"📊 겹친 확률: {overlap_ratio:.2f}%")
print(f"📊 겹친 회차: {overlap_rounds}")

# ✅ 추천번호
if overlap_count > 0:
    overlap_numbers = []
    for i in range(len(first_prize_numbers)):
        first_set = set(first_prize_numbers[i])
        second_set = set(second_prize_numbers[i])
        if first_set == (second_set - {df.iloc[i][bonus_col]}):
            overlap_numbers.extend(first_prize_numbers[i])

    number_freq = Counter(overlap_numbers).most_common()
    top_numbers = [num for num, cnt in number_freq][:6]
    print(f"\n🎁 겹친 회차 기반 추천번호 (최다 등장): {sorted(top_numbers)}")
else:
    all_past_numbers = set()
    for nums in first_prize_numbers:
        all_past_numbers.update(nums)

    available_numbers = [n for n in range(1, 46) if n not in all_past_numbers]
    random_recommend = sorted(random.sample(available_numbers, k=4))
    print(f"\n🎁 1등 번호와 중복되지 않는 추천번호: {random_recommend}")
