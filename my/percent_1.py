import pandas as pd

# 엑셀 파일 읽기
file_path = 'lotto.xlsx'
df = pd.read_excel(file_path, header=2)

# 컬럼 설정
number_cols = [1, 2, 3, 4, 5, 6]
round_col = 'Unnamed: 1'  # 회차 컬럼

# 누락 컬럼 검사
missing_cols = [col for col in number_cols if col not in df.columns]
if missing_cols:
    raise ValueError(f"❗ 해당 컬럼이 없습니다: {missing_cols}")

# 1등 번호 목록 만들기 (정렬해서 튜플로 변환 → set 비교 가능)
first_prize_numbers = df[number_cols].apply(lambda row: tuple(sorted(row.values)), axis=1).tolist()

# 중복 여부 확인
seen = {}
duplicates = []

for idx, nums in enumerate(first_prize_numbers):
    if nums in seen:
        # 중복 발견 → 저장 (이전 회차와 현재 회차)
        duplicates.append((seen[nums], df.iloc[idx][round_col]))
    else:
        seen[nums] = df.iloc[idx][round_col]

# 결과 계산
duplicate_count = len(duplicates)
total_rounds = len(df)
duplicate_ratio = (duplicate_count / total_rounds) * 100

# 출력
print(f"\n📊 1등 번호 중복 회차 수: {duplicate_count}회")
print(f"📊 총 회차: {total_rounds}회")
print(f"📊 중복 확률: {duplicate_ratio:.6f}%")

if duplicates:
    print("\n📋 중복된 회차 목록 (회차1, 회차2):")
    for r1, r2 in duplicates:
        print(f" - {r1}회 <-> {r2}회")
else:
    print("\n✅ 중복된 1등 번호 없음")
