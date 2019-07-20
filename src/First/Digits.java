package First;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no;

        do {
            System.out.println("2자리 양의 정수를 입력하세요");
            no = scanner.nextInt();
        } while (no < 10 || no > 99);
        // 논리 연산의 식 전체를 평가한 결과가 왼쪽 피연산자의 평가 결과만으로 정확해지는 경우 오른쪽 피연산자의 평가를 수행하지 않는데,
        // 이를 단축 평가(short circuit evaluation)라고 한다.
        //드모르간 법칙(De Morgan's laws) : 각 조건을 부정하고 논리곱을 논리합으로, 논리합을 논리곱으로 바꾸고 다시 전체를 부정하면 원래의 조건과 같다.
        // (no<10 || no>99) = !(no >=10 && no<=99) ---> 계속 조건 = !종료 조건

        System.out.println("입력한 정수 값 : " + no);
    }
}
