package First;

import java.util.Scanner;

public class SumForPos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합");

        do {
            System.out.println("정수를 입력하세요");
            n = scanner.nextInt();
        } while (n <= 0); // n이 음수가 입력되는 동안 반복 (음수를 입력받지 않도록 한다.)

        int sum = 0;

        for (int i = 1; i <= n; i++)
            sum += i;


        System.out.println(sum);
    }
}
