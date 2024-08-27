
package baitap3;

import java.util.Scanner;

public class Lecture5_Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu trong mang: ");
        int numbers = scanner.nextInt();
        int[] t = new int[numbers];
        int sum=0;
        for (int i=0; i<numbers; i++) {
            System.out.println("Nhap vao so thu " + i + ":");
            t[i] = scanner.nextInt();
            sum = sum + t[i];
        }
        System.out.println("Tong cac phan tu trong mang: " + sum);
        double average = (double) sum/numbers;
        System.out.println("TB cong cac phan tu trong mang: " + average);
    }
}
