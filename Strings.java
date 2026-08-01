public class Strings {
    public static void main(String[] a) {
        String name = new String("Habiba");
        String name2 = new String("Habiba");

        String name3 = "test";
        String name4 = "test";
        System.out.println(name == name2);
        System.out.println(name3 == name4);

        name = name + " Hassan";
        System.out.println(name);
        System.out.println(name.charAt(1));
        System.out.println(name.concat(" test"));
    }
}
