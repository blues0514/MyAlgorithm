package Queue_Stack_04;

import java.util.Scanner;

public class IntStackTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntStack s = new IntStack(64); // 최대 64개를 푸시할 수 있는 스택

        while (true) {
            System.out.println("현재 데이터 수 : " + s.size() + " / " + s.capacity());
            System.out.print("(1) 푸시 (2) 팝 (3) 피크 (4) 덤프 (5) 클리어 (6) indexOf (7)isEmpty (8) isFull (0) 종료 : ");

            int menu = scanner.nextInt();
            if (menu == 0) break;

            int x;
            switch (menu) {
                case 1: // 푸시
                    System.out.print("데이터 : ");
                    x = scanner.nextInt();
                    try {
                        s.push(x);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;

                case 2: // 팝
                    try {
                        x = s.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 3: // 피크
                    try {
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 4: // 덤프
                    s.dump();
                    break;

                case 5: // 클리어
                    System.out.println("데이터를 모두 삭제 합니다.");
                    s.clear();
                    break;

                case 6: // indexOf
                    System.out.print("데이터 : ");
                    x = scanner.nextInt();
                    try {
                        System.out.println("해당 데이터는 stk[" + s.indexOf(x) + "]에 있습니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 7: // isEmpty
                    if (s.isEmpty() == true) System.out.println("스택이 비어 있습니다.");
                    else System.out.println("스택이 비어있지 않습니다.");
                    break;

                case 8: // isFull
                    if (s.isFull() == true) System.out.println("스택이 가득 차있습니다.");
                    else System.out.println("스택이 가득 차있지 않습니다.");
                    break;
            }
        }
    }
}
