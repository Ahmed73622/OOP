package OOP;

public class Book {

    private boolean __lend;

    public void returning() {
        __lend = false;
    }

    public boolean isLend()
    {
        return __lend;
    }

    public void lend() {
        __lend = true;
    }
}
