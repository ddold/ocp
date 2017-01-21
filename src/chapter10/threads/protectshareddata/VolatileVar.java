package chapter10.threads.protectshareddata;

/**
 * Created by dan on 1/21/17.
 */
public class VolatileVar {
    volatile boolean closeAcct = false;

    public void markClosure() {

        closeAcct = true;
    }

    public void closeAcct() {
        if(closeAcct) {
            // code to close account
        }
    }
}

class StockData{}
class StockExchange {
    static volatile StockData data = null;
    static void loadStockData() {
        // method to do shit
    }
}
class BuyStocks {
    public void buy() {
        if(StockExchange.data != null){
            // do shit
            /**
             * Here if the reference var isn't defined as volatile other classes might
             * access it before it's completely initialized
             */
        }
    }
}