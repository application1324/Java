package poly.ex6;

public class Chicken extends AbstractAnimal implements Fly {
    @Override
    public void sound() {
        System.out.println("닭이 운다.");
    }

    @Override
    public void fly() {
        System.out.println("닭이 난다.");
    }
}
