class Human{
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String n){
        name = n;
    }

    public void setAge(int a){
        age = a;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Human person = new Human();
        person.setName("Habiba");
        person.setAge(24);
        System.out.println("Name: " + person.getName() + " and Age: " + person.getAge());
    }
}
