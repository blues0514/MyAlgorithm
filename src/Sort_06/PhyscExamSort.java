package Sort_06;

import java.util.Arrays;
import java.util.Comparator;

// 신체검사 데이버 배열을 정렬
public class PhyscExamSort {
    // 신체검사 데이터
    static class PhyscData {
        String name;
        int height;
        double vision;

        // 생성자

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        //신체검사 데이터를 문자열로 반환
        public String toString() {
            return name + " " + height + " " + vision;
        }

        //키 오름차순용 comparator
        static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData> {
            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.height > d2.height) ? 1 :
                        (d1.height < d2.height) ? -1 : 0;
            }
        }

        // 시력 내림차순용 comparator
        static final Comparator<PhyscData> VISION_ORDER = new VisionROrderComparator();

        private static class VisionROrderComparator implements Comparator<PhyscData> {
            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.vision < d2.vision) ? 1 : (d1.vision > d2.vision) ? -1 : 0;
            }
        }
    }

    public static void main(String[] args) {
        PhyscData[] x = {
                new PhyscData("이준형", 162, 0.3),
                new PhyscData("이준형2", 170, 0.9),
                new PhyscData("이준형3", 180, 1.2),
                new PhyscData("이준형4", 186, 1.6),
                new PhyscData("이준형5", 167, 0.6),
                new PhyscData("이준형6", 160, 1.3),
                new PhyscData("이준형7", 175, 1.0),
        };

        Arrays.sort(x, PhyscData.HEIGHT_ORDER); // 배열 x를 HEIGHT_ORDER을 사용하여 정렬 ( 오름차순 )
        //Arrays.sort(x, PhyscData.VISION_ORDER); // 배열 x를 VISION_ORDER을 사용하여 정렬 ( 내림차순 )

        System.out.println("■ 신체 검사 리스트 ■");
        System.out.println(" 이름       키        시력");
        System.out.println("--------------");
        for (int i = 0; i < x.length; i++)
            System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
    }
}
