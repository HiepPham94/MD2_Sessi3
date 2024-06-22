package th1;

import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn Hãy nhập số hàng trong mảng");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Bạn hãy nhập số cột trong mảng");
        int col = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("Bạn hãy nhập giá trị ở hàng %d cột %d: ",i,j);
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("mảng của bạn là");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%5d",arr[i][j]);
            }
            System.out.println();
        }
        int check = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]< check) {
                    check = arr[i][j];
                }
            }
        }
        System.out.printf("giá trị nhỏ nhất của mảng là %d",check);
    }
}
