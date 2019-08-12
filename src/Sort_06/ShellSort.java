package Sort_06;

import java.util.Scanner;

/*
셸 정렬
단순 삽입 정렬의 장점 (정렬을 마쳤거나 정렬을 맟니 상태에 가까우면 정렬 속도가 매우 빨라진다.)
단점 ( 삽입할 위치가 멀리 떨어져 있으면 이동(대입)해야 하는 횟수가 많아진다.)은 보완한 정렬 알고리즘

정렬할 배열의 요소를 그룹으로 나눠 각 그룹별로 단순 삽입 정렬을 수행하고, 그 그룹을 합치면서 정렬을 반복하여 요소의
이동횟수를 줄이는 방법
시간 복잡도 : O(n^1.25)
안정적이지는 않다.
 */
public class ShellSort {
    static void shellSort(int[] a, int n) {
        int count=0; // 옮김 횟수
        for (int h = n / 2; h > 0; h /= 2)
            for (int i = h; i < n; i++) {
                int j;
                int tmp = a[i];
                for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
                    a[j + h] = a[j];
                    count++;
                }
                a[j + h] = tmp;
                count++;
            }

        System.out.println("옮김 횟수 : " + count);
    }

    static void shellSort2(int[] a, int n) {
        int count = 0;
        int h;
        for (h = 1; h < n / 9; h = h * 3 + 1) ;

        for (; h > 0; h /= 3)
            for (int i = h; i < n; i++) {
                int j;
                int tmp = a[i];
                for (j = i - h; h >= 0 && a[j] > tmp; j -= h) {
                    a[j + h] = a[j];
                    count++;
                }
                a[j + h] = tmp;
                count++;
            }
        System.out.println("옮김 횟수 : " + count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("셸 정렬(버전1)");
        System.out.print("요솟수 : ");
        int nx = scanner.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        shellSort(x, nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] : " + x[i]);
        }
    }
}
