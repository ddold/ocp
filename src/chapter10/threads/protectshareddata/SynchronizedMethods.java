package chapter10.threads.protectshareddata;

/**
 * Created by dan on 1/21/17.
 */
public class SynchronizedMethods {
    public static void main(String [] args){
        BookSafe book = new BookSafe("Java");

        Thread task1 = new OnlineBuyBook(book);
        task1.start();

        Thread task2 = new OnlineBuyBook(book);
        task2.start();

        Thread task3 = new OnlineReturnBook(book);
        task3.start();
    }
}

class BookSafe {
    String title;
    int copiesSold = 0;

    BookSafe(String title){
        this.title = title;
    }

    synchronized public void newSale() {
        ++copiesSold;
        System.out.println("Total copies after this sale is " + copiesSold);
    }

    synchronized public void returnBooks() {
        --copiesSold;
        System.out.println("Total copies after this return is " + copiesSold);
    }
}

class OnlineBuyBook extends Thread {
    private BookSafe bookSafe;
    public OnlineBuyBook(BookSafe bookSafe){
        this.bookSafe = bookSafe;
    }

    @Override
    public void run() {
        bookSafe.newSale();
    }
}

class OnlineReturnBook extends Thread {
    private BookSafe bookSafe;

    public OnlineReturnBook(BookSafe bookSafe){
        this.bookSafe = bookSafe;
    }

    @Override
    public void run() {
        bookSafe.returnBooks();
    }
}
