package Session4_TH;

import java.util.Scanner;

public class TH1 {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhập Kích thước của mảng");
            size = sc.nextInt();
            if(size > 20){
                System.out.println("kích thuoc của mảng ko đc vượt quá 20");
            }
        }while (size>20);


        array = new int[size];
        int i = 0;

        while (i< array.length){
            System.out.println("nhập phẩn tử thứ"+(i+1)+ ":");
            array[i] = sc.nextInt();
            i++;
        }

        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] +"\t");
            
        }

        for (int j = 0; j < array.length/2; j++) {
            int temp  = array[j];
            array[j] = array[size - 1 -j];
            array[size - 1 -j] = temp;

            System.out.println();
            for (int k = 0; k < array.length; k++) {
                System.out.print(array[k]+ "\t");

            }
            
        }
    }
}
