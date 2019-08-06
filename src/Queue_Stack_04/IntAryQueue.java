package Queue_Stack_04;

public class IntAryQueue {
    private int max;  // 큐 용량
    private int num; // 현재 데이터 수
    private int[] que; // 큐 본체

    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {
        }
    }

    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {
        }
    }

    public IntAryQueue(int capacity) {
        max = capacity;
        num = 0;
        try {
            que = new int[num];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int enque(int x) throws OverflowIntQueueException {
        if (num >= max)
            throw new OverflowIntQueueException();
        que[num++] = x;
        return x;
    }

    public int deque() throws EmptyIntQueueException {
        if (num <= 0)
            throw new EmptyIntQueueException();
        int x = que[num--];
        return x;
    }

    // 큐에서 데이터를 디큐
//    public int deque() throws EmptyIntAryQueueException {
//        if (num <= 0)
//            throw new EmptyIntAryQueueException(); // 큐가 비어 있음
//        int x = que[0];
//        for (int i = 0; i < num - 1; i++)
//            que[i] = que[i + 1];
//        num--;
//        return x;
//    }

    public int peek() throws EmptyIntQueueException {
        if (num <= 0)
            throw new EmptyIntQueueException();
        return que[num - 1];
    }

    public int indexOf(int x) {
        for (int i = 0; i < num; i++)
            if (que[i] == x)
                return i; // 검색 성공
        return -1; // 검색 실패
    }

    public void clear() {
        num = 0;
    }

    public int capacity() {
        return max;
    }

    public int size() {
        return num;
    }

    public boolean isEmpty() {
        return num <= 0;
    } // 참이면 true , 거짓이면 false 반환

    public boolean isFull() {
        return max <= num;
    }

    public void dump() {
        if (num <= 0)
            System.out.println("큐가 비어 있습니다.");
        else {
            for (int i = 0; i < num; i++)
                System.out.print(que[i] + " ");
            System.out.println();
        }
    }
}
