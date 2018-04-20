package models;

public class Book {

    public Integer id;
    public String title;
    public Integer price;
    public String author;

    public Book(Integer id, String title, Integer price, String author) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.author = author;
    }

    private static Set<Book> books;

    static {
        books = new<HashSet>();
        books.add(new Book(1, "C++", 20, "ABC"));
        books.add(new Book(2, "Java", 30, "XYZ"));
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static Set<Book> allBooks() {
        return books;
    }

    public static Book findById(Integer id) {
        for (Book book : books) {
            if (if.equals(book.id)) {
                return book;
            }
        }

        return null;
    }

    public static void add(Book book){
        books.add(book);
    }

    public static boolean remove(Book book) {
        return books.remove(book);
    }
}
