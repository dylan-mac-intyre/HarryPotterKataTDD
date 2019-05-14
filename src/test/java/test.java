import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test {

    @Test
    public void buyOneBook() {
        Book HPBook = new Book();
        HPBook.add("Book1");
        double total = HPBook.calculate();
        assertEquals(8.0, total, 0);
    }

    @Test
    public void buyTwoOfTheSameBook() {
        Book HPBook = new Book();
        HPBook.add("Book1");
        HPBook.add("Book1");
        double total = HPBook.calculate();
        assertEquals(16.0, total, 0);
    }

    @Test
    public void buyTwoDifferentBooks() {
        Book HPBook = new Book();
        HPBook.add("Book1");
        HPBook.add("Book2");
        double total = HPBook.calculate();
        assertEquals(15.20, total, 0);
    }
    @Test
    public void buyLoadsOfBooks() {
        Book HPBook = new Book();
        HPBook.add("Book1");
        HPBook.add("Book1");
        HPBook.add("Book2");
        HPBook.add("Book2");
        HPBook.add("Book3");
        HPBook.add("Book3");
        HPBook.add("Book4");
        HPBook.add("Book5");

        double total = HPBook.calculate();
        assertEquals(51.60, total, 0);
    }
    @Test
    public void buyLoadsOfBooksAgain() {
        Book HPBook = new Book();
        HPBook.add("Book1");
        HPBook.add("Book1");
        HPBook.add("Book1");
        HPBook.add("Book1");
        HPBook.add("Book2");
        HPBook.add("Book2");
        HPBook.add("Book2");
        HPBook.add("Book2");
        HPBook.add("Book2");
        HPBook.add("Book3");
        HPBook.add("Book3");
        HPBook.add("Book4");
        HPBook.add("Book4");
        HPBook.add("Book5");
        HPBook.add("Book5");
        HPBook.add("Book5");

        double total = HPBook.calculate();
        assertEquals(104.80, total, 0);
    }
}
