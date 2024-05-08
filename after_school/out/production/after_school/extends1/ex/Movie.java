package extends1.ex;

public class Movie extends Item {
    private String director;
    private String actor;

    public Movie(String name, int price, String director, String actor) {
        super(name, price);
//        setName(name);
//        setPrice(price);
        this.director = director;
        this.actor = actor;
    }

    public void print() {
//        System.out.printf("이름:%s, 가격:%d\n- 감독:%s, 배우:%s\n", getName(), getPrice(), this.director, this.actor);
        super.print();
        System.out.println("- 감독 : " + director + "배우:"+actor);
    }
}
