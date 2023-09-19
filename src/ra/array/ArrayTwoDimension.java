package ra.array;

import java.util.Scanner;

public class ArrayTwoDimension {
    public static void main(String[] args) {
        //1. Nhập số dòng (row) và số cột (col) của mảng 2 chiều số nguyên
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của mảng:");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào sô cột của mảng:");
        int col = Integer.parseInt(scanner.nextLine());
        //2. Khai báo và khởi tạo mảng số nguyên 2 chiều gồm row dòng và col cột
        int[][] arrInt = new int[row][col];
        //3. Nhập giá trị các phần tử của mảng
        for (int i = 0; i < row; i++) {
            //i chaỵ theo dòng
            for (int j = 0; j < col; j++) {
                //j chạy theo cột
                System.out.printf("arrInt[%d][%d]=",i,j);
                arrInt[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        //4. In ra giá trị các phần tử của mảng
        System.out.println("Cac phần tử của mảng 2 chiều là:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                //In dòng
                System.out.printf("%5d",arrInt[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
    }
}
