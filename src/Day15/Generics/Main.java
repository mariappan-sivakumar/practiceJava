package Day15.Generics;

public class Main {
    public static void main(String[] args) {
        Colour<Red,Green,Blue> colour= new Colour<>();
        Bartender bartender=new Bartender();
        Juice juice=new Juice();
        Water water=new Water();
        Red red=new Red();
        bartender.mix(juice,water);
        Glass<Juice> juiceGlass=new WineGlass<Juice>();
        Tray tray=new Tray();
        tray.add(juiceGlass);


    }
}
