public class VarArgs{
    public int add(int...n){
        int sum=0;
        for(int i : n){
            sum= sum+i;
        }
        return sum;
    }
    public static void main(String[]args){
        VarArgs solution = new VarArgs();
        System.out.print(solution.add(3,4,5,6,7));
    }
}