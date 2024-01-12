package MartPayment.Mart.Calculator;

import MartPayment.Mart.Product.Product;

import java.time.LocalDateTime;

public class Calculator {
    private int amount = 0;
    private final Product martProductList;

    public Calculator(Product martProductList) {
        this.martProductList = martProductList;
    }

    public void add(String martItem, Integer value, LocalDateTime dateTime) {
        double Discount = BestDiscountPolisy(dateTime);
        amount += (int) (martProductList.match(martItem) * value * Discount);
    }

    public int getTotalAmount() {
        return amount;
    }

    private boolean isperiodDiscount(LocalDateTime dateTime) {
        if (LocalDateTime.now().getYear() == dateTime.getYear()
                && LocalDateTime.now().getDayOfMonth() - dateTime.getDayOfMonth() <= 1) {
            return true;
        }
        return false;
    }

    private boolean isTimeSale(LocalDateTime dateTime) {
        int time = dateTime.getHour();
        if (2 <= time && time <= 5) {
            return true;
        }
        return false;
    }

    private double BestDiscountPolisy(LocalDateTime dateTime) {
        final double periodDiscount = 0.7;
        final double timesale = 0.3;
        double Discount = 1;

        boolean isTime = isTimeSale(dateTime);
        boolean isPeriod = isperiodDiscount(dateTime);

        if (isTime && isPeriod) {
            Discount = Math.max(periodDiscount, timesale);
            System.out.println("할인 품목 : " + (int)(Discount*100) + "% 할인 적용");
            return Discount;
        }
        else if (isPeriod) {
            Discount = periodDiscount;
            System.out.println("할인 품목 : " + (int)(Discount*100) + "% 할인 적용");
            return Discount;
        }
        else if (isTime) {
            Discount = timesale;
            System.out.println("할인 품목 : " + (int)(Discount*100) + "% 할인 적용");
            return Discount;
        }
        return Discount;
    }
}