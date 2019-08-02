package Data_Structure_02;

// 1,000 이하의 소수를 열거
public class PrimeNum {
    public static void main(String[] args) {
        int counter = 0; // 나눗셈 횟수

        for (int n = 2; n <= 1000; n++) {
            int i;
            for (i = 2; i < n; i++) {
                counter++;
                if (n % i == 0)
                    break; // 나누어떨어지면 소수가아님 -> 반복 불필요 (break)
            }
            if (n == i)
                System.out.println(n); // 마지막 까지 나누어떨어지지 않음
        }
        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }
}
