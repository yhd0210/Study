package practice.homework;

import java.util.*;

public class Probllem_42576 {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        String result = solution(participant, completion);

        System.out.println(result);
    }

    public static String solution(String[] partictipant, String[] completion) {
        Map<String, Integer> nonCompletion = new HashMap<>();
        // String result = "";

        for (String name : partictipant) {
            int count = nonCompletion.getOrDefault(name, 0)+1;
            nonCompletion.put(name, count);

            // region 다른 풀이
//            if(nonCompletion.get(name) == null) {
//                nonCompletion.put(name, ++count);
//                System.out.println(name + " : " + nonCompletion.get(name));
//            } else {
//                count += nonCompletion.get(name);
//                nonCompletion.put(name, ++count);
//                System.out.println(name + " : " + (nonCompletion.get(name))+1);
//            }
            // endregion

        }

        // 완주자 배열을 순회하면서 각 참가자의 value를 감소
        for (String name : completion) {
            int count = nonCompletion.get(name) - 1;
            nonCompletion.put(name, count);
        }

        // region for문 한번더 도는 방법
//        for (String name : nonCompletion.keySet()) {
//            if (nonCompletion.get(name) == 1) {
//                result = name;
//            }
//        }
        // endregion

        System.out.println(nonCompletion);

        return nonCompletion.keySet().iterator().next();
    }
}
