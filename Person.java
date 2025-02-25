public class Person {
    int age;
    String name;
    double sal;
    Person(){
        age=21;
        name="Pradyumna";
        sal=4560.50;
    }
    void show(){
        System.out.println("Age="+age);
        System.out.println("Name="+name);
        System.out.println("Salary="+sal);
    }
    public static void main(String[] args){
        Person x=new Person();
        x.show();
    }
}