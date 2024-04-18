package construct.exam;

public class Book {
    String title;
    String author;
    int page;

    Book() {
        this("", "", 0);
    }

    Book(String title, String author) {
        this(title, author, 0);
    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public void displayInfo() {
        System.out.printf("제목:%s, 저자:%s, 페이지:%s\n", this.title, this.author, this.page);
    }
}
