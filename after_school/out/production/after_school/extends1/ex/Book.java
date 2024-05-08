package extends1.ex;

public class Book extends Item {
    private String author;
    private String isbn;

    public Book(String name, int price, String author, String isbn) {
        super(name, price);
//        setName(name);
//        setPrice(price);
        this.author = author;
        this.isbn = isbn;
    }

    public void print() {
//        System.out.printf("이름:%s, 가격:%d\n- 저자:%s, isbn:%s\n", getName(), getPrice(), this.author, this.isbn);
        super.print();
        System.out.println(" - 저자 : " + author + " isbn : " + isbn);
    }
}
