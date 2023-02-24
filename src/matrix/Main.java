package matrix;

public class Main {
    public static void main(String[] args) {
        Matrix arr1 = new Matrix(2,2);
        arr1.fillArray();
        System.out.println("----------------------------------------------------------");
        arr1.printArray();
        System.out.println("----------------------------------------------------------");
        System.out.println(arr1.maximalNumber());
        System.out.println("----------------------------------------------------------");
        System.out.println(arr1.minimalNumber());

    }
}