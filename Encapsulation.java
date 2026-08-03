class Human{
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        // Human obj = new Human();
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
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
