package Sort_06;

import java.util.Scanner;

/*단순 삽입 정렬
값이 가장 작은 요소를 선핵해 알맞은 위치로 옮긴다
아직 정렬되지 않은 부분의 첫 번째 요소를 정렬된 부분의 알맞은 위치에 삽입
요소 수가 n개 일떄 수행 횟수 : n -1 회

떨어져 있는 요소들이 서로 뒤바뀌지 않아
'안정적 이다.'
비교 횟수와 교환 횟수 : n^2/2 회

--------------------
세 가지 단순 정렬 ( 버블, 선택, 삽입 )의 시간 복잡도는 모두 O(n^2) --> 효율이 좋지 않다.
 */
public class InsertionSort {
    static void insertionSort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            int j;
            int tmp = a[i];
            for (j = i; j > 0 && a[j - 1] > tmp; j--)
                a[j] = a[j - 1];
            a[j] = tmp;
        }
    }

    // 단순삽입정렬(보초법：배열의 머리요소는 비어있습니다.)
    static void selectionSort_Sen(int[] a, int n) {
        for (int i = 2; i < n; i++) {
            int tmp = a[0] = a[i];
            int j = i;
            for (; a[j - 1] > tmp; j--)
                a[j] = a[j - 1];
            if (j > 0)
                a[j] = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("단순 삽입 정렬");
        System.out.print("요솟수 : ");
        int nx = scanner.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        insertionSort(x, nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] : " + x[i]);
        }
    }
}
