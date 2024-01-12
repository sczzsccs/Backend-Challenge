package MartPayment.Customer;

import MartPayment.Card.Card;

public class CustomerCard implements Card {
    private final String customerName;
    private int amount;

    public CustomerCard(String name, int amount) {
        customerName = name;
        this.amount = amount;
    }

    @Override
    public void payment(int amount) {
        if(this.amount < amount) {
            System.out.println(customerName + "님 카드에 잔액이 부족합니다.");
            System.out.println("결제취소 카드잔액 : " + this.amount + " 원.");
            return;
        }
        this.amount -= amount;
        System.out.println(customerName + "님 카드에 " + amount + "원 결제 되었습니다.");
        System.out.println("카드잔액 : " + this.amount + " 원.");
    }
}