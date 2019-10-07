Random random = new Random()

// Supplier<T>
public String randomStock() {
    String[] stocks = { "GOOG", "IBM", "AMZN" };
    return stocks[random.nextInt(stocks.length)];
}

// Function<T,R> of stock
public double stockOf(String simbol) {
    return Math.random() ;
}

// a Consumer<T>
public void sleep(long millis) {
    try {
        Thread.sleep(millis);
    } catch(Exception e) {

    }
}
