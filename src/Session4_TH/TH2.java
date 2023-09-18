package Session4_TH;

import java.util.Scanner;

public class TH2 {
    public static void main(String[] args) {
        String[] students = {
            "anh", "thu", "ha", "cuc"
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên sinh viên cần tìm kiếm: ");
        String input_name = sc.nextLine();

        boolean isExist  = false;

        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(input_name)){
                System.out.println("vị trí của học sinh" + input_name +"tại" + i);
                isExist = true;
                break;
            }
        }

        if(!isExist){
            System.out.println("không tìm thấy hs: " + input_name +"trong danh sách");
        }
    }
}
