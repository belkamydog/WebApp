package my.app.MySite.service;

import my.app.MySite.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;

    {
        products.add(new Product(++ID, "MacBook Air", "new mac", 100000, "Kazan", "Sasha"));
        products.add(new Product(++ID, "Iphone", "Iphone10", 50000, "Kazan", "Nikolay"));

    }

    public List<Product> getProducts() {
        return products;
    }

    public void saveProduct(Product product) {
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProduct(long id) {
        products.removeIf(product -> product.getId() == id);
    }

    public Product getProductById(Long id) {
        for (Product i : products) {
            if (i.getId() == id) return i;
        }
        return null;
    }
}
