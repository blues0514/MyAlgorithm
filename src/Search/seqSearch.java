package Search;

import java.util.Scanner;

/*
 선형 검색
 배열의 요솟수가 n개 일때 검색 실패,성공 판단하는 횟수 평균 n/2회
 원하는 값이 배열에 존재하지 않을 때, 실패의 경우 n+1회 , 성공의 경우 n회
 */
public class seqSearch {

    // 요솟수가 n인 배열 a에서 key와 같은 요소를 선형 검색
    static int seqSearch(int[] a, int n, int key) {
        int i = 0; // 인덱스 번호

        while (true) {
            if (i == n) return -1; // 검색 실패( -1 반환)
            if (a[i] == key) return i; // 검색 성공( i 반환)
            i++;
        }
    }

    // for문을 이용 -> while문 보다 문장의 길이가 비교적 짧아진다.
    static int seqSearch2(int[] a, int n, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) return i; // 검색 성공
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scanner.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        System.out.print("검색할 값 : "); // 키 값 입력
        int ky = scanner.nextInt();
        int idx = seqSearch2(x, num, ky); // 배열 x에서 키 값이 ky인 요소를 검색

        if (idx == -1) System.out.println("그 값의 요소가 없습니다.");
        else System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
    }
}
