package Class;

import java.util.Scanner;

//신체검사 뎅터용 클래스 배열에서 평균 키와 시력의 분포를 구함
public class PhysicalExamination {

    static final int VMAX = 21;

    static class PhyscData {
        String name; // 이름
        int height; // 키
        double vision; // 시력

        // 생성자
        PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    // 키의 평균값을 구함
    static double aveHeight(PhyscData[] dat) {
        double sum = 0;

        for (int i = 0; i < dat.length; i++)
            sum += dat[i].height;

        return sum / dat.length;
    }

    // 시력 분포를 구함
    static void distVision(PhyscData[] dat, int[] dist) {
        int i = 0;
        dist[i] = 0;
        for (i = 0; i < dat.length; i++) {
            if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0) {
                dist[(int) (dat[i].vision * 10)]++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("이준형1", 162, 0.3),
                new PhyscData("이준형2", 163, 0.5),
                new PhyscData("이준형3", 164, 0.7),
                new PhyscData("이준형4", 165, 0.9),
                new PhyscData("이준형5", 166, 1.1),
                new PhyscData("이준형6", 167, 1.3),
        };
        int[] vdist = new int[VMAX]; // 시력 분포

        System.out.println("신체 검사 리스트");
        System.out.println("이름       키   시력");
        System.out.println("-------------------");
        for (int i = 0; i < x.length; i++)
            System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);

        System.out.printf("\n평균 키 : %5.1f cm\n", aveHeight(x));

        distVision(x, vdist);

        System.out.println("\n시력 분포");
//        for (int i = 0; i < VMAX; i++)
//            System.out.printf("%3.1f~ : %2d명\n", i / 10.0, vdist[i]);
        for (int i = 0; i < VMAX; i++) {
            System.out.printf("%3.1f~ : ", i / 10.0);
            for (int j = 0; j < vdist[i]; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
