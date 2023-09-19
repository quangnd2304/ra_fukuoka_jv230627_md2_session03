package ra.array;

import java.util.Scanner;

public class ArrayOneDimension {
    public static void main(String[] args) {
        //Datatype[] arrayName = new Datatype[size]
        //1.Khai báo mảng một chiều số nguyên (int)
        int[] arrInt;
        //2. Khởi tạo mảng số nguyn arrInt có 5 phần tử
        arrInt = new int[5];
        //3. Khai báo và khởi tạo mảng số thực (float) gồm 3 phần tử
        float[] arrFloat = new float[3];
        //4. Khai báo và khởi tạo mảng chuỗi gồm 2 phần tử có giá trị: Nguyễn Văn A, Nguyễn Văn B
        //Literal: Datatype[] arrayName = {value1,value2,...,valueN}
        String[] arrString = {"Nguyễn Văn A", "Nguyễn Văn B"};
        //5. Khởi tạo giá trị cho các phần tử của mảng số nguyên arrInt
        arrInt[0] = 1;
        arrInt[1] = 5;
        arrInt[2] = 7;
        arrInt[3] = 10;
        arrInt[4] = 15;
        //6. Để xác định số phần tử của mảng: array.length --> số phần tử của mảng
        System.out.println("Số phần tử của mảng arrInt là: " + arrInt.length);
        //7. Nhập giá trị các phần tử của mảng arrFloat bằng vòng for
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrFloat.length; i++) {
            System.out.printf("arrFloat[%d]=", i);
            arrFloat[i] = scanner.nextFloat();
        }
        //8. In ra giá trị các phần tử của mảng arrFloat
        System.out.println("Các phần tử của mảng arrFloat là:");
        for (float element : arrFloat) {
            System.out.printf("%f\t",element);
        }
        System.out.printf("\n");
    }
}
