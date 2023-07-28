import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Book objelerini oluşturup Set yapısında saklama
        Set<Book> bookSetByName = new TreeSet<>();
        bookSetByName.add(new Book("Book C", 300, "Author 3", new Date(123456789)));
        bookSetByName.add(new Book("Book B", 250, "Author 2", new Date(987654321)));
        bookSetByName.add(new Book("Book A", 200, "Author 1", new Date(789456123)));
        bookSetByName.add(new Book("Book E", 400, "Author 5", new Date(654987321)));
        bookSetByName.add(new Book("Book D", 350, "Author 4", new Date(987321654)));

        // Kitapları isme göre sıralı şekilde yazdırma
        System.out.println("Kitaplar isme göre sıralı:");
        for (Book book : bookSetByName) {
            System.out.println(book);
        }

        // Book objelerini sayfa sayısına göre sıralama için yeni bir Set yapısı kullanma
        Set<Book> bookSetByPageCount = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return Integer.compare(book1.getPageCount(), book2.getPageCount());
            }
        });

        bookSetByPageCount.addAll(bookSetByName);

        // Kitapları sayfa sayısına göre sıralı şekilde yazdırma
        System.out.println("\nKitaplar sayfa sayısına göre sıralı:");
        for (Book book : bookSetByPageCount) {
            System.out.println(book);
        }
    }
}