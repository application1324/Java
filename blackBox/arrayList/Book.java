package blackBox.arrayList;

public class Book {

    // 모든 변수는 private으로
    private String bookName;
    private String author;


    // 기본 생성자
    public Book() {}

    // 생성자 함수가 을 만들것이다.
    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    // 등록을 하는 것에 대한 조건을 내걸것이다.
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void showBookInfo() {
        System.out.println(bookName + ", " + author);
    }

    // 단순출력보다는 무엇가 있는 것이 있을것이다.
}
