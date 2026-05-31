class Calc{
    int num1;
    int num2;
    int result;

    void operation(){
        result=num1+num2;
    }
}
public class calculator{
    public static void main(String[]args){
        Calc obj=new Calc();
        obj.num1=5;
        obj.num2=5;
        obj.operation();
        System.out.print(obj.result);
    }
}