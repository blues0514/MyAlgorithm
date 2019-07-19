package First;

import java.util.Scanner;

// 3개의 정숫값을 입력하고 최댓값 구하기
public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("세 정수의 최댓값 ");

        System.out.println("a의 값 : ");
        int a = scanner.nextInt();
        System.out.println("b의 값 : ");
        int b = scanner.nextInt();
        System.out.println("c의 값 : ");
        int c = scanner.nextInt();

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("최댓값은 " + max);

    }
}
