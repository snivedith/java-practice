class Student{
    String name;
    int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Name = "+name+ " Age = "+age);
    }
}
public class ThisKeyword{
    public static void main(String[]args){
        Student obj = new Student("Nivedith",22);
        obj.display();
    }
}