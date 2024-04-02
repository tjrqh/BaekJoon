package april.a02;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 백준 1546문제
 * <br>
 * 평균 구하기
 * <br>
 * <p>
 * 수학에서 분배법칙을 이용하여(점수가 3개라는 가정)
 * <br>
 * MAX = 최고 점수
 * <br>
 * A, B, C = 각 점수
 * <br>
 * (A/MAX*100 + B/MAX*100 + C/MAX*100) /3 에서
 * <br>
 * (A+B+C)*100/MAX/3 으로 계산식을 바꾸어 코드 작성
 * </p>
 */
public class Bj1546 {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        List<Double> averageList = new ArrayList<>();
        int a = sc.nextInt();
        double sum =0;


        for(int i = 0; i<a; i++){
            int b = sc.nextInt();
            list.add(b);
        }
        Collections.sort(list);
        int maxInt = list.get(a-1);
        for(int i=0; i<a; i++){
            double reTouchNumber = (double) list.get(i) /maxInt*100;
            averageList.add(reTouchNumber);
            sum += averageList.get(i);
        }
        System.out.println(sum/a);

    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int maxValue = Integer.MIN_VALUE;
        int sum = 0;
        for (int i =0; i< a; i++){
            int b = sc.nextInt();
            if(maxValue< b){
                maxValue = b;
            }
            sum += b;
        }
        double result = (double) (sum * 100) /maxValue/a;
        System.out.println(result);
    }

}
