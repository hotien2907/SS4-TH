package Session4_TH;

import java.util.Scanner;

public class TH4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double doF;
        double doC;
        int choice;

        do {
            System.out.println("1.độ F sang độ C");
            System.out.println("2.độ C sang độ F");
            System.out.println("3.Thoát");

            System.out.println("nhập yêu cầu của bạn: " );
            choice =  sc.nextInt();


            switch (choice){
                case 1:
                    System.out.println("nhập vào đô f muốn chuyển đổi sang độ c");
                    doF = sc.nextDouble();
                    System.out.println(chuyenDoCsangDoF(doF));
                    break;
                case 2:

                    System.out.println("nhập vào đô c muốn chuyển đổi sang độ f");
                    doC = sc.nextDouble();
                    System.out.println(chuyenDoFsangDoC(doC));
                    break;
                case 3:
                    System.out.println("Thoát khỏi vòng lặp");
                    break;

            }

        }while (choice !=3);
    }

    public   static double chuyenDoCsangDoF(double doC) {
        double doF = (9/5)*doC + 32;
        return  doF;
    }
    public   static double chuyenDoFsangDoC(double doF) {
        double doC = (5/9)*(doF - 32);
        return  doC;
    }
}
