package th1;

import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập số hàng trong mảng");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Hãy nhập số cột trong mảng");
        int col = Integer.parseInt(sc.nextLine());
        int[][] arrMultidimensional = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Hãy nhập giá trị cho vị trí hàng %d cột %d:  ",i,j);
                arrMultidimensional[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("Các giá trị trong mảng là:");
        for (int i = 0; i < arrMultidimensional.length; i++) {
            for (int j = 0; j < arrMultidimensional[i].length; j++) {
                System.out.printf("%5d",arrMultidimensional[i][j]);
            }
            System.out.println();
        }
        int check = 0;
        for (int i = 0; i < arrMultidimensional.length; i++) {
            for (int j = 0; j < arrMultidimensional[i].length; j++) {
                if (arrMultidimensional[i][j] > check) {
                    check = arrMultidimensional[i][j];
                }
            }
        }
        System.out.printf("Giá trị lớn nhất trong mảng là %d",check);
    }
}
