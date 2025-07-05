import pandas as pd

# ✅ 파일 읽기
file_path = 'lotto.xlsx'
df = pd.read_excel(file_path, header=2)

# ✅ 컬럼 설정
number_cols = [1, 2, 3, 4, 5, 6]
round_col = 'Unnamed: 1'

# ✅ 1등 번호 목록
first_prize_numbers = df[number_cols].apply(lambda row: tuple(sorted(row.values)), axis=1).tolist()

# ✅ 사용자 입력 받기
input_str = input("6개의 숫자를 쉼표로 구분해 입력하세요 (예: 1,5,10,23,34,42): ")
try:
    input_numbers = sorted([int(n.strip()) for n in input_str.split(',')])
    if len(input_numbers) != 6:
        raise ValueError
except:
    print("❌ 입력 형식 오류: 정확히 6개의 숫자를 입력하세요.")
    exit()

input_tuple = tuple(input_numbers)

# ✅ 1등 여부 검사
is_first = input_tuple in first_prize_numbers

result_message = f"입력 번호: {input_numbers}\n기존 1등 여부: {'⭕ 1등 번호였음' if is_first else '❌ 1등 번호 아니었음'}"

print("\n✅ 입력 번호 검사 결과:")
print(result_message)

# ✅ 결과 파일 저장
with open('입력체크결과.txt', 'w', encoding='utf-8') as f:
    f.write(result_message)

print("\n📄 입력체크결과.txt 저장 완료")
