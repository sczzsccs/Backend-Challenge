package MartPayment.Mart;

import MartPayment.Card.Card;
import MartPayment.Customer.Cart.Cart;
import MartPayment.Mart.Calculator.Calculator;
import MartPayment.Mart.Product.Product;

import java.util.Map;

public class MartOwner {
    private Calculator calculator;
    private Cart cart;

    public void setMartProductList(Product martProductList) {
        calculator = new Calculator(martProductList);
    }

    public void receiveCart(Cart customerCart, Card customerCard) {
        cart = customerCart;
        takeOutProduct(customerCard);
    }

    private void takeOutProduct(Card card) {
        for (Map.Entry<String, Integer> customProduct : cart.getProductList().entrySet()) {
            String  item = customProduct.getKey();
            int count = customProduct.getValue();
            System.out.println("선택한 상품 : " + item);
            calculator.add(item, count, cart.getProductDateList().get(item));
        }
        int amount = calculator.getTotalAmount();
        System.out.println("총 지불해야할 금액 : " + amount + " 원");
        card.payment(amount);
        System.out.println("고객이 마트를 떠났습니다.");
    }
}