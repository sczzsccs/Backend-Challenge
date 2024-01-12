package MartPayment.Customer;

import MartPayment.Card.Card;
import MartPayment.Customer.Cart.Cart;

import java.time.LocalDateTime;

public class Customer {
    private final Card myCard;
    private final Cart NewCart;
    private final String customerName;

    public Customer(String Name, int amount) {
        System.out.println("\nOO 마트 입장. 고객 : " + Name);
        myCard = new CustomerCard(Name, amount);
        customerName = Name;
        NewCart = new Cart();
    }

    public void AddProduct(String product, int count, LocalDateTime dateTime) {
        NewCart.AddProduct(product, count, dateTime);
        System.out.println(customerName + " 고객님이 카트에 " + product + ", " + count + "개 담음");
    }

    public Cart sendCart() {
        System.out.println("\n" + customerName + " 고객님이 카트를 계산대로 이동");
        return NewCart;
    }

    public Card sendCard() {
        System.out.println("계산 진행");
        return myCard;
    }
}