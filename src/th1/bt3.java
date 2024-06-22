package th1;

import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập số phần tử trong mảng 01");
        int n1 = Integer.parseInt(sc.nextLine());
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("Hãy nhập giá trị ở vị trí %d\n", i);
            arr1[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Hãy nhập số phần tử trong mảng 02");
        int n2 = Integer.parseInt(sc.nextLine());
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("Hãy nhập giá trị ở vị trí %d\n", i);
            arr2[i] = Integer.parseInt(sc.nextLine());
        }
        int[] arr3 = new int[n1+n2];
        for (int i = 0; i < n1; i++) {
            arr3[i] = arr1[i];
        }
        int test = 0;
        for (int i = n1; i < arr3.length; i++) {
           arr3[i] = arr2[test];
           test++;
        }
        System.out.println("Mảng sau khi thêm");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
