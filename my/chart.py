import pandas as pd

# ✅ 파일 읽기
file_path = 'lotto.xlsx'
df = pd.read_excel(file_path, header=2)

# ✅ 컬럼 설정
number_cols = [1, 2, 3, 4, 5, 6]

# ✅ 1등 번호 목록
first_prize_numbers = df[number_cols].apply(lambda row: tuple(sorted(row.values)), axis=1).tolist()

# ✅ 숫자 범위별 출현 횟수 계산
ranges = {
    '1~9': 0,
    '10~19': 0,
    '20~29': 0,
    '30~39': 0,
    '40~45': 0
}

for nums in first_prize_numbers:
    for num in nums:
        if 1 <= num <= 9:
            ranges['1~9'] += 1
        elif 10 <= num <= 19:
            ranges['10~19'] += 1
        elif 20 <= num <= 29:
            ranges['20~29'] += 1
        elif 30 <= num <= 39:
            ranges['30~39'] += 1
        elif 40 <= num <= 45:
            ranges['40~45'] += 1

# ✅ 총 숫자 개수
total_counts = sum(ranges.values())

# ✅ 결과 출력
print("\n📊 숫자 범위별 출현 횟수 및 비율:")
for k, v in ranges.items():
    ratio = (v / total_counts) * 100
    print(f"{k}: {v}회 ({ratio:.2f}%)")
