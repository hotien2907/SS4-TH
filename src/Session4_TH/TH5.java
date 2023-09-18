package Session4_TH;

public class TH5 {
    public static void main(String[] args) {
       int[] array = {3,7,2,6,9,12,4};
       int indexMin= minValue(array);
        System.out.println("giá trị nhỏ nhất là: " + array[indexMin]);
    }
    public  static  int minValue(int [] arr){
        int index = 0;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i] <arr[index]){
                index = i;
            }
            
        }
        return  index;
    }

}
