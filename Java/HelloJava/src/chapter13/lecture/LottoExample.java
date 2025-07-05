package chapter13.lecture;

import java.util.*;

public class LottoExample {
    public static void main(String[] args) {
        Random rand = new Random();

        Set lottoNumbers = new HashSet();

        while (lottoNumbers.size() < 6) {
            int lottoNumber = 1 + rand.nextInt(45);
            lottoNumbers.add(lottoNumber);
        }

        System.out.println("Set: " + lottoNumbers);

        List<Integer> lottoList = new ArrayList<Integer>(lottoNumbers);

        Collections.sort(lottoList);

        System.out.println("Sorted List : " + lottoList);
    }
}
