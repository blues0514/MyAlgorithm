package Basic;

import java.util.Scanner;

public class Prac_Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("양의 정수 자릿수 구하기");
        int n;
        do {
            System.out.print("정수 값 :");
            n = scanner.nextInt();
        } while (n < 0);

        int dig = 0;

        while (n > 0) {
            n /= 10;
            dig++;
        }
        System.out.println("입력한 정수의 자릿수는 " + dig + "자리 입니다.");
    }
}
