package Sort_06;

import Queue_Stack_04.IntStack;

import java.util.Scanner;

public class Prac_QuickSort {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void quickSort(int[] a, int left, int right) {
        IntStack lstack = new IntStack(right - left + 1);
        IntStack rstack = new IntStack(right - left + 1);

        lstack.push(left);
        rstack.push(right);

        while (lstack.isEmpty() != true) {
            int pl = left = lstack.pop();
            int pr = right = rstack.pop();
            int x = a[(left + right) / 2];

            do {
                while (a[pl] < x) pl++;
                while (a[pr] > x) pr--;
                if (pl <= pr)
                    swap(a, pl++, pr--);
            } while (pl <= pr);

            if (pr - left < right - pl) {
                int temp;
                temp = left;
                left = pl;
                pl = temp;
                temp = right;
                right = pr;
                pr = temp;
            }

            if (left < pr) {
                lstack.push(left);
                rstack.push(pr);
            }
            if (pl < right) {
                lstack.push(pl);
                rstack.push(right);
            }
        }
    }

    static void quickSort2(int[] a, int n) {
        if (n <= 9)
            InsertionSort.insertionSort(a, n);
        else
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
