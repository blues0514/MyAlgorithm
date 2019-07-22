package Basic;

import java.util.Scanner;

public class Prac_Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("사각형을 출력합니다");
        do {
            System.out.print("단수 : ");
            n = scanner.nextInt();
        } while (n < 0);

//        for(int i =1; i<=n; i++){
//            System.out.print("*****");
//            System.out.println();
//        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
