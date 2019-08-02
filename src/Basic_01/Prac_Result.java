package Basic_01;

import java.util.Scanner;

public class Prac_Result {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        int result;

        System.out.println("a의 값 :");
        a = scanner.nextInt();
        System.out.println("b의 값 : ");
        b = scanner.nextInt();
        if(a>b){
            System.out.println("a보다 큰 값을 입력 하세요");
            System.out.println("b의 값 : ");
            b = scanner.nextInt();
        }

        result = b-a;

        System.out.println(result);
    }
}
