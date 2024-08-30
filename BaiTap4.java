
package baitap4;

import java.util.Scanner;

public class BaiTap4 {
    
    public static float[] importData (float[] arrays) {
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i < arrays.length; i++) {
            System.out.println("Nhap phan tu thu " + (i+1) + ":");
            arrays[i] = scanner.nextFloat();
        }
        return arrays;
    }
    
    public static void printData (float[] arrays) {
        System.out.println("Noi dung mang:");
        for (int i=0; i<arrays.length; i++) {
            System.out.println(arrays[i] + " ");
        }
        System.out.println();
    }
    
    public static float findMax2 (float[] arrays) {
        float max = Float.MIN_VALUE;
        float max2 = Float.MIN_VALUE;
        for (int i=0; i < arrays.length; i++) {
            if (arrays[i] > max) {
                max2 = max;
                max = arrays[i];
            } else if (arrays[i] > max2 && arrays[i] != max) {
                max2 = arrays[i];
            }
        }
        return max2;
    }

    public static float[] deleteOldNumber (float[] arrays) {
        int countEven = 0;
        for (int i=0; i < arrays.length; i++) {
            if (arrays[i]%2==0) countEven++;
        }
        float[] arraysEven = new float[countEven];
        int index = 0;
        for (int i=0; i < arrays.length; i++) {
            if (arrays[i]%2==0) {
                arraysEven[index++] = arrays[i];
            }
        }
        return arraysEven;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu mang:");
        int size = scanner.nextInt();
        float[] arrays = new float[size];
        arrays = importData(arrays);
        printData(arrays);
        float secondLargestNumber = findMax2(arrays);
        System.out.println("Phan tu lon thu 2 trong mang:" + secondLargestNumber);
        System.out.println("Mang sau khi xoa so le:");
        float[] arraysEven = deleteOldNumber(arrays);
        printData(arrays);
    }
    
}
