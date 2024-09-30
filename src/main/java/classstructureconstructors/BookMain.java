package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("William Shakespear", "Romeo and Juliet");
        book.register("159753456");
        System.out.println("Registered book is " + book.getTitle() + " (by " + book.getAuthor() + ") with registration number: "+ book.getRegNumber());

    }
}
