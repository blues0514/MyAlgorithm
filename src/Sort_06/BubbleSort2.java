package Sort_06;

import java.util.Scanner;

public class BubbleSort2 {
    //a[idx1]와 a[idx2]의 값을 바꿉니다.
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 버블 정렬
    static void bubbleSort(int[] a, int n) { // a : 배열 , n : 요솟수
        for (int i = 0; i < n - 1; i++) {
            int exchg = 0;
            for (int j = n - 1; j > i; j--)
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    exchg++;
                }
            if (exchg == 0) break;
        }
    }

    static void bubbleSort_print(int[] a, int n) {
        int ccnt = 0; // 비교 횟수
        int scnt = 0; // 교환 횟수

        for (int i = 0; i < n - 1; i++) {
            int exchg = 0;
            System.out.printf("패스%d：\n", i + 1);
            for (int j = n - 1; j > i; j--) {
                for (int m = 0; m < n - 1; m++)
                    System.out.printf("%3d %c", a[m], (m != j - 1) ? ' ' : (a[j - 1] > a[j] ? '+' : '-'));
                System.out.printf("%3d\n", a[n - 1]);

                ccnt++;
                if (a[j - 1] > a[j]) {
                    scnt++;
                    swap(a, j - 1, j);
                    exchg++;
                }
            }
            for (int m = 0; m < n; m++)
                System.out.printf("%3d  ", a[m]);
            System.out.println();

            if (exchg == 0) break;
        }

        System.out.println("비교를 " + ccnt + "회 했습니다.");
        System.out.println("교환을 " + scnt + "회 했습니다.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("버블 정렬(버전2)");
        System.out.print("요솟수 : ");
        int nx = scanner.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        bubbleSort_print(x, nx);

//        System.out.println("오름차순으로 정렬했습니다.");
//        for (int i = 0; i < nx; i++)
//            System.out.println("x[" + i + "] = " + x[i]);
    }
}
