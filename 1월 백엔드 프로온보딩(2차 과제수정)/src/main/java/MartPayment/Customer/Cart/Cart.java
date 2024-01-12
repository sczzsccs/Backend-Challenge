package MartPayment.Customer.Cart;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;

public class Cart {
    private final LinkedHashMap<String, Integer> productList = new LinkedHashMap<>();
    private final LinkedHashMap<String, LocalDateTime> productDateList = new LinkedHashMap<>();

    public void AddProduct(String NewProduct, int count, LocalDateTime dateTime) {
        productList.put(NewProduct, count);
        productDateList.put(NewProduct, dateTime);
    }
    
    public LinkedHashMap<String, Integer> getProductList() {
        System.out.println("고객님이 담은 상품목록");
        return productList;
    }

    public LinkedHashMap<String, LocalDateTime> getProductDateList() {
        return productDateList;
    }
}
