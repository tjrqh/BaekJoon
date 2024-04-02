package april.a01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 백준 2750문제
 * <br>
 * 수 정렬하기
 */

public class Bj2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list= new ArrayList<Integer>();


        int a = sc.nextInt();

        for(int i =0; i< a; i++){
            int x = sc.nextInt();
            list.add(x);
        }
        Collections.sort(list);

        for(int i =0; i<a; i++){
            System.out.println(list.get(0));
            list.remove(0);
        }
    }
}
