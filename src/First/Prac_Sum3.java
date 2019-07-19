package First;

import java.util.Scanner;

public class Prac_Sum3 {

    static int sumof(int a, int b) {
        int sum = 0;
        if (a > b) {
            for (int i = b; b <= a; b++) {
                sum += b;
            }
        } else {
            for (int i = a; a <= b; a++) {
                sum += a;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 2개를 입력하세요");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println("두 수 사이의 정수들의 합 : " + sumof(x, y));
    }
}
