public class ArithmeticExceptionDemo{
    public static void main(String[]args){
        try{
            int i=10;
            int j=0;
            int sol = i/j;
        }
        catch(ArithmeticException e){
            System.err.println("Error");
        }
    }
}
