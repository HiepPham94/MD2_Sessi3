package th1;

import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] arrayTest = new int[n];
        for (int i = 0; i < arrayTest.length; i++) {
            System.out.printf("hãy nhập giá trị cho vị trí %d ",i);
            arrayTest[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Hãy nhập số bạn muốn xóa khỏi mảng");
        int numberDelete = Integer.parseInt(sc.nextLine());
        int numberInsert = 0;
        for (int i = 0; i < arrayTest.length; i++) {
            if (arrayTest[i] == numberDelete) {
                numberInsert++;
                for (int j = i; j < arrayTest.length -i; j++) {
                    arrayTest[j] = arrayTest[j + 1];
                }
            }
        }
        n = n - numberInsert;
        System.out.println();
        for (int i = 0; i < arrayTest.length; i++) {
            System.out.printf("%5d",arrayTest[i]);
        }

    }
}
