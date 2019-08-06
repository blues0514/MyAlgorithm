package Queue_Stack_04;

public class Stack_Methods {
    private int max;
    private int ptr;
    private int[] stk;

    // 스택에서 x를 찾아 인덱스(없으면 -1)를 반환
    public int indexOf(int x) {
        for (int i = ptr - 1; i >= 0; i--) // 정상 쪽에서 선형 검색
            if (stk[i] == x)
                return i; // 검색 성공
        return -1; // 검색 실패
    }

    //스택을 비움
    public void clear() {
        ptr = 0;
    }

    //스택의 용량을 반환
    public int capacity() {
        return max;
    }

    //스택에 쌓여 있는 데이터 수를 반환
    public int size() {
        return ptr;
    }

    //스택이 비어있는가?
    public boolean isEmpty() {
        return ptr <= 0;
    }

    // 스택이 가득 찼는가?
    public boolean isFull() {
        return ptr >= max;
    }

    //스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
    public void dump() {
        if (ptr <= 0)
            System.out.println("스택이 비어 있습니다.");
        else {
            for (int i = 0; i < ptr; i++)
                System.out.print(stk[i] + " ");
            System.out.println();
        }
    }
}
