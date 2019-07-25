package Data_Structure;

public class ReverseArrayProcess {

    static void swap(int[] a, int x, int y) {
        int t = a[x];
        a[x] = a[y];
        a[y] = t;
    }

    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
        }
    }

    //배열의 모든 요소의 합계를 구하여 반환하는 메소드
    static int sumOf(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    // 과정 나타내기
    public static void main(String[] args) {
        int[] x = {5, 10, 73, 2, -5, 42};
        int[] y = {1, 2, 3, 4, 5, 6};
        System.out.print("x[] = ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < x.length / 2; i++) {
            System.out.println("x[" + i + "] 과(와)" + "x[" + (x.length - i - 1) + "] 를(을) 교환합니다");
            swap(x, i, x.length - i - 1);
            for (int j = 0; j < x.length; j++) {
                System.out.print(x[j] + " ");
            }
            System.out.println();
        }
        System.out.println("역순 정렬을 마쳤습니다.");

        // sumOf 메소드를 통한 합계 값 나타내기
        System.out.print("y[] = ");
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i] + " ");
        }
        System.out.println();
        int z;
        z = sumOf(y);
        System.out.println("sumOf(y) : " + z);
    }
}
