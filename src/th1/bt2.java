package th1;

import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập số phần tử trong mảng");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Hãy nhập giá trị ở v trí %d\n", i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng trước khi thêm");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Hãy nhập vị trí bạn muốn thêm trong mảng");
        int location = Integer.parseInt(sc.nextLine());
        System.out.println("Hãy nhập số bạn muốn thêm vào vị trí đã chọn");
        int number = Integer.parseInt(sc.nextLine());
        n = n + 1;
        for (int i = arr.length-1; i > location-1; i--) {
            arr[i] = arr[i-1];
        }
        arr[location-1] = number;
        System.out.println("Mảng sau khi thêm");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
