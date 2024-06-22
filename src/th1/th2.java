package th1;

import java.util.Scanner;

public class th2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập số hàng trong mảng");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Hãy nhập số cột trong mảng");
        int col = Integer.parseInt(sc.nextLine());
        int[][] arrMultidimensional = new int[row][col];
        do {
            System.out.println();
            System.out.println("************MENU************");
            System.out.println("Chọn 1 để Nhập giá trị các phần tử");
            System.out.println("Chọn 2 để In giá trị các phần tử theo ma trận");
            System.out.println("Chọn 3 để In giá trị các phần tử nằm trên đường biên của ma trận");
            System.out.println("Chọn 4 để Tính tổng các phần tử chia hết cho 3 trong mảng");
            System.out.println("Chọn 5 để In ra các phần tử trên đường chéo chính và chéo phụ của mảng và tính tổng");
            System.out.println("Chọn 6 để Sắp xếp các dòng giảm dần");
            System.out.println("Chọn 7 để Thoát");
            System.out.println();
            int select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1:
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.printf("arrMultidimensional[%d][%d]\t",i,j);
                            arrMultidimensional[i][j] = Integer.parseInt(sc.nextLine());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Các giá trị trong mảng là:");
                    for (int i = 0; i < arrMultidimensional.length; i++) {
                        for (int j = 0; j < arrMultidimensional[i].length; j++) {
                            System.out.printf("%5d",arrMultidimensional[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Các giá trị nằm trên đường biên ma trận là:");
                    for (int i = 0; i < arrMultidimensional.length; i++) {
                        for (int j = 0; j < arrMultidimensional[i].length; j++) {
                            if (i==0||j==0||i==arrMultidimensional.length-1||j==arrMultidimensional.length-1){
                                System.out.printf("%5d",arrMultidimensional[i][j]);
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    int sumDivide=0;
                    for (int i = 0; i < arrMultidimensional.length; i++) {
                        for (int j = 0; j < arrMultidimensional[i].length; j++) {
                            if (arrMultidimensional[i][j]%3==0) {
                                sumDivide += arrMultidimensional[i][j];
                            }
                        }
                    }
                    System.out.printf("Tổng giá trị các phần tử chia hết cho 3 là %d",sumDivide);
                    break;
                case 5:
                    if (arrMultidimensional.length==arrMultidimensional[0].length) {
                        System.out.println("Các phần tử trên đường chéo chính là");
                        int sumMain = 0;
                        int sumAxis = 0;
                        for (int i = 0; i < arrMultidimensional.length; i++) {
                            for (int j = 0; j < arrMultidimensional[i].length; j++) {
                                if (i==j) {
                                    System.out.printf("[%5d]",arrMultidimensional[i][j]);
                                    sumMain += arrMultidimensional[i][j];
                                }
                            }
                        }
                        System.out.println();
                        System.out.println("Các phẩn tử trên đường chéo phụ là");
                        for (int i = 0; i < arrMultidimensional.length; i++) {
                            for (int j = 0; j < arrMultidimensional[i].length; j++) {
                                if (i+j==arrMultidimensional.length-1) {
                                    System.out.printf("%5d",arrMultidimensional[i][j]);
                                    sumAxis += arrMultidimensional[i][j];
                                }
                            }
                        }
                        System.out.println();
                        System.out.printf("Tổng các phần tử trục chính là %d",sumMain);
                        System.out.println();
                        System.out.printf("Tổng các phần tử trục phụ là %d",sumAxis);
                        System.out.println();
                    } else {
                        System.out.println("Mảng của bạn không có trục chính, phụ ");
                    }
                    break;
                case 6:
                    int box = 0;
                    for (int i = 0; i < arrMultidimensional.length; i++) {
                        for (int j = 0; j < arrMultidimensional[i].length; j++) {
                            for (int k = j+1; k < arrMultidimensional[i].length; k++) {
                                if (arrMultidimensional[i][j]<arrMultidimensional[i][k]) {
                                    box = arrMultidimensional[i][j];
                                    arrMultidimensional[i][j] = arrMultidimensional[i][k];
                                    arrMultidimensional[i][k] = box;
                                }
                            }
                        }
                    }
                    System.out.println("Các phần tử sau sắp xếp là:");
                    for (int i = 0; i < arrMultidimensional.length; i++) {
                        for (int j = 0; j < arrMultidimensional[i].length; j++) {
                            System.out.printf("%5d",arrMultidimensional[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 7:
                    return;
            }
        } while (true);
    }
}
