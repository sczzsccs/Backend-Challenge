package MartPayment.Mart.Calculator;

public class Calculator {
    private int amount = 0;

    public void add(Integer value) {
        amount += value;
    }

    public int getTotalAmount() {
        return amount;
    }
}