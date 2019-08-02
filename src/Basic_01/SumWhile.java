package Basic_01;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n(입력한 값)까지의 합");
        int n = scanner.nextInt();

        int i = 1;
        int sum = 0;

        while (i <= n) {
            sum += i;
            i++;
            System.out.println("i는 " + i + "이고, 합은" + sum);
        }

        System.out.println(sum);
    }
}
