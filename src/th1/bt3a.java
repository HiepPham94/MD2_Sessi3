package th1;

import java.util.Scanner;

public class bt3a {
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
        int number = 0;
        int[][] arr3 = new int[2][number];
        if (n1>n2) {
            number = n1;
        } else {
            number = n2;
        }
        for (int j = 0; j < arr3[0].length; j++) {
            arr3[0][j] = arr1[j];
        }
        for (int j = 0; j < arr3[1].length; j++) {
            arr3[1][j] = arr2[j];
        }
        System.out.println("Các phần tử trong mảng sau khi gộp");
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.printf("%d", arr3[i][j]);
            }
            System.out.println("ee");
        }

    }
}
