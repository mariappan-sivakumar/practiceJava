package Day15.Generics;

public class Bartender {
    public<J extends Liquid,W extends Liquid> void mix(J juice,W water){
        System.out.printf("Mix %s and %s",juice,water);
    }
}
