package march9Study;

public class colRowsConvert {
    public static void main(String[] args) {
        int [][] arr={{1,2},{3,4}};
        returncolToRow(arr);
    }
    public static void returncolToRow(int [][]arr){
       int [][] newArr=new int [arr.length][arr[0].length];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                newArr[i][j]=arr[j][i];

                          }
        }
        for(int num[]:newArr){
            for(int nums:num){
                System.out.println(nums);
            }
        }
    }
}
