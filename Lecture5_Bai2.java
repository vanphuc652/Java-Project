
package baitap3;

import java.util.Scanner;

public class Lecture5_Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu trong mang: ");
        int numbers = scanner.nextInt();
        int[] t = new int[numbers];
        for (int i=0; i<numbers; i++) {
            System.out.println("Nhap vao so thu " + i + ":");
            t[i] = scanner.nextInt();
        }
        int max=t[0];
        for (int i=0; i<numbers; i++) {
            if (max<t[i]) max=t[i];
        }
        System.out.println("Gia tri lon nhat: " + max);
        int min=t[0];
        for (int i=0; i<numbers; i++) {
            if (min>t[i]) min=t[i];
        }
        System.out.println("Gia tri nho nhat: " + min);
    }
}
