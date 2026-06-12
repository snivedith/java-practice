public class MultipleExceptionHandling{
    public static void main(String[]args){
        try{
            int a[] = new int[5];
            a[5] = 6;
            int i=10;
            int j=0;
            int sol = i/j;
            System.out.println("Output is"+sol);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid input");
        }
        catch(ArithmeticException e){
            System.err.println("Error");
        }
    }
}
