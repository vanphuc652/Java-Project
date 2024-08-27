
package baitap3;

import java.util.Arrays;
import java.util.Scanner;

public class Lecture5_Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu trong mang: ");
        int numbers = scanner.nextInt();
        int[] t = new int[numbers];
        for (int i=0; i<numbers; i++) {
            System.out.println("Nhap vao so thu " + i + ":");
            t[i] = scanner.nextInt();
        }
        Arrays.sort(t);
        System.out.println("Mang sau khi sap xep tang dan: ");
        for (int i=0; i<numbers; i++) {
               System.out.println(t[i]);
        }
    }
}
