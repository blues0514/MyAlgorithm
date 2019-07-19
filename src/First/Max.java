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
/*
---- 구하는 과정 ----
1. max에 a 값을 넣는다.
2. b 값이 max보다 크면 max에 b값을 넣는다.
3. c 값이 max보다 크면 max에 c값을 넣는다.

--> 여러 문장(프로세스)이 순차적으로 실행되는 구조 = 순차적(concatenation) 구조
    if문 = 선택(selection) 구조
 */