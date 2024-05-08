package extends1.ex;

public class ShopMain {
    public static void main(String[] args) {
        Book book = new Book("JAVA", 10000, "han", "12345");
        AlBum alBum = new AlBum("앨범1", 15000, "seo");
        Movie movie = new Movie("영화1", 18000, "감독1", "배우1");

        book.print();
        alBum.print();
        movie.print();

        int sum = book.getPrice() + alBum.getPrice() + movie.getPrice();
        System.out.printf("상품 가격의 합:%d", sum);
    }
}
