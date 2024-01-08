package MartPayment.Mart;

import MartPayment.Customer.Cart.Cart;
import MartPayment.Mart.Calculator.Calculator;
import java.util.Map;

public class MartOwner {
    private Calculator calculator = new Calculator();
    private Cart cart;

    public void sendCart(Cart customerCart) {
        cart = customerCart;
        takeOutProduct();
    }

    private void takeOutProduct() {
        for (Map.Entry<String, Integer> customProduct : cart.getProductList().entrySet()) {
            System.out.println("구입한 상품 : " + customProduct.getKey());
            calculator.add(customProduct.getValue());
        }
        System.out.println("총 지불해야할 금액 : " + calculator.getTotalAmount());
        System.out.println("고객이 마트를 떠났습니다.");
    }
}