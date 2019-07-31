package Data_Structure;

import java.util.Scanner;

public class DayOfYear {
    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
    };

    // 서기 year년은 윤년인가? (운년 : 1 / 평년 : 0 )
    // 윤년 : 4로 나누어떨어지는 해
    // 평년 : 100으로 나누어떨어지고 400으로 나누어 떨어지지 않는 해 (year % 100 == 0 , year % 400 != 0)
    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    // 서기 y년 m월 d일의 연내의 남은 일 수를 구합니다.
    static int leftDayOfYear(int y, int m, int d) {
        int days = d;

        for (int i = 1; i < m; i++)
            days += mdays[isLeap(y)][i - 1];
        return 365 + isLeap(y) - days;
    }

    //서기 y년 m월 d일의 그 해 경과 일 수를 구함
    static int dayOfYear(int y, int m, int d) {
        int days = d; // 일 수

        for (int i = 1; i < m; i++)  // 1월~(m-1)월의 일 수를 더함
            days += mdays[isLeap(y)][i - 1];
        return days;
    }

    // 변수 i와 days 없이 구현
    static int dayOfYear2(int y, int m, int d) {
        while (1 < m) {
            d += mdays[isLeap(y)][m - 1];
            m--;
        }
        return d;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int retry; // 다시

        System.out.println("그 해 경과 일수를 구합니다.");

        do {
            System.out.print("년 : ");
            int year = scanner.nextInt();
            System.out.print("월 : ");
            int month = scanner.nextInt();
            System.out.print("일 : ");
            int day = scanner.nextInt();

            System.out.printf("그 해 %d일째 입니다.\n", dayOfYear2(year, month, day)); //dayOfYear(year, month, day)
            System.out.printf("그 해의 남은 일 수는 %d일 입니다\n", leftDayOfYear(year,month,day));

            System.out.print("한 번 더 할까요? (1.예 / 0.아니오) : ");
            retry = scanner.nextInt();
        } while (retry == 1);
    }
}
