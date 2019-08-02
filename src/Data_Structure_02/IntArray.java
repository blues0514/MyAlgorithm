package Data_Structure_02;

public class IntArray {
    public static void main(String[] args) {
        int a[] = new int[5];

        a[1] =39;
        a[2] =33;
        a[4] = a[1] *2;

        for(int i = 0 ; i<5; i++){
            System.out.println("a[" + i + "] : " + a[i]);
        }
    }
}
