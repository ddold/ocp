package chapter10.threads.protectshareddata;

/**
 * Created by dan on 1/21/17.
 */
public class NonSynchronizedMethods {
    public static void main(String [] args){
        BookNotSafe bookNotSafe = new BookNotSafe("Java");

        Thread task1 = new OnlineBuy(bookNotSafe);
        task1.start();

        Thread task2 = new OnlineBuy(bookNotSafe);
        task2.start();

        Thread task3 = new OnlineReturn(bookNotSafe);
        task3.start();
    }
}

class OnlineBuy extends Thread {
    private BookNotSafe bookNotSafe;
    public OnlineBuy(BookNotSafe bookNotSafe){
        this.bookNotSafe = bookNotSafe;
    }

    @Override
    public void run() {
        bookNotSafe.newSale();
    }
}

class OnlineReturn extends Thread {
    private BookNotSafe bookNotSafe;

    public OnlineReturn(BookNotSafe bookNotSafe){
        this.bookNotSafe = bookNotSafe;
    }

    @Override
    public void run() {
        bookNotSafe.returnBooks();
    }
}

class BookNotSafe {
    String title;
    int copiesSold = 0;

    BookNotSafe(String title){
        this.title = title;
    }

    public void newSale() {
        ++copiesSold;
        System.out.println("Total copies after this sale is " + copiesSold);
    }

    public void returnBooks() {
        --copiesSold;
        System.out.println("Total copies after this return is " + copiesSold);
    }
}
