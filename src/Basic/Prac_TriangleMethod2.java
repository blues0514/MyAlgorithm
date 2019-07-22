package Basic;

import java.util.Scanner;

public class Prac_TriangleMethod2 {

    // 왼쪽 아래가 직각인 이등변 삼각형 출력
    static void triangleLB(int n) {
        for (int i =1; i<=n ; i++){
            for(int j =1; j<=i ; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    //왼쪽 위가 직각인 이등변 삼각형을 출력
    static void triangleLU(int n) {
        for (int i = 1; i<=n ; i++){ // 3번 반복
            for (int j= n; j>=i ; j--){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    //오른쪽 위가 직각인 이등변 삼각형을 출력
    static void triangleRU(int n) {
        for (int i = 1; i <= n; i++) { 				// i행 (i = 1, 2, … ,n)
            for (int j = 1; j <= i - 1; j++) 		// i-1개의 ' '를 나타냄
                System.out.print(' ');
            for (int j = 1; j <= n - i + 1; j++) 	// n-i+1개의 '*'를 나타냄
                System.out.print('*');
            System.out.println();					// 개행(줄변환)
        }

    }

    //오른쪽 아래가 직각인 이등변 삼각형을 출력
    static void triangleRB(int n){
        for (int i = 1; i <= n; i++) { 				// i행 (i = 1, 2, … ,ln)
            for (int j = 1; j <= n - i; j++) 		// n-i개의 ' '를 나타냄
                System.out.print(' ');
            for (int j = 1; j <= i; j++) 			// i개의 '*'를 나타냄
                System.out.print('*');
            System.out.println(); 					// 개행(줄변환)
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

        triangleLU(num);
        System.out.println();
        triangleLB(num);
        System.out.println();
        triangleRU(num);
        System.out.println();
        triangleRB(num);
    }

}
