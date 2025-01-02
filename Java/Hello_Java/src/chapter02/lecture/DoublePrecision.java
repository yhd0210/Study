package chapter02.lecture;

import java.math.BigDecimal;

public class DoublePrecision {
    public static void main(String[] args) {
        double dnum = 0;

        for(int i=0;i<10_000;i++){
            dnum += 0.5;
        }

        System.out.println("dnum = " + dnum);

        // 실제 현업에서는 부정확하여 정확한 계산이 필요할때 BigDecimal을 씀
        // 세금 납부 등 돈과 같은 예민한 부분에서 오차가 발생하지 않도록 방지
        BigDecimal b = new BigDecimal("10");
    }
}
