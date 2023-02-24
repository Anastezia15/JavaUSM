package matrix;
/*Создать класс Matrix, содержащий двумерный массив nxm целого типа, организовать ввод-вывод массива,
 поиск минимального и максимального элементов. Для ввода использовать класс Scanner,
 а для вывода метод System.out.println().*/

import java.util.Scanner;

public class Matrix {

    private int n;
    private int m;
    private int[][] array;

    public Matrix() {
    }

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        array=new int[n][m];
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public void fillArray()
    {
        Scanner scan =new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j]=scan.nextInt();
            }
        }
    }

    public void printArray()
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public int minimalNumber()
    {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j]<min) min = array[i][j];
            }
        }

        return min;
    }

    public int maximalNumber()
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j]>max) max = array[i][j];
            }
        }

        return max;
    }
}
