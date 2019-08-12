package Sort_06;

import java.util.Scanner;

public class BinaryInsertionSort {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void binaryinsertionSort(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            int key = a[i];
            int pl = 0; // 검색범위 맨 앞의 인덱스
            int pr = i - 1; // 검색범위 맨 뒤의 인덱스
            int pc; // 〃 중앙의 인덱스
            int pd; // 삽입하는 위치의 인덱스

            do {
                pc = (pl + pr) / 2;
                if (a[pc] == key) // 검색성공
                    break;
                else if (a[pc] < key)
                    pl = pc + 1;
                else
                    pr = pc - 1;
            } while (pl <= pr);
            pd = (pl <= pr) ? pc + 1 : pr + 1;

            for (int j = i; j > pd; j--)
                a[j] = a[j - 1];
            a[pd] = key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("단순 선택 정렬");
        System.out.print("요솟수 : ");
        int nx = scanner.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        binaryinsertionSort(x, nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "] = " + x[i]);
    }
}
