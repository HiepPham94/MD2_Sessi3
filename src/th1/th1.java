package th1;

import java.util.Scanner;

public class th1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập số phần tử của mảng");
        int n = Integer.parseInt(sc.nextLine());
        int[] arrNumber = new int[n];
        boolean check = true;
        do {
            System.out.println("************MENU************");
            System.out.println("Chọn 1 để Nhập giá trị các phần tử");
            System.out.println("Chọn 2 để In giá trị các phần tử");
            System.out.println("Chọn 3 để Tính tổng các phân tử");
            System.out.println("Chọn 4 để In các phần tử có giá trị lẻ trong mảng");
            System.out.println("Chọn 5 để In các phần tử có chỉ số chẵn trong mảng");
            System.out.println("Chọn 6 để Sắp xếp mảng tăng dần");
            System.out.println("Chọn 7 để Thoát");
            int select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1:
                    for (int i = 0; i < arrNumber.length; i++) {
                        System.out.printf("arrNumber[%d]\t",i);
                        arrNumber[i] = Integer.parseInt(sc.nextLine());
                    }
                    System.out.println();
                    break;
                case 2:
                    for (int i = 0; i < arrNumber.length; i++) {
                        System.out.printf("%d\t",arrNumber[i]);
                    }
                    System.out.println();
                    break;
                case 3:
                    int sum = 0;
                    for (int i = 0; i < arrNumber.length; i++) {
                        sum += arrNumber[i];
                    }
                    System.out.printf("Tổng các giá trị của mảng là %d\n",sum);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Các phần tử có giá trị lẻ là");
                    for (int i = 0; i < arrNumber.length; i++) {
                        if (arrNumber[i] % 2 == 1) {
                            System.out.printf("%d\t", arrNumber[i]);
                        }
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Các phần tử có chỉ số chẵn là");
                    for (int i = 0; i < arrNumber.length; i++) {
                        if (i % 2 == 0) {
                            System.out.printf("%d\t", arrNumber[i]);
                        }
                    }
                    System.out.println();
                    break;
                case 6:
                    int box = 0;
                    for (int i = 0; i < arrNumber.length; i++) {
                        for (int j = i+1 ; j < arrNumber.length; j++) {
                            if (arrNumber[i]>arrNumber[j]) {
                                box = arrNumber[i];
                                arrNumber[i] = arrNumber[j];
                                arrNumber[j] = box;
                            }
                        }
                    }
                    System.out.println("Dãy phần tử sau sắp xếp là");
                    for (int k = 0; k < arrNumber.length; k++) {
                        System.out.printf("%d\t", arrNumber[k]);
                    }
                    System.out.println();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Bạn hãy nhập lại lựa chọn");
            }
        } while (true);


    }
}
