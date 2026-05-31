class Mammal{
    public Mammal(){
        System.out.println("Mammal");
    }
    public Mammal(String s){
        System.out.println("Mammal is");
    }
}
class Animal extends Mammal{
    public Animal(){
        System.out.println("Animal");
    }
    public Animal(String s){
        super(s);
        System.out.println("Animal is");
    }
}
public class Super{
    public static void main(String[]args){
        Animal definition= new Animal("Dog");
    }
}