package MartPayment;

import MartPayment.Customer.Customer;
import MartPayment.Mart.MartOwner;
import MartPayment.Mart.Product.MartProduct;
import MartPayment.Mart.Product.Product;

public class Main {
    public static void main(String[] args) {
        // 마트 생성
        MartOwner martowner = new MartOwner();
        // 상품 진열
        Product martProduct = new MartProduct();
        martProduct.viewProducts();

        Customer customer1 = new Customer(martProduct, "1번째");
        customer1.AddProduct("Coke");
        customer1.AddProduct("Coke");
        customer1.AddProduct("Chicken");

        Customer customer2 = new Customer(martProduct, "2번째");
        customer2.AddProduct("Banana");
        customer2.AddProduct("Milk");
        customer2.AddProduct("Cider");

        Customer customer3 = new Customer(martProduct, "3번째");
        customer3.AddProduct("Water");
        customer3.AddProduct("Ramen");
        customer3.AddProduct("CoffeeMix");
        customer3.AddProduct("CanCoffee");


        // 계산 진행
        martowner.sendCart(customer1.getCart());
        martowner.sendCart(customer2.getCart());
        martowner.sendCart(customer3.getCart());
    }
}