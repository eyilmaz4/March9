package march9Study;

public class R {
    public static void main(String[] args) {
        int [][] num={{2,3,4},{2,3,1}} ;
        maximum(num);
    }
    public static void maximum (int [][] arr){
        int max=0;
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++)
                if (max<arr[i][j]){
                    max=arr[i][j];
                }
        }
        System.out.println(max);
    }
}
   // public static void findMaxInRow(int[][] arr) {
//        int number = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] > number) {
//                    number = arr[i][j];
//                }
//            }
//            System.out.println(number);
//        }
