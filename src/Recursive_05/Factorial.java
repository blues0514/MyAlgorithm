package Recursive_05;

import java.util.Scanner;

// 팩토리얼을 재귀적으로 구현
public class Factorial {
    //양의 정수 n의 팩토리얼을 반환
    static int factorial(int n) {
        if (n > 0)
            return n * factorial(n - 1);
        else
            return 1;
    }

    // 재귀 사용 x
    static int factorial2(int n) {
        int result = 1;
        while(n>0){
            result *=n;
            n--;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        do {
            System.out.print("정수를 입력하세요 : ");
            x = scanner.nextInt();
        } while (x <= 0);

        System.out.println(x + "의 팩토리얼은 " + factorial2(x) + "입니다.");

    }
}
