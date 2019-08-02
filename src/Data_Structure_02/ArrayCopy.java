package Data_Structure_02;

import java.util.Scanner;

public class ArrayCopy {
    // 배열 b의 모든 요소를 배열 a에 복사하는 메소드
    static void copy(int[] a, int[] b) {
        int num = a.length <= b.length ? a.length : b.length;
        for(int i = 0; i<num;i++)
            a[i] = b[i];
    }
    //배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메소드
    static void rcopy(int[] a , int[] b){
        int num = a.length<=b.length ? a.length : b.length;
        int t;
        for(int i =0; i<num/2;i++){
            t = b[i];
            b[i] = b[num-i-1];
            b[num-i-1]=t;
        }
        for(int i =0; i<num;i++){
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("배열 a의 요소 수 :");
        int na = scanner.nextInt();
        int[] a = new int[na];
        for (int i = 0; i < na; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = scanner.nextInt();
        }

        System.out.println("배열 b의 요소 수 :");
        int nb = scanner.nextInt();
        int[] b = new int[nb];
        for (int i = 0; i < nb; i++) {
            System.out.print("b[" + i + "] : ");
            b[i] = scanner.nextInt();
        }

        copy(a,b);
        System.out.println("배열 b의 요소를 배열 a에 복사했습니다.");
        for(int i =0; i<na;i++){
            System.out.println("a[" + i + "] = " + a[i]);
        }

        rcopy(a,b);
        System.out.println("배열 b의 요소를 배열 a에 역순으로 복사했습니다.");
        for(int i =0; i<na;i++){
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
