package march9Study;

public class max2Array {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5},{6,7,8}};
        //findMaxInRow(arr);
       // printRowsMax(arr);
        maxDifference(arr);
        int [] minNumbers=returnRowsMin(arr);

        for(int number:minNumbers){
            System.out.println(number);
        }
    }

    public static int returnMax(int[] arr) {
int max=arr[0];
for(int number:arr){
    if(number>max){
        max=number;
    }
}return max;
    }

//    public static void findMaxInRow(int[][] arr) {
//        int number = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] > number) {
//                    number = arr[i][j];
//                }
//            }
//            System.out.println(number);
//        }
//    }
//
    public static void printRowsMax(int[][]arr){
        for(int [] row:arr){
            System.out.println(returnMax(row));
        }
    }
    public static void printRowsMin(int[][]arr){
        for(int [] row:arr){
            System.out.println(returnMin(row));
        }
    }

    public static int[] returnRowsMin(int [][]arr){
        int mins[]=new int [arr.length];
        int index=0;
        for(int row[]:arr){
            mins[index]=returnMin(row);
            index++;
        }
        return mins;
    }

    public static int returnMin(int[] arr) {
        int min=arr[0];
        for(int number:arr){
            if(number<min){
                min=number;
            }
        }return min;
    }
public static void maxDifference(int [][] arr){

        for(int maxes[]:arr){
            System.out.println(returnMax(maxes)-returnMin(maxes));

        }
}
public static int [] returnMaxDifferences(int [][] arr){
        int [] maxDiffs=new int[arr.length];
        for(int i=0; i<arr.length; i++){
            maxDiffs[i]=returnMax(arr[i])-returnMin(arr[i]);
        }
        return maxDiffs;
}
}
