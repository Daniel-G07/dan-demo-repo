public class NestedLoop {
    public static void main(String[] args){
        
        int[][] arr = {{2, 3}, {4, 6}, {7,8}};

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i < arr[0].length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }

        System.out.println("merge test");



    }



}