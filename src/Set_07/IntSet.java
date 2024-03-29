package Set_07;

public class IntSet {
    private int max;
    private int num;
    private int[] set;

    // 생성자
    public IntSet(int capacity) {
        num = 0;
        max = capacity;
        try {
            set = new int[max];
        } catch (OutOfMemoryError e) { // 배열 생성 실패
            max = 0;
        }
    }

    // 집합의 최대 개수
    public int capacity() {
        return max;
    }

    //집합의 요소 개수
    public int size() {
        return num;
    }

    // 집합에서 n을 검색(index반환)
    public int indexOf(int n) {
        for (int i = 0; i < num; i++)
            if (set[i] == n)
                return i;
        return -1;
    }

    // 집합에 n이 있는지 없는지 확인
    public boolean contains(int n) {
        return (indexOf(n) != -1) ? true : false;
    }

    // 집합에 n을 추가
    public boolean add(int n) {
        if (num >= max || contains(n) == true) // 가득찼거나 이미 n이 존재
            return false;
        else {
            set[num++] = n;
            return true;
        }
    }

    // 집합에서 n을 삭제
    public boolean remove(int n) {
        int idx; // n이 저장된 요소의 인덱스

        if (num <= 0 || (idx = indexOf(n)) == -1) // 비어 있거나 n이 존재하지 않음
            return false;
        else {
            set[idx] = set[--num];
            return true;
        }
    }

    // 집합 s에 복사
    public void copyTo(IntSet s) {
        int n = (s.max < num) ? s.max : num; // 복사할 요소 개수
        for (int i = 0; i < n; i++)
            s.set[i] = set[i];
        s.num = n;
    }

    // 집합 s를 복사
    public void copyFrom(IntSet s) {
        int n = (max < s.num) ? max : s.num; // 복사할 요소 개수
        for (int i = 0; i < n; i++)
            set[i] = s.set[i];
        num = n;
    }

    //집합 s와 같은지 확인
    public boolean equalTo(IntSet s) {
        if (num != s.num)
            return false;

        for (int i = 0; i < num; i++) {
            int j = 0;
            for (; j < s.num; j++)
                if (set[i] == s.set[j])
                    break;
            if (j == s.num) // set[i]는 s에 포함되지 않음
                return false;
        }
        return true;
    }

    // 집합 s1과 s2의 합집합을 복사
    public void unionOf(IntSet s1, IntSet s2) {
        copyFrom(s1);
        for (int i = 0; i < s2.num; i++)
            add(s2.set[i]);
    }

    // "{a,b,c,}"형식의 문자열로 표현을 바꿈
    public String toString() {
        StringBuffer temp = new StringBuffer("{");
        for (int i = 0; i < num; i++)
            temp.append(set[i] + " ");
        temp.append("}");
        return temp.toString();
    }

    public boolean isEmpty() {
        if (num != 0)
            return false;
        else
            return true;
    }

    public boolean isFull() {
        if (max == num)
            return true;
        else
            return false;
    }

    public void clear() {
        if (num > 0)
            num = 0;
    }

    // 집합 s와의 합집합 구하기
    public boolean add(IntSet s) {
        boolean flag = false;
        for (int i = 0; i < num; i++)
            if (add(set[i]) == true)
                flag = true;
        return flag;
    }

    // 집합 s와의 교집합 구하기
    public boolean retain(IntSet s) {
        boolean flag = false;
        for (int i = 0; i < num; i++)
            if (s.contains(set[i]) == true)
                flag = true;
        return flag;
    }

    // 집합 s와의 차집합 구하기
    public boolean remove(IntSet s) {
        boolean flag = false;
        for (int i = 0; i < num; i++)
            if (s.contains(set[i]) == true) {
                remove(set[i]);
                flag = true;
            }
        return flag;
    }

    // 집합 s의 부분집합인지 확인
    public boolean isSubsetOf(IntSet s) {
        for (int i = 0; i < num; i++) {
            int j = 0;
            for (; j < s.num; j++)
                if (set[i] == s.set[j])
                    break;
            if (j == s.num) // set[i]는 s에 포함되지 않음
                return false;
        }
        return true;
    }
    // 집합 s의 진부분집합인지 확인
    public boolean isProperSubsetOf(IntSet s) {
        if (num >= s.num) // 요솟수가 s 이상이면
            return false; // s의 진부분집합이 아님
        return s.isSubsetOf(s);
    }

    //s1과 s2의 교집합을 복사
    public void intersectionOf(IntSet s1, IntSet s2) {
        clear();
        for (int i = 0; i < s1.num; i++)
            if (s2.contains(s1.set[i]))
                add(s1.set[i]);
    }

    // s1과 s2의 차집합을 복사사
   public void differenceOf(IntSet s1, IntSet s2) {
        clear();
        for (int i = 0; i < s1.num; i++)
            if (!s2.contains(s1.set[i]))
                add(s1.set[i]);
    }
}
