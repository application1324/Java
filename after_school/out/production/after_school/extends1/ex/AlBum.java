package extends1.ex;

public class AlBum extends Item {
    private String artist;

    public AlBum(String name, int price, String artist) {
        super(name, price);
        this.artist = artist;
    }

    public void print() {
//        System.out.printf("이름:%s, 가격:%d\n- 아티스트:%s\n", getName(), getPrice(), this.artist);
        super.print();
        System.out.println("- 아티스트: " + artist);
    }

}
