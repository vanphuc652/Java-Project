
package baitap3;

import java.util.Random;
import java.util.Scanner;

public class Lecture5_Bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String y;
        do {
            int s = rand.nextInt(100) + 1;
            System.out.println("Kiem tra: ");
            y = scanner.next();
            if (s%2==0) {
                System.out.println(s + " la so chan");
            } else {
                System.out.println(s + " la so le");
            }
        }
        while (y.equals("co"));
        System.out.println("*Ket thuc chuong trinh*");
    }
    
}
