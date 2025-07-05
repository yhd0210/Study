import pandas as pd
import random

# ✅ 파일 읽기
file_path = 'lotto.xlsx'
df = pd.read_excel(file_path, header=2)

# ✅ 컬럼 설정
number_cols = [1, 2, 3, 4, 5, 6]

# ✅ 범위별 확률 (누락 개수 기반)
missing_range_prob = {
    0: 12.14,
    1: 52.97,
    2: 31.83,
    3: 2.89,
    4: 0.17,
    5: 0.0
}

range_weights = {
    '1~9': 19.44,
    '10~19': 23.13,
    '20~29': 21.55,
    '30~39': 22.54,
    '40~45': 13.34
}

number_pools = {
    '1~9': list(range(1, 10)),
    '10~19': list(range(10, 20)),
    '20~29': list(range(20, 30)),
    '30~39': list(range(30, 40)),
    '40~45': list(range(40, 46))
}

ranges = list(range_weights.keys())
weights = list(range_weights.values())

# ✅ 누락 개수 선택 (누락 개수 확률 적용)
missing_choices = list(missing_range_prob.keys())
missing_weights = list(missing_range_prob.values())

missing_count = random.choices(missing_choices, weights=missing_weights, k=1)[0]

# ✅ 사용될 범위 개수 = 5 - 누락개수
used_range_count = max(1, 5 - missing_count)
selected_ranges = random.sample(ranges, used_range_count)

# ✅ 각 범위에서 번호 선택
suggested_numbers = set()

for selected_range in selected_ranges:
    pool = number_pools[selected_range]
    available = list(set(pool) - suggested_numbers)
    if available:
        suggested_numbers.add(random.choice(available))

# ✅ 부족한 번호 랜덤 추가
while len(suggested_numbers) < 6:
    suggested_numbers.add(random.randint(1, 45))

suggested_numbers = sorted(suggested_numbers)

# ✅ 추천 번호 파일 저장 (추가 모드)
with open('추천번호.txt', 'a', encoding='utf-8') as f:
    f.write(f"\n{suggested_numbers}")

print(f"\n🎯 추천 번호 (범위 누락 확률 기반): {suggested_numbers} (추천번호.txt 저장 완료)")
