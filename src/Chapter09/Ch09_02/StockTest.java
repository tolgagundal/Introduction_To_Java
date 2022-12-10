package Chapter09.Ch09_02;

public class StockTest {
    public static void main(String[] args) {

        Stock object = new Stock("ORCL", "Oracle Corporation");

        // Atama yapmak için set methodlarını çağır.

        object.setPreviousClosingPrice(34.5);
        object.setCurrentPrice(34.35);

        System.out.println("Name: " + object.getName() + " , Symbol: " + object.getSymbol() + " , Percentage: " + object.getChangePercent() );
    }
}
