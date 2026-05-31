public class Array{
    public static void main(String[]args){
        int[][] nums ={
                    {1,2,3,4},
                    {2,4,5,},
                    {6,7,8,9,0}
                };
        for(int i[] : nums){
            for(int j : i){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}