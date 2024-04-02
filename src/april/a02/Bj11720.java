package april.a02;

import java.util.*;

/**
 * 백준 11720 문제
 * <br>
 * 숫자의 합 구하기
 */
public class Bj11720 {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();


        int a = sc.nextInt();
        int result = 0;
        String[] strArr = sc.next().split("");

        for (int i = 0; i < a; i++) {
            int c = Integer.parseInt(strArr[i]);
            result = result + c;
        }
        System.out.println(result);
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String num = sc.next();
        int sum= 0;

        for (int i =0; i < a; i++){
            char c = num.charAt(i);

            sum += Character.getNumericValue(c);
        }
        System.out.println(sum);
    }
}
