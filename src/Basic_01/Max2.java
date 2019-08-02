package Basic_01;

// 3개의 정숫값 가운데 최댓값을 구하여 출력
public class Max2 {

    // 생성자 이용
    public Max2(int a, int b, int c) {
        int max =a;
        if(b>max) {
            max = b;
        }
        if(c>max) {
            max = c;
        }
        System.out.println("최댓값은 " + max);
    }

    // 메소드 생성
    // int형 매개변수 a,b,c의 값을 받아 최댓값을 구하고 그것을 int형 값으로 반환하는 메소드
    static int MAX(int a, int b, int c) {
        int max =a;
        if(b>max) {
            max = b;
        }
        if(c>max) {
            max = c;
        }
        return max;
    }
    public static void main(String[] args) {
        Max2 max2 = new Max2(2,3,4);
        System.out.println(MAX(5,6,7));
    }
}
