package my.app.MySite.controller;

import my.app.MySite.models.Product;
import my.app.MySite.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {

    private final ProductService productService;

    public AppController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String mainPage(Model model) {
        model.addAttribute("products", productService.getProducts());
        return "mainPage";
    }

    @GetMapping("/product/{id}")
    public String aboutProduct(@PathVariable Long id, Model model){
        model.addAttribute("product", productService.getProductById(id));
        return "aboutProduct";
    }

    @PostMapping("/product/create")
    public String createProduct(Product product){
        productService.saveProduct(product);
        return "redirect:/";
    }

    @PostMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
        return "redirect:/";
    }
}
