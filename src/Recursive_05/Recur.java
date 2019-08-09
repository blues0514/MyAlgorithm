package Recursive_05;

import java.util.Scanner;

public class Recur {

    // 재귀 함수 (하향식 분석)
    static void recur(int n) {
        if (n > 0) {
            recur(n - 1);
            System.out.println(n);
            recur(n - 2);
        }
    }

    // 재귀 함수 (상향식 분석)
    static void recur2(int n) {
        if (n > 0) {
            recur2(n - 2);
            System.out.println(n);
            recur2(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = scanner.nextInt();

        recur(x);
        System.out.println("-----------------");
        recur2(x);
    }
}
