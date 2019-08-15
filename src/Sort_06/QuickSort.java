package Sort_06;

import java.util.Scanner;

/*
일반적으로 사용되는 아주 빠른 정렬 알고리즘
그룹을 나누는 기준 : 피벗 ( pivot)
각 그룹에 대해 피벗 설정과 그룹 나눔을 반복하며 모든 그룹이 1명이 되면 정렬을 마침
 */
public class QuickSort {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 퀵 정렬
    static void quickSort(int[] a, int left, int right) {
        int pl = left; // 왼쪽 커서
        int pr = right; // 오른쪽 커서
        int x = a[(pl + pr) / 2]; // 피벗

        System.out.printf("a[%d]~a[%d] : {", left, right);
        for ( int i = left ; i < right; i++)
            System.out.printf("%d , ", a[i]);
        System.out.printf("%d}\n", a[right]);

        do {
            while (a[pl] < x) pl++;
            while (a[pr] > x) pr--;
            if (pl <= pr)
                swap(a, pl++, pr--);
        } while (pl <= pr);

        if (left < pr) quickSort(a, left, pr);
        if (pl < right) quickSort(a, pl, right);
    }

    static void quickSort2(int[] a, int n) {
        quickSort(a, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("퀵 정렬");
        System.out.print("요솟수 : ");
        int nx = scanner.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }
        //quickSort(x, 0, nx - 1);
        quickSort2(x, nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "] : " + x[i]);
    }
}
