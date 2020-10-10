package ru.springcontext.quoter;

import javax.annotation.PostConstruct;


@Profiling
public class QuoterImplementation implements Quoter {

    @RandomRepeat(min = 2, max = 10)
    private int repeat;
    private String quote;

    @PostConstruct
    public void init(){
        System.out.println("Phase 2");
    }

    public QuoterImplementation() {
        System.out.println("Phase 1");
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(quote);
        }
    }
}
