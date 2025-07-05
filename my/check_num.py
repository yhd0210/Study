import pandas as pd

# ✅ 파일 읽기
file_path = 'lotto.xlsx'
df = pd.read_excel(file_path, header=2)

# ✅ 컬럼 설정
number_cols = [1, 2, 3, 4, 5, 6]
round_col = 'Unnamed: 1'

# ✅ 범위 함수 정의
def get_range(num):
    if 1 <= num <= 9:
        return '1~9'
    elif 10 <= num <= 19:
        return '10~19'
    elif 20 <= num <= 29:
        return '20~29'
    elif 30 <= num <= 39:
        return '30~39'
    elif 40 <= num <= 45:
        return '40~45'

all_ranges = {'1~9', '10~19', '20~29', '30~39', '40~45'}

missing_range_counts = {0: 0, 1: 0, 2: 0, 3: 0, 4: 0, 5: 0}

for idx, row in df.iterrows():
    nums = [row[n] for n in number_cols]
    used_ranges = set(get_range(num) for num in nums)
    missing_count = len(all_ranges - used_ranges)

    if missing_count in missing_range_counts:
        missing_range_counts[missing_count] += 1
    else:
        missing_range_counts[missing_count] = 1

# ✅ 총 회차 수
total_rounds = len(df)

# ✅ 결과 출력
print(f"\n📊 총 회차 수: {total_rounds}")
print("📊 숫자 범위 누락 개수별 빈도 및 비율:")

for missing, count in sorted(missing_range_counts.items()):
    ratio = (count / total_rounds) * 100
    print(f"{missing}개 범위 누락: {count}회 ({ratio:.2f}%)")
