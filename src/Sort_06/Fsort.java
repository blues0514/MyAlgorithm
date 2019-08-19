package Sort_06;

import java.util.Scanner;

/*
도수 정렬
1단계 : 도수분포표 만들기
2단계 : 누적도수분포표 만들기
3단계 : 목적 배열 만들기
4단계 : 배열 복사하기기

데이터의 비교, 교환 작업이 필요 없어 매우 빠르다.
단일 for문만을 사용하여 재귀 호출, 이중 for문 없어 아주 효율적인 알고리즘
도수분포표가 필요하기 때문에 데이터의 최솟갑소가 최댓값을 미리 알고 있는 경우에만
사용할 수 있다.
각 단계(for문)에서 배열 요소를 건너뛰지 않고 순서대로 스캔하기 때문에 값은 값에 대해서
순서가 바뀌는 일이 없어 '안정적'이다.
 */
public class Fsort {
    // 0이상 max이하의 값을 입력합니다.
    static void fSort(int[] a, int n, int max) {
        int[] f = new int[max + 1]; // 누적 도수
        int[] b = new int[n]; // 작업용 목적 배열

        System.out.println("1단계：도수분포표 만들기"); // 1단계
        for (int i = 0; i < n; i++) {
            for (int k = 0; k <= max; k++)
                System.out.printf("%3d", f[k]);
            System.out.println();
            f[a[i]]++;
        }
        for (int k = 0; k <= max; k++)
            System.out.printf("%3d", f[k]);
        System.out.println();

        System.out.println("2단계：누적도수분포표 만들기"); // 2단계
        for (int i = 1; i <= max; i++) {
            for (int k = 0; k <= max; k++)
                System.out.printf("%3d", f[k]);
            System.out.println();
            f[i] += f[i - 1];
        }
        for (int k = 0; k <= max; k++)
            System.out.printf("%3d", f[k]);
        System.out.println();

        System.out.println("3단계：정렬"); // 3단계
        for (int i = n - 1; i >= 0; i--) {
            for (int k = 0; k < n; k++)
                System.out.printf("%3d", b[k]);
            System.out.println();
            b[--f[a[i]]] = a[i];
        }
        for (int k = 0; k < n; k++)
            System.out.printf("%3d", b[k]);
        System.out.println();

        for (int i = 0; i < n; i++)
            a[i] = b[i]; // 4단계
    }

    // 도수정렬(배열 요솟값은 min 이상 max이하)
    static void fSort(int[] a, int n, int min, int max) {
        int[] f = new int[max - min + 2]; // 누적도수
        int[] b = new int[n]; // 작업용 목적배열

        for (int i = 0; i < n; i++)
            f[a[i] - min]++; // 1단계
        for (int i = 1; i <= max - min + 1; i++)
            f[i] += f[i - 1]; // 2단계
        for (int i = n - 1; i >= 0; i--)
            b[--f[a[i] - min]] = a[i]; // 3단계
        for (int i = 0; i < n; i++)
            a[i] = b[i]; // 4단계
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("도수 정렬");
        System.out.print("요솟수 : ");
        int nx = scanner.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            do {
                System.out.print("x[" + i + "] :");
                x[i] = scanner.nextInt();
            } while (x[i] < 0);
        }

        // 34행 ~ 36행 : 배열 x의 최댓값을 구하여 max에 대입합니다.
        int max = x[0];
        for (int i = 1; i < nx; i++)
            if (x[i] > max) max = x[i];

        fSort(x, nx, max);

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "] =" + x[i]);
    }
}
