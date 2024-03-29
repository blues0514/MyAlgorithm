package Search_08;

import java.util.Scanner;

//브루트-포스법으로 문자열을 검색하는 프로그램
public class BFmatch {
    //브루트-포스법으로 문자열을 검색하는 메서드
    static int bfMatch(String txt, String pat) {
        int pt = 0; // txt 커서
        int pp = 0; // pat 커서

        while (pt != txt.length() && pp != pat.length()) {
            if (txt.charAt(pt) == pat.charAt(pp)) {
                pt++;
                pp++;
            } else {
                pt = pt - pp + 1;
                pp = 0;
            }
        }
        if (pp == pat.length()) // 검색 성공
            return pt - pp;
        return -1; // 검색 실패
    }

    static int bfMatch_print(String txt, String pat) {
        int pt = 0; // txt를 따라가는 커서
        int pp = 0; // pat를 따라가는 커서
        int count = 0; // 비교횟수
        int k = -1;

        while (pt != txt.length() && pp != pat.length()) {
            if (k == pt - pp)
                System.out.print("    ");
            else {
                System.out.printf("%2d ", pt - pp);
                k = pt - pp;
            }
            for (int i = 0; i < txt.length(); i++)
                System.out.print(txt.charAt(i) + " ");
            System.out.println();

            for (int i = 0; i < pt * 2 + 4; i++)
                System.out.print(" ");
            System.out.print(txt.charAt(pt) == pat.charAt(pp) ? '+' : '|');
            System.out.println();

            for (int i = 0; i < (pt - pp) * 2 + 4; i++)
                System.out.print(" ");

            for (int i = 0; i < pat.length(); i++)
                System.out.print(pat.charAt(i) + " ");
            System.out.println();
            System.out.println();
            count++;

            if (txt.charAt(pt) == pat.charAt(pp)) {
                pt++;
                pp++;
            } else {
                pt = pt - pp + 1;
                pp = 0;
            }
        }
        System.out.printf("비교는 %d회 였습니다.\n", count);
        if (pp == pat.length()) // 검색 성공
            return pt - pp;
        return -1; // 검색 실패
    }

    //패턴이 여러개 있을때 가장 앞쪽이 아닌 가장 뒤쪽의 인덱스를 반환하는 메서드
    static int bfMatchLast(String txt, String pat) {
        int pt = txt.length();
        int pp = pat.length();

        while (pt >= 0 && pp >= 0) {
            if (txt.charAt(pt) == pat.charAt(pp)) {
                pt--;
                pp--;
            } else {
                pt = pt + (pat.length() - pp) - 2;
                pp = pat.length() - 1;
            }
        }
        if (pp < 0) //검색성공
            return pt + 1;
        return -1; // 검색실패
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("텍스트 : ");
        String s1 = scanner.next(); // 텍스트용 문자열

        System.out.print("패턴 : ");
        String s2 = scanner.next(); // 패턴용 문자열

        int idx = bfMatch_print(s1, s2); // 문자열 s1에서 문자열 s2를 검색

        if (idx == -1)
            System.out.println("텍스트에 패턴이 없습니다.");
        else {
            // 일치하는 문자 바로 앞까지의 길이를 구합니다.
            int len = 0;
            for (int i = 0; i < idx; i++)
                len += s1.substring(i, i + 1).getBytes().length;
            len += s2.length();

            System.out.println((idx + 1) + "번째 문자부터 일치합니다.");
            System.out.println("텍스트 : " + s1);
            System.out.printf(String.format("패턴 : %%%ds\n", len), s2);
        }
    }
}
