package chapter10.threads.protectshareddata;

/**
 * Created by dan on 1/21/17.
 */
public class SynchronizedStatements {
    public static void main(String [] args){
        BookAgain book = new BookAgain();

        Thread task1 = new OnlineBuyBooks(book);
        task1.start();

        Thread task2 = new OnlineBuyBooks(book);
        task2.start();

        Thread task3 = new OnlineReturnBooks(book);
        task3.start();
    }
}

class BookAgain {
    double rank = 10;
    int copiesSold = 0;

    Object objSale = new Object();
    Object objPos = new Object();

    public void newSale() {
        synchronized (objSale){
            ++copiesSold;
            System.out.println("Total copies with the new sale " + copiesSold);
        }
    }

    public void rankImprove() {
        synchronized (objPos) {
            --rank;
            System.out.println("Rank - " + rank);
        }
    }
}

class OnlineBuyBooks extends Thread {
    private BookAgain bookAgain;
    public OnlineBuyBooks(BookAgain bookAgain){
        this.bookAgain = bookAgain;
    }

    @Override
    public void run() {
        bookAgain.newSale();
    }
}

class OnlineReturnBooks extends Thread {
    private BookAgain bookAgain;

    public OnlineReturnBooks(BookAgain bookAgain){
        this.bookAgain = bookAgain;
    }

    @Override
    public void run() {
        bookAgain.rankImprove();
    }
}
