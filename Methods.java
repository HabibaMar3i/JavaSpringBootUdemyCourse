class Computer{
    public String playMusic(){
        return "Music playing...";
    }

    public String giveMePen(int cost){
        return "Here is your pen";
    }
}
public class Methods {
    public static void main(String a[]){
        Computer myComputer = new Computer();
        String music = myComputer.playMusic();
        String pen = myComputer.giveMePen(10);
        System.out.println(music);
        System.out.println(pen);
    }
}
