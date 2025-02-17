package chapter11.lecture;

class  SmartPhone {
    private String company;
    private String os;

    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }

    @Override
    public String toString() {
        return company + "사의 " + os + "스마트폰입니다.";
    }
}

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("구글", "안드로이드");

        String strObj = myPhone.toString();

        System.out.println(strObj);
        System.out.println(myPhone);
    }
}
