package Session4_TH;

import java.util.Scanner;

public class TH6 {
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
            System.out.println("nhập điểm của hs"+(i+1)+ ":");
            array[i] = sc.nextInt();
            i++;
        }

        int count = 0;
        for (int j = 0; j < array.length; j++) {
            if(array[j]>=5){
                count++;

            }

        }
        System.out.println("số học sinh đỗ là: " +count);
    }
}

