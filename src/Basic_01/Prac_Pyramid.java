package Basic_01;

import java.util.Scanner;

public class Prac_Pyramid {
    static void spira(int n) {
        for (int i = 1; i <= n; i++) {                    // i행 (i = 1, 2, … ,n)
            for (int j = 1; j <= n - i + 1; j++)        // n-i+1개의 ' '를 나타냄
                System.out.print(' ');
            for (int j = 1; j <= (i - 1) * 2 + 1; j++)    // (i-1)*2+1개의 '*'를 나타냄
                System.out.print(i%10);
            System.out.println();                        // 개행(줄변환)
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("피라미드 만들기");
        do{
            System.out.println("양의 정수를 입력하세요");
            num = scanner.nextInt();
        } while (num <=0);

        spira(num);
    }
}

