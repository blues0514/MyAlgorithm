package First;

import java.util.Scanner;

//3개의 정숫값을 입력하고 중앙값을 구한 다음 출력
public class Median {

    static int med3(int a, int b, int c) {
        if (a >= b)
            if (b >= c)
                return b;
            else if (a <= c)
                return a;
            else
                return c;
        else if (a > c)
            return a;
        else if (b > c)
            return c;
        else
            return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("3개의 값을 입력하세요");
        System.out.println("a의 값 : ");
        int a = scanner.nextInt();
        System.out.println("b의 값 : ");
        int b = scanner.nextInt();
        System.out.println("c의 값 : ");
        int c = scanner.nextInt();

        System.out.println("중앙 값 : " + med3(a, b, c));
    }
}
