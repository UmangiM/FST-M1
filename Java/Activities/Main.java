package Activities;

public class Main {
    public static void main(String[] args) {
        // Create object of MyBook
        MyBook newNovel = new MyBook();

        // Set the book title
        newNovel.setTitle("The Wisdom");

        // Print the book title
        System.out.println("The title of the book is: " + newNovel.getTitle());
    }
}
