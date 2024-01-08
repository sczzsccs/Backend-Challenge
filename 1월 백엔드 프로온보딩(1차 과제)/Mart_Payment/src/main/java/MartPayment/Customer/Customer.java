package MartPayment.Customer;

import MartPayment.Customer.Cart.Cart;
import MartPayment.Mart.Product.Product;

public class Customer {
    private final Cart NewCart;
    private final String customerName;

    public Customer(Product martProduct, String Name) {
        customerName = Name;
        System.out.println("\nOO 마트 입장. 고객 : " + customerName);
        NewCart = new Cart(martProduct);
    }

    public void AddProduct(String product) {
        NewCart.AddProduct(product);
        System.out.println(customerName + " 고객님이 카트에 " + product + " 담음");
    }

    public Cart getCart() {
        System.out.println("\n" + customerName + " 고객님이 카트를 계산대로 이동");
        return NewCart;
    }
}