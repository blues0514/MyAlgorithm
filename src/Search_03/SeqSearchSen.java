package Search_03;

import java.util.Scanner;

// 선형 검색(보초법)
public class SeqSearchSen {
    static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;
        a[n] = key; // 보초 추가

        while (true) {
            if (a[i] == key) break; // 검색 성공
            i++;
        }
        return i == n ? -1 : i;
    }

    // for 문을 이용한 메소드
    static int seqSearchSen2(int[] a, int n, int key) {
        int i = 0;
        a[n] = key;

        for (i = 0; a[i] != key; i++) ;

//        for (; ; ) {
//            if (a[i] == key) break;
//            i++;
//        } // for문의 무한 반복
        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scanner.nextInt();
        int[] x = new int[num + 1]; // 요솟수 num + 1

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        System.out.print("검색할 값 : "); // 키 값 입력
        int ky = scanner.nextInt();
        int idx = seqSearchSen2(x, num, ky); // 배열 x에서 키 값이 ky인 요소를 검색

        if (idx == -1) System.out.println("그 값의 요소가 없습니다.");
        else System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
    }
}

