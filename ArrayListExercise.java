
package baitap5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExercise {

    private static ArrayListExercise numbers;

    public static ArrayList <Integer> EnterData (ArrayList <Integer> numbers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So luong phan tu cua mang:");
        int size = scanner.nextInt();
        for (int i=0; i < size; i++) {
            System.out.println("Numbers[" + i + "]=");
            int value = scanner.nextInt();
            numbers.add(value);
        }
        return numbers;
    }
    
    public static void DisplayData (ArrayList <Integer> numbers) {
        System.out.println("Numbers[]=" + Arrays.toString(numbers.toArray()));
    }
    
    public static int findMax2 (int[] arrays) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int arr: arrays) {
            if (arr > max) {
                max2 = max;
                max = arr;
            } else if (arr > max2 && arr < max) {
                max2 = arr;
            }
        }
        return max2;
    }
    
    public static int[] deleteOddNumber (int[] arrays) {
        int countEven = 0;
        for (int arr: arrays) {
            if (arr%2==0) {
                countEven++;
            }
        }
        int[] arrayEven = new int[countEven];
        int index = 0;
        for (int arr: arrays) {
            if (arr%2==0) {
                arrayEven[index++] = arr;
            }
        }
        return arrayEven;
    }
    
    public static void printData (int[] arrays) {
        System.out.println(Arrays.toString(arrays));
    }
    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String check;
        do {
            System.out.println("Menu: Nhap data (phim 1), xuat data (phim 2)");
            int choosion = Integer.parseInt(scanner.nextLine());
            switch (choosion) {
                case 1:
                    numbers = ArrayListExercise.EnterData(numbers);
                    break;
                case 2:
                    ArrayListExercise.DisplayData(numbers);
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
            }
            
            System.out.println("Nhap yes de tiep tuc chuong trinh");
            check = scanner.nextLine();
        } while (check.equals("yes"));
        int[] arrays = new int[numbers.size()];
        for (int i=0; i < numbers.size(); i++) {
            arrays[i] = numbers.get(i);
        }
        int secondLargestNumber = findMax2(arrays);
        System.out.println("Phan tu lon thu 2 trong mang:" + secondLargestNumber);
        int[] arrayEven = deleteOddNumber(arrays);
        System.out.println("Mang sau khi xoa cac so le");
        printData(arrayEven);
    }
}
