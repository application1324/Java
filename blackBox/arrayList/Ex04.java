package blackBox.arrayList;

import java.util.ArrayList;

public class Ex04 {
    public static void main(String[] args) {
        Book b1 = new Book("태백산맥", "조정래");

        // ArrayList을 사용해서 생성자 함수을 통해 입력을 한다.
        // 값의 개수가 다를수가 있다
        ArrayList<Book> library = new ArrayList<>();
        library.add(new Book("태백산막", "조정래"));
        library.add(new Book("데미안", "해르만 헤세"));
        library.add(new Book("토지", "박경리"));
        library.add(new Book("어린왕자", "생택쥐페리"));


        // 출력하는 값을 출력하면됨
        System.out.println(library.get(2));

        for (int i=0; i<library.size(); i++){
            Book book = library.get(i);
            book.showBookInfo();
        }

        library.remove(0);
        for(Book book : library) {
            book.showBookInfo();
        }
    }
}
