import pandas as pd
from itertools import combinations

# 파일 읽기
file_path = 'lotto.xlsx'
df = pd.read_excel(file_path, header=2)

# 컬럼 설정
number_cols = [1, 2, 3, 4, 5, 6]
bonus_col = '보너스'
round_col = 'Unnamed: 1'  # 회차

# 번호 세팅
prize_numbers = []
round_numbers = []

for idx, row in df.iterrows():
    numbers = set([row[1], row[2], row[3], row[4], row[5], row[6], row[bonus_col]])
    prize_numbers.append(numbers)
    round_numbers.append(row[round_col])

# 중복 탐색
first_class_duplicates = []   # 1등 중복
second_class_duplicates = []  # 2등 중복

checked_pairs = set()

for i in range(len(prize_numbers)):
    for j in range(i + 1, len(prize_numbers)):
        pair = tuple(sorted([round_numbers[i], round_numbers[j]]))
        if pair in checked_pairs:
            continue
        checked_pairs.add(pair)

        intersection = prize_numbers[i] & prize_numbers[j]
        
        if len(intersection) == 6:
            # 두 회차의 1등 번호 가져오기
            first_i = set([df.iloc[i][n] for n in number_cols])
            first_j = set([df.iloc[j][n] for n in number_cols])
            
            if intersection == first_i and intersection == first_j:
                first_class_duplicates.append(pair)
            else:
                second_class_duplicates.append(pair)

# 총 회차 수
total_rounds = len(df)

# 결과 출력
print(f"\n총 회차 수: {total_rounds}")
print(f"1등 중복 회차 수: {len(first_class_duplicates)}회 ({(len(first_class_duplicates)/total_rounds)*100:.6f}%)")
print(f"2등 중복 회차 수: {len(second_class_duplicates)}회 ({(len(second_class_duplicates)/total_rounds)*100:.6f}%)")

if first_class_duplicates:
    print("\n1등 중복 회차 목록:")
    for r1, r2 in first_class_duplicates:
        print(f" - {r1}회 <-> {r2}회")

if second_class_duplicates:
    print("\n2등 중복 회차 목록:")
    for r1, r2 in second_class_duplicates:
        print(f" - {r1}회 <-> {r2}회")

if not first_class_duplicates and not second_class_duplicates:
    print("\n1등/2등 중복된 케이스 없음")
