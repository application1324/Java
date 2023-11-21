package blackBox.arrayList;

import java.util.ArrayList;

public class Ex04 {
    public static void main(String[] args) {
        Book b1 = new Book("태백산맥", "조정래");

        ArrayList<java.awt.print.Book> library = new ArrayList<>();
        library.add(new Book("태백산막", "조정래"));
        library.add(new Book("데미안", "해르만 헤세"));
        library.add(new Book("토지", "박경리"));
        library.add(new Book("어린왕자", "생택쥐페리"));

        System.out.println(library.get(2));

        for (int i=0; i<library.size(); i++){
            java.awt.print.Book book = library.get(i);
            book.showBookInfo();
        }

        library.remove(0);
        for(java.awt.print.Book book : library) {
            book.showBookInfo();
        }
    }
}
