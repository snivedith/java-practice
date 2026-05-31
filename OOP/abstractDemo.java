abstract class Human{
    public void eat(){
        System.out.print("Abstract");
    }
}
class Man extends Human{
    public void eat(){
        System.out.print("Not abstract");
    }
}
public class abstractDemo{
    public static void main(String[]args){
        Human obj = new Man();
        obj.eat();
    }
}