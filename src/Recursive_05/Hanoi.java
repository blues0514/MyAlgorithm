package Recursive_05;

import java.util.Scanner;

public class Hanoi {
    // no개의 원반을 x번 기둥에서 y번 기둥으로 옮김
    static void move(int no, int x, int y) {
        if (no > 1)
            move(no - 1, x, 6 - x - y);

        System.out.println("원반[" + no + "]을 " + x + "기둥에서 " + y + "기둥으로 옮김");

        if (no > 1)
            move(no - 1, 6 - x - y, y);
    }

    // 비재귀적 메소드
    static void move2(int no, int x, int y) {
        int[] xstk = new int[100];
        int[] ystk = new int[100];
        int[] sstk = new int[100]; // 스택
        int ptr = 0; // 스택 포인터
        int sw = 0;

        while (true) {
            if (sw == 0 && no > 1) {
                xstk[ptr] = x; // x의 값을 푸시
                ystk[ptr] = y; // y의 값을 푸시
                sstk[ptr] = sw; // sw의 값을 푸시
                ptr++;
                no = no - 1;
                y = 6 - x - y;
                continue;
            }

            System.out.printf("원반[%d]를 %d기둥에서 %d기둥으로 옮김\n", no, x, y);

            if (sw == 1 && no > 1) {
                xstk[ptr] = x; // x의 값을 푸시
                ystk[ptr] = y; // y의 값을 푸시
                sstk[ptr] = sw; // sw의 값을 푸시
                ptr++;
                no = no - 1;
                x = 6 - x - y;
                if (++sw == 2)
                    sw = 0;
                continue;
            }
            do {
                if (ptr-- == 0) // 스택이 텅 빔
                    return;
                x = xstk[ptr]; // 값을 저장하고 있는 x를 팝
                y = ystk[ptr]; // 값을 저장하고 있는 y를 팝
                sw = sstk[ptr] + 1; // 값을 저장하고 있는 sw를 팝
                no++;
            } while (sw == 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("하노이의 탑");
        System.out.print("원반 개수 : ");
        int n = scanner.nextInt();

        move(n, 1, 3); // 1번 기둥의 n개의 원반을 3번 기둥으로 옮김
        System.out.println("------------");
        move2(n, 1, 3);
    }
}
