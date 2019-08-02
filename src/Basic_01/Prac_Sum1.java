package Basic_01;

import java.util.Scanner;

public class Prac_Sum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n까지의 합");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1 ; i <=n ; i++) {
            if(i<n)
                System.out.print(i + " + ");
            else
                System.out.print(i);
            sum+=i;
        }
        System.out.println(" = " + sum);
    }
}
