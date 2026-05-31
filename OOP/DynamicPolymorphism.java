class Creature {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}
class Pig extends Creature {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}
class Dog extends Creature {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}
public class DynamicPolymorphism {
    public static void main(String[] args) {
        Creature myAnimal = new Dog();
        myAnimal.animalSound();
    }
}