package chapter10.threads.identifyandfixcodeinmultithreadedenv;

/**
 * Created by dan on 1/21/17.
 */
public class InconsistentMemory {
    public static void main(String [] args){
        Book book = new Book();
        Thread buy = new OnlineBuy(book);
        Thread enquire = new OnlineEnquiry(book);
        buy.start();
        enquire.start();
    }
}

class Book {
    private int copiesSold = 0;

    public void newSale() {
        ++copiesSold;
    }

    public int getCopiesSold() {
        return copiesSold;
    }
}

class OnlineBuy extends Thread {
    private Book book;

    public OnlineBuy(Book book){
        this.book = book;
    }

    @Override
    public void run() {
        book.newSale();
    }
}

class OnlineEnquiry extends Thread {
    private Book book;

    public OnlineEnquiry(Book book) {
        this.book = book;
    }

    @Override
    public void run() {
        System.out.println(book.getCopiesSold());
    }
}
