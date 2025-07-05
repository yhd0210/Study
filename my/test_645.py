import random
from math import comb
import re

# ✅ 이론상 총 로또 조합 수
TOTAL_COMBINATIONS = comb(45, 6)

# ✅ 추천번호.txt 읽기
file_path = '추천번호.txt'

number_patterns = []
with open(file_path, 'r', encoding='utf-8') as f:
    lines = f.readlines()

for line in lines:
    match = re.search(r'\[([0-9,\s]+)\]', line)
    if match:
        number_str = match.group(1)
        numbers = sorted(set(int(n.strip()) for n in number_str.split(',')))
        if len(numbers) == 6:
            number_patterns.append(numbers)

# ✅ 가상의 당첨번호 + 보너스 번호 생성
winning_numbers = set(random.sample(range(1, 46), 6))
bonus_number = random.choice(list(set(range(1, 46)) - winning_numbers))

print(f"\n🎯 가상의 1등 당첨번호: {sorted(winning_numbers)} + 보너스: {bonus_number}")

# ✅ 시뮬레이션 시작
results = []

for idx, numbers in enumerate(number_patterns, 1):
    picked_set = set(numbers)
    match_count = len(picked_set & winning_numbers)

    if match_count == 6:
        grade = '1등'
    elif match_count == 5 and bonus_number in picked_set:
        grade = '2등'
    elif match_count == 5:
        grade = '3등'
    elif match_count == 4:
        grade = '4등'
    elif match_count == 3:
        grade = '5등'
    else:
        grade = '꽝'

    results.append((idx, numbers, grade))

# ✅ 결과 출력
print("\n📊 추천번호 시뮬레이션 결과:")
for idx, nums, grade in results:
    print(f"{idx}. {nums} → {grade}")

# ✅ 이론상 1등 확률도 출력
print(f"\n🧮 이론상 1등 확률: 1 / {TOTAL_COMBINATIONS:,} ≈ {100 / TOTAL_COMBINATIONS:.8f}%")
