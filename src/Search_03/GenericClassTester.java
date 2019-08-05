package Search_03;

// 제너릭 클래스 예
public class GenericClassTester {
    //제너릭 클래스의 파라미터를 T로 작성
    static class GenericClass<T> {
        private T xyz;
        GenericClass(T t) { // 생성자
            this.xyz = t;
        }
        T getXyz() {  //xyz반환
            return xyz;
        }
    }

    public static void main(String[] args) {
        GenericClass<String> s = new GenericClass<String>("ABC");
        GenericClass<Integer> n = new GenericClass<>(15);

        System.out.println(s.getXyz());
        System.out.println(n.getXyz());
    }
}
