package Data_Structure_02;

import java.util.Scanner;

//입력 받은 10진수를 2~36진수로 기수 변환하여 나타냄;
public class CardConvRev {

    //정숫값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 반환
    static int cardConvR(int x, int r, char[] d) {
        int digits = 0; // 변환 후의 자릿수
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUWXYZ";
        do {
            d[digits++] = dchar.charAt(x % r); // r로 나눈 나머지 저장
            x /= r;
        } while (x != 0);
        return digits;
    }
    // 정수 x를 r진수로 변환하여 배열 d에 윗자리부터 저장하고 자릿수를 반환
    static int cardConv(int x, int r, char[] d){
        int digits = 0; // 변환 후의 자릿수
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUWXYZ";
        do {
            d[digits++] = dchar.charAt(x % r); // r로 나눈 나머지 저장
            x /= r;
        } while (x != 0);

        char temp;
        for(int i =0; i<digits/2;i++){
            temp = d[i];
            d[i] = d[digits-i-1];
            d[digits-i-1] = temp;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no, cd, dno, retry; // 변환하는 정수, 기수, 변환 후의 자릿수, 다시 한 번
        char[] cno = new char[32]; // 변환 후 각 자리의 숫자를 넣어두는 문자의 배열

        System.out.println("10진수를 기수 변환");
        do {
            do {
                System.out.println("변환하는 음이 아닌 정수 : ");
                no = scanner.nextInt();
            } while (no < 0);

            do {
                System.out.println("어떤 진수로 변환할까요? (2~36) : ");
                cd = scanner.nextInt();
            } while (cd < 2 || cd > 36);

            //dno = cardConvR(no, cd, cno); // no를 cd진수로 변환
            dno = cardConv(no,cd,cno);

            System.out.print(cd + "진수로는 ");
//            for (int i = dno - 1; i >= 0; i--) // 윗자리부터 차례로 나타냄 (저장순서 반대로)
//                System.out.print(cno[i]);
//            System.out.println("입니다.");
            for ( int i = 0; i<dno ; i++) // 아랫자리부터 차례로 나타냄 (저장 순서 그대로)
                System.out.print(cno[i]);
            System.out.println("입니다.");

            System.out.println("한번 더 할까요? (1.예 / 0.아니요) : ");
            retry = scanner.nextInt();
        } while (retry == 1);
    }
}
