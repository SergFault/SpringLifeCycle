package ru.springcontext.quoter;

public class QuoterImplementation implements Quoter {

    @RandomRepeat(min = 2, max = 10)
    private int repeat;

    private String quote;

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(quote);
        }
    }
}
