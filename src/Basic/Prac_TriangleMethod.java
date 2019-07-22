package Basic;

import java.util.Scanner;

public class Prac_TriangleMethod {

    // 왼쪽 아래가 직각인 이등변 삼각형 출력
    static void triangleLB(int n) {
        for (int i =1; i<=n ; i++){
            for(int j =1; j<=i ; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("삼각형 만들기");
        do{
            System.out.println("양의 정수를 입력하세요");
            num = scanner.nextInt();
        } while (num <=0);

        triangleLB(num);
    }
}
