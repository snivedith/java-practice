class Calculator{
    public int add(int i, int j){
        return i+j;
    }
}
class CalcAdv extends Calculator{
    public int sub(int i,int j){
        return i-j;
    }
}
class CalcAdvance extends CalcAdv{
    public int multiply(int i, int j){
        return i*j;
    }
}
public class Inheritance{
    public static void main(String[]args){
        CalcAdvance calculation=new CalcAdvance();
        System.out.println(calculation.add(12,13));
        System.out.println(calculation.sub(12,12));
        System.out.println(calculation.multiply(12,12));
    }
}