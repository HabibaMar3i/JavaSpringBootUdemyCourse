class Computer{
    String brand;
    int price;
    String serial;

    public String toString(){
        return "Brand: " + brand + ", Price: " + price + ", Serial: " + serial;
    }

    public boolean equals(Computer that){
        if(this.brand == that.brand && this.price == that.price){
            return true;
        }
        else{
            return false;
        }
    }
}
public class ToStringHashCode {
    public static void main(String[] args) {
        Computer obj1 = new Computer();
        obj1.brand = "Dell";
        obj1.price = 50000;
        obj1.serial = "DELL1234";

        Computer obj2 = new Computer();
        obj2.brand = "Dell";
        obj2.price = 50000;
        obj2.serial = "DELL1234";

        boolean result = obj1.brand == obj2.brand;
        result = obj1.brand.equals(obj2.brand);
        System.out.println(result);
        System.out.println(obj2);
        System.out.println(obj2.equals(obj1));
    }
}
