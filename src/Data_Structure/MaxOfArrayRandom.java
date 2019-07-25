package Data_Structure;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRandom {
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) max = a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("키의 최댓값");
        int num = random.nextInt(11);
        System.out.println("사람 수 (10이하의 난수) \n" + num); // 사람 수를 난수로 설정
        //int num = scanner.nextInt(); // 사람 수를 키보드 값을 입력 받음


        int[] height = new int[num];

        System.out.println("키 값 ");
        for ( int i =0; i<num; i++) {
            height[i] = 100 + random.nextInt(90); // random.nextInt(n) -> 0 부터 n-1까지의 난수
            System.out.println("height[" + i + "] : " + height[i]);
        }

        System.out.println("최대 키는 :" + maxOf(height));
    }
}
