package Basic_01;

import java.util.Scanner;

public class JudgeSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력하세요 : ");
        int a = scanner.nextInt();

        if (a > 0) {
            System.out.println("양수");
        } else if (a < 0) {
            System.out.println("음수");
        } else {
            System.out.println("Zero");
        }
    }
}
