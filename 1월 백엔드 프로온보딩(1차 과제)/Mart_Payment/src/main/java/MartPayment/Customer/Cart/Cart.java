package MartPayment.Customer.Cart;

import MartPayment.Mart.Product.Product;
import java.util.LinkedHashMap;

public class Cart {
    private final Product cartProduct;
    private final LinkedHashMap<String, Integer> productList = new LinkedHashMap<>();

    public Cart(Product product) {
        cartProduct = product;
    }

    public void AddProduct(String NewProduct) {
        Integer price = productList.get(NewProduct);
        if (price != null) {
            productList.put(NewProduct, cartProduct.match(NewProduct) + price);
        } else {
            productList.put(NewProduct, cartProduct.match(NewProduct));
        }
    }
    
    public LinkedHashMap<String, Integer> getProductList() {
        System.out.println("고객님이 담은 상품목록");
        return productList;
    }
}
