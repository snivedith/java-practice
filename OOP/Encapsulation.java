class Encap{
    String name;
    int rollno;
    public int getRollno(){
        return rollno;
    }
    public void setRollno(int rollno){
        this.rollno=rollno;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
public class Encapsulation{
    public static void main(String[]args){
        Encap s1=new Encap();
        s1.setRollno(1);
        s1.setName("Nivedith");
        System.out.println(s1.getRollno());
        System.out.println(s1.getName());
    }
}