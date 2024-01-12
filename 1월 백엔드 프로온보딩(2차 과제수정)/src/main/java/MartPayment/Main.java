package MartPayment;

import MartPayment.Customer.Customer;
import MartPayment.Mart.MartOwner;
import MartPayment.Mart.Product.MartProduct;
import MartPayment.Mart.Product.Product;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // 마트 생성
        MartOwner martowner = new MartOwner();
        // 상품 진열
        Product martProduct = new MartProduct();
        martowner.setMartProductList(martProduct);
        martProduct.viewProducts();

        Customer customer1 = new Customer("Aja", 35000);
        customer1.AddProduct("Coke", 2, LocalDateTime.of(2024, 6, 14, 10, 34));
        customer1.AddProduct("Chicken" ,1, LocalDateTime.of(2024, 1, 14, 19, 55));

        Customer customer2 = new Customer("Diss", 25000);
        customer2.AddProduct("Banana", 1, LocalDateTime.of(2024, 2, 1, 14, 25));
        customer2.AddProduct("Milk", 1, LocalDateTime.of(2024, 1, 21, 5, 33));
        customer2.AddProduct("Cider", 1, LocalDateTime.of(2025, 1, 14, 10, 19));

        Customer customer3 = new Customer("Kilsn", 15000);
        customer3.AddProduct("Water", 1, LocalDateTime.of(2025, 1, 10, 5, 15));
        customer3.AddProduct("Ramen", 1, LocalDateTime.of(2024, 11, 17, 12, 55));
        customer3.AddProduct("CoffeeMix", 1, LocalDateTime.of(2024, 9, 16, 15, 10));
        customer3.AddProduct("CanCoffee", 1, LocalDateTime.of(2024, 3, 14, 2, 28));

        // 계산 진행
        martowner.receiveCart(customer1.sendCart(), customer1.sendCard());
        martowner.receiveCart(customer2.sendCart(), customer2.sendCard());
        martowner.receiveCart(customer3.sendCart(), customer3.sendCard());
    }
}