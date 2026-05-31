interface New{
    void speed(int increment);
    void changeGear(int gear);
    void applyBreaks(int decrement);
}
class Vehicle implements New{
    int speed = 0;
    int gear = 1;
    public void changeGear(int newGear){
        gear = newGear;
    }
    public void speed(int increment){
        speed +=increment;
    }
    public void applyBreaks(int decrement){
        speed -=decrement;
    }
    public void displayStatus(){
        System.out.println("Speed= "+speed+" Gear= "+gear);
    }
}
public class speedandgear{
    public static void main(String[]args){
        Vehicle obj = new Vehicle();
        obj.changeGear(5);
        obj.speed(10);
        obj.applyBreaks(9);
        obj.displayStatus();
    }
}