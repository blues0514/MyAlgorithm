package Recursive_05;

import java.util.Scanner;

// 유클리드 호제법으로 최대공약수 구하기
public class EuclidGCD {
    // 정수 x,y의 최대공약수를 구하여 반환
    static int gcd(int x, int y) {
        if (y == 0)
            return x;
        else
            return gcd(y, x % y);
    }

    // 재귀 사용 x
    static int gcd2(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    // 요솟수 n인 배열 a의 모든 요소의 최대 공약수를 구합니다.
    static int gcdArray(int a[], int start, int n) {
        if (n == 1)
            return a[start];
        else if (n == 2)
            return gcd(a[start], a[start + 1]);
        else
            return gcd(a[start], gcdArray(a, start + 1, n - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("두 정수의 최대공약수를 구합니다.");
//
//        System.out.print("정수1을 입력하세요 : ");
//        int x = scanner.nextInt();
//        System.out.print("정수2를 입력하세요 : ");
//        int y = scanner.nextInt();
//
//        System.out.println("최대공약수는 " + gcd2(x, y) + " 입니다.");

        // 배열 실핼 문장
        System.out.print("정수 몇 개의 최대 공약수를 구할까요?：");
        int num;
        do {
            num = scanner.nextInt();
        } while (num <= 1);

        int[] x = new int[num]; // 길이 num인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]：");
            x[i] = scanner.nextInt();
        }

        System.out.println("최대 공약수는 " + gcdArray(x, 0, num) + "입니다.");
    }
}
