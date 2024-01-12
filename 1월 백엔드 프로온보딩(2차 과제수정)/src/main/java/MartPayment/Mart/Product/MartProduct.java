package MartPayment.Mart.Product;

import java.util.LinkedHashMap;
import java.util.Map;

public class MartProduct implements Product {
    private final LinkedHashMap<String, Integer> martProducts = new LinkedHashMap<>();

    public MartProduct() {
        martProducts.put("Banana", 5530);
        martProducts.put("Chicken", 7500);
        martProducts.put("Coke", 1800);
        martProducts.put("Ramen", 1440);
        martProducts.put("Milk", 2670);
        martProducts.put("CoffeeMix", 20900);
        martProducts.put("CanCoffee", 1960);
        martProducts.put("Water", 820);
        martProducts.put("Cider", 1580);
    }

    @Override
    public Integer match(String newProduct) {
        return martProducts.get(newProduct);
    }

    public void viewProducts() {
        System.out.println("-- 마트에 진열된 상품 목록 --");
        for(Map.Entry<String, Integer> elem : martProducts.entrySet()){
            System.out.println("상품 : " + elem.getKey() + " / 가격 : " + elem.getValue() + " 원");
        }
        System.out.println("------------------------");
    }
}