package ra.array;

import java.util.Scanner;

public class ArrayOneDimension_UngDung {
    public static void main(String[] args) {
        /*
         * 1. Khai báo mảng số nguyên gồm 5 phần tử
         * 2. Hiển thị menu và thực hiện các chức năng theo menu sau:
         *       ************************MENU***********************
         *       1. Nhập giá trị các phần tử mảng
         *       2. In ra giá trị các phần tử trong mảng
         *       3. In ra giá trị các phần tử chẵn trong mảng
         *       4. In ra giá trị các phần tử có chỉ số lẻ trong mảng
         *       5. Tính tổng các phần tử trong mảng
         *       6. Sắp xếp mảng tăng dần (thuật toán selection sort)
         *       7. Thoát
         * */

        Scanner scanner = new Scanner(System.in);
        //1. Nhập số phần tử của mảng từ bàn phím
        System.out.println("Nhập số phần tử của mảng:");
        int arrSize = Integer.parseInt(scanner.nextLine());
        //2. Khai báo và khởi tạo mảng
        int[] arrInt = new int[arrSize];
        //3. In ra menu và thực hiện các chức năng theo menu
        do {
            System.out.println("*********************MENU*********************");
            System.out.println("1. Nhập giá trị các phần tử của mảng");
            System.out.println("2. In ra giá trị các phần tử của mảng");
            System.out.println("3. In ra giá trị các phần tử chẵn");
            System.out.println("4. In ra giá trị các phần tử chỉ số lẻ");
            System.out.println("5. Tính tổng các phần tử trong mảng");
            System.out.println("6. Sắp xếp mảng tăng dần");
            System.out.println("7. Thoát");
            System.out.print("Lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 0; i < arrInt.length; i++) {
                        System.out.printf("arrInt[%d]=", i);
                        arrInt[i] = Integer.parseInt(scanner.nextLine());
                    }
                    break;
                case 2:
                    System.out.println("Giá trị các phần tử trong mảng là:");
                    for (int element : arrInt) {
                        System.out.printf("%d\t", element);
                    }
                    System.out.printf("\n");
                    break;
                case 3:
                    System.out.println("Giá trị các phần tử chẵn trong mảng là:");
                    for (int i = 0; i < arrInt.length; i++) {
                        if (arrInt[i] % 2 == 0) {
                            System.out.printf("%d\t", arrInt[i]);
                        }
                    }
                    System.out.printf("\n");
                    break;
                case 4:
                    System.out.println("Giá trị các phần tử có chỉ số lẻ trong mảng là:");
                    for (int i = 0; i < arrInt.length; i++) {
                        if (i % 2 == 1) {
                            System.out.printf("%d\t", arrInt[i]);
                        }
                    }
                    System.out.printf("\n");
                    break;
                case 5:
                    int sum = 0;
                    for (int element : arrInt) {
                        sum += element;
                    }
                    System.out.println("Tổng các phần tử trong mảng là: " + sum);
                    break;
                case 6:
                    for (int i = 0; i < arrInt.length - 1; i++) {
                        for (int j = i+1; j < arrInt.length; j++) {
                            if (arrInt[i]>arrInt[j]){
                                int temp = arrInt[i];
                                arrInt[i] = arrInt[j];
                                arrInt[j] = temp;
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp xong mảng tăng dần");
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn 1-7");
            }
        } while (true);
    }
}
