package Queue_Stack_04;

import java.util.Scanner;

public class IntQueueTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntQueue s = new IntQueue(64); // 최대 64개를 인큐할 수 있는 큐

        while(true) {
            System.out.println("현재 데이터 수 : " + s.size() + " / " + s.capacity());
            System.out.print("(1) 인큐 (2) 디큐 (3) 피크 (4) 덤프 (5) search (0) 종료 : ");

            int menu = scanner.nextInt();
            if (menu == 0 ) break;

            int x;
            switch (menu) {
                case 1:
                    System.out.print("데이터 :");
                    x = scanner.nextInt();
                    try {
                        s.enque(x);
                    } catch (IntQueue.OverflowIntQueueException e){
                        System.out.println("큐가 가득 찼습니다.");
                    }
                    break;

                case 2:
                    try{
                        x = s.deque();
                        System.out.println("디큐한 데이터는 " + x + "입니다.");
                    } catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;

                case 3:
                    try {
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;

                case 4:
                    s.dump();
                    break;

                case 5:
                    System.out.print("데이터 : ");
                    x = scanner.nextInt();
                    try {
                        if(s.search(x) == 0) System.out.println("해당 데이터는 존재하지 않습니다.");
                        else System.out.println("해당 데이터의 front는 " + s.search(x) + "입니다.");
                    } catch (IntQueue.EmptyIntQueueException e){
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;
            }
        }
    }
}
