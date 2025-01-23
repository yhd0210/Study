from enum import Enum

# 은행 리스트 정의
class BankList(str, Enum):
    bank1 = "신한은행"
    bank2 = "농협"
    bank3 = "국민은행"

# 사용자 데이터베이스
user_db = [
    {"userName": "RYU", "userPW": "password123", "phone": "010-0000-0001"}
]

# 은행 사용자 데이터베이스 (계좌 정보)
bankUser_db = {
    "RYU": {"bank": BankList.bank1, "account": "0123456789", "balance": 100000}
}

# 은행 시스템 클래스
class BankSystem:
    @staticmethod
    def login(user_name, user_pw):
        for user in user_db:
            if user["userName"] == user_name and user["userPW"] == user_pw:
                print(f"로그인 성공! 환영합니다, {user_name}님.")
                return True
        print("로그인 실패: 사용자 이름 또는 비밀번호가 잘못되었습니다.")
        return False

    @staticmethod
    def register():
        print("회원가입을 진행합니다.")
        new_user_name = input("사용자 이름을 입력하세요: ")
        new_user_pw = input("비밀번호를 입력하세요: ")
        new_user_phone = input("전화번호를 입력하세요: ")

        for user in user_db:
            if user["userName"] == new_user_name:
                print("이미 존재하는 사용자 이름입니다. 다른 이름을 선택하세요.")
                return False

        while True:
            new_account = input("계좌번호를 입력하세요 (10~14자리): ")
            if 10 <= len(new_account) <= 14 and new_account.isdigit():
                break
            print("잘못된 계좌번호입니다. 10~14자리 숫자로 입력해주세요.")

        user_db.append({"userName": new_user_name, "userPW": new_user_pw, "phone": new_user_phone})
        bankUser_db[new_user_name] = {"bank": BankList.bank1, "account": new_account, "balance": 0}
        print(f"{new_user_name}님, 회원가입이 완료되었습니다. 계좌번호: {new_account}")
        return True

    @staticmethod
    def check_balance(user_name):
        if user_name in bankUser_db:
            balance = bankUser_db[user_name]["balance"]
            print(f"{user_name}님의 잔액은 {balance}원입니다.")
        else:
            print("계좌 정보를 찾을 수 없습니다.")

    @staticmethod
    def deposit(user_name, amount):
        if user_name in bankUser_db:
            bankUser_db[user_name]["balance"] += amount
            print(f"{amount}원이 입금되었습니다. 현재 잔액: {bankUser_db[user_name]['balance']}원")
        else:
            print("계좌 정보를 찾을 수 없습니다.")

    @staticmethod
    def withdraw(user_name, amount):
        if user_name in bankUser_db:
            if bankUser_db[user_name]["balance"] >= amount:
                bankUser_db[user_name]["balance"] -= amount
                print(f"{amount}원이 출금되었습니다. 현재 잔액: {bankUser_db[user_name]['balance']}원")
            else:
                print("잔액이 부족합니다.")
        else:
            print("계좌 정보를 찾을 수 없습니다.")

    @staticmethod
    def transfer(sender_name, recipient_account, amount):
        if sender_name in bankUser_db:
            sender_balance = bankUser_db[sender_name]["balance"]
            recipient = next((user for user, data in bankUser_db.items() if data["account"] == recipient_account), None)

            if recipient:
                if sender_balance >= amount:
                    bankUser_db[sender_name]["balance"] -= amount
                    bankUser_db[recipient]["balance"] += amount
                    print(f"{amount}원이 {recipient}님의 계좌로 송금되었습니다. 현재 잔액: {bankUser_db[sender_name]['balance']}원")
                else:
                    print("잔액이 부족합니다.")
            else:
                print("수취인 계좌번호를 찾을 수 없습니다.")
        else:
            print("송신자 계좌 정보를 찾을 수 없습니다.")

# 은행 시스템 실행 예제
if __name__ == "__main__":
    print("=== 은행 시스템 ===")
    while True:
        user_name = input("사용자 이름을 입력하세요: ")
        user_pw = input("비밀번호를 입력하세요: ")

        if BankSystem.login(user_name, user_pw):
            while True:
                print("\n1. 잔액 조회")
                print("2. 입금")
                print("3. 출금")
                print("4. 송금")
                print("5. 계좌번호 추가")
                print("6. 로그아웃")
                print("7. 종료")
                choice = input("원하는 작업을 선택하세요: ")

                if choice == "1":
                    BankSystem.check_balance(user_name)
                elif choice == "2":
                    amount = int(input("입금할 금액을 입력하세요: "))
                    BankSystem.deposit(user_name, amount)
                elif choice == "3":
                    amount = int(input("출금할 금액을 입력하세요: "))
                    BankSystem.withdraw(user_name, amount)
                elif choice == "4":
                    recipient_account = input("수취인 계좌번호를 입력하세요: ")
                    amount = int(input("송금할 금액을 입력하세요: "))
                    BankSystem.transfer(user_name, recipient_account, amount)
                elif choice == "5":
                    while True:
                        new_account = input("추가할 계좌번호를 입력하세요 (10~14자리): ")
                        if 10 <= len(new_account) <= 14 and new_account.isdigit():
                            bankUser_db[user_name]["account"] = new_account
                            print(f"새 계좌번호 {new_account}가 추가되었습니다.")
                            break
                        print("잘못된 계좌번호입니다. 10~14자리 숫자로 입력해주세요.")
                elif choice == "6":
                    print("로그아웃되었습니다.")
                    break
                elif choice == "7":
                    print("은행 시스템을 종료합니다. 안녕히 가세요!")
                    exit()
                else:
                    print("잘못된 선택입니다. 다시 시도하세요.")
        else:
            print("로그인에 실패했습니다.")
            print("1. 다시 로그인")
            print("2. 회원가입")
            retry_choice = input("원하는 작업을 선택하세요: ")

            if retry_choice == "1":
                continue
            elif retry_choice == "2":
                if BankSystem.register():
                    print("이제 다시 로그인해주세요.")
                else:
                    print("회원가입에 실패했습니다. 다시 시도하세요.")
            else:
                print("잘못된 선택입니다. 프로그램을 종료합니다.")
                break