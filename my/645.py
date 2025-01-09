import pandas as pd

# 엑셀 파일 경로 설정
file_path = 'C:/main/Lotto-645.xlsx'

# 엑셀 파일 읽기
df = pd.read_excel(file_path)

# 4행부터 1136행까지 N열부터 S열까지 추출 (0-based index로 3부터 시작)
numbers_df = df.iloc[3:1136, 13:19]

# 열 이름을 번호로 변경 (기존 열 이름이 모두 Unnamed로 되어 있어서 이해하기 쉽게 변경)
numbers_df.columns = ['1', '2', '3', '4', '5', '6']

# NaN 값을 제거하기 위해 모든 값을 정수로 변환
numbers_df = numbers_df.dropna().astype(int)

# 확인하려는 숫자 리스트들
check_numbers_list = [
    [8, 14, 27, 33, 39, 42],
    [22, 16, 11, 33, 44, 2],
    [5, 6, 13, 27, 40, 41],
    [12, 22, 23, 37, 38, 42],
    [2 ,12 ,16 ,18 ,36 ,42],
    [4, 21, 24, 35, 42, 44],
    [8,13,25,39,42,45]
]

# 결과 저장
results = []

# 각 숫자 리스트에 대해 처리
for check_numbers in check_numbers_list:
    matching_rows = []
    for i, row in numbers_df.iterrows():
        if set(check_numbers) == set(row.values):  # 모든 숫자가 동일하면
            matching_rows.append((i + 4, '1st'))  # 행 번호와 '1st' 추가
        elif len(set(check_numbers) & set(row.values)) == 5:  # 5개의 숫자가 일치하는 경우
            matching_rows.append((i + 4, '3rd', list(set(check_numbers) & set(row.values))))  # 행 번호, '3rd', 일치하는 숫자들 추가
        elif len(set(check_numbers) & set(row.values)) == 4:  # 4개의 숫자가 일치하는 경우
            matching_rows.append((i + 4, '4th', list(set(check_numbers) & set(row.values))))  # 행 번호, '4th', 일치하는 숫자들 추가
    results.append((check_numbers, matching_rows))

# 결과 출력
for check_numbers, matches in results:
    print(f"체크 숫자: {check_numbers}")
    if matches:
        for result in matches:
            print(f"  행 번호: {result[0]}, 등수: {result[1]}, 중복된 숫자: {result[2] if len(result) > 2 else 'N/A'}")
    else:
        print("  일치하는 행이 없습니다.")
