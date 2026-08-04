class Mobile{
    static String name;
    String brand;
    int price;

    static{
        name = "test";
        System.out.println("In static");
    }

    public Mobile(){
        System.out.println("In constructor");
    }

    public void show(){
        System.out.println("name: " + name + " brand: " + brand + " price: " + price);
    }

    // static method 
    public static void show1(Mobile obj){
        System.out.println("STATIC METHOD // name: " + name + " brand: " + obj.brand + " price: " + obj.price);
    }

    public void testAnon(){
        
        System.out.println("In testAnon");
    }
}
public class Static {
    public static void main(String[] args) throws ClassNotFoundException {
        Mobile mob1 = new Mobile();
        mob1.brand = "apple";
        mob1.price = 1500;
        Mobile mob2 = new Mobile();
        mob2.brand = "samsung";
        mob2.price = 1000;

        Mobile.name = "smartphone";
        mob1.show();
        mob2.show();

        Mobile.show1(mob2);
        // Mobile.show1() if there is not parameter and only static variable

        Class.forName("Mobile"); // to initiate class without any object

        int num;
        num = 6;

        // Anonymous object
        new Mobile();
        new Mobile().testAnon();
    }
}
