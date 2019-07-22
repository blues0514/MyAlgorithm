package Basic;

import java.util.Scanner;

public class Prac_Sum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n까지의 합(가우스의 덧셈)");
        int n = scanner.nextInt();

        int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); // 합

        System.out.println(sum);
    }
}
