package sr.unasat.cryptocheck;

public class CryptoDTO {
    private String name;
    private String symbol;
    private String rank;
    private String price_usd;
    private String price_eur;
    private String percent_change_1h;
    private String percent_change_24h;
    private String percent_change_7d;
    private String last_updated;

    public CryptoDTO() {
    }

    public CryptoDTO(String name, String symbol, String rank, String price_usd,
                     String percent_change_1h, String percent_change_24h,
                     String percent_change_7d, String last_updated) {
        this.name = name;
        this.symbol = symbol;
        this.rank = rank;
        this.price_usd = price_usd;
        this.percent_change_1h = percent_change_1h;
        this.percent_change_24h = percent_change_24h;
        this.percent_change_7d = percent_change_7d;
        this.last_updated = last_updated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getPrice_usd() {
        return price_usd;
    }

    public void setPrice_usd(String price_usd) {
        this.price_usd = price_usd;
    }

    public String getPrice_eur() {
        return price_eur;
    }

    public void setPrice_eur(String price_eur) {
        this.price_eur = price_eur;
    }

    public String getPercent_change_1h() {
        return percent_change_1h;
    }

    public void setPercent_change_1h(String percent_change_1h) {
        this.percent_change_1h = percent_change_1h;
    }

    public String getPercent_change_24h() {
        return percent_change_24h;
    }

    public void setPercent_change_24h(String percent_change_24h) {
        this.percent_change_24h = percent_change_24h;
    }

    public String getPercent_change_7d() {
        return percent_change_7d;
    }

    public void setPercent_change_7d(String percent_change_7d) {
        this.percent_change_7d = percent_change_7d;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Symbol: " + symbol + "\n" +
                "Rank: " + rank + "\n" +
                "Price USD: " + price_usd + "\n" +
                "Percentage Change 1H: " + percent_change_1h + "\n" +
                "Percentage Change 24H: " + percent_change_24h + "\n" +
                "Percentage Change 7D: " + percent_change_7d + "\n" +
                "Last Updated:" + last_updated;
    }
}
