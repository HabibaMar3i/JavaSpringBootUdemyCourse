class Mobile{
    static String name;
    String brand;
    int price;

    public void show(){
        System.out.println("name: " + name + " brand: " + brand + " price: " + price);
    }
}
public class Static {
    public static void main(String[] args) {
        Mobile mob1 = new Mobile();
        mob1.brand = "apple";
        mob1.price = 1500;
        Mobile mob2 = new Mobile();
        mob2.brand = "samsung";
        mob2.price = 1000;

        Mobile.name = "smartphone";
        mob1.show();
        mob2.show();
    }
}
