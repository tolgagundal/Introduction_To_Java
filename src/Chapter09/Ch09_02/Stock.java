package Chapter09.Ch09_02;

public class Stock {
    // data field
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    // Constructur
    public Stock() {
    }

    public Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }
    String getName() {
        return this.name;
    }
    String getSymbol() {
        return this.symbol;
    }
    // Sadece atama yapmak istediğimizden void ile methodu yaz.
    void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }
    void setCurrentPrice(double currentPrice) {
        this.currentPrice =currentPrice;
    }

    // Bir sonuç elde etmek istiyorsak return kullan.

    double getChangePercent() {
        return (currentPrice - previousClosingPrice) * 100 / currentPrice;
    }
}
