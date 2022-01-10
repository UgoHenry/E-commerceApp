package com.ecommerce.ecommerceApp.controller;

import com.ecommerce.ecommerceApp.model.Product;
import com.ecommerce.ecommerceApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    //to add products
    @GetMapping("/ProductAddPage")
    public String showProductAddForm(Model model){
        Product product = new Product();
        model.addAttribute("product", product);
        return "product_Add";
    }


    //display list of products
    @GetMapping("/ProductListPage")
    public String viewProductList(Model model){
       model.addAttribute("listProduct",productService.listAllProduct());
       return "product_List";
    }

    //save product to Database
    @PostMapping("/saveProduct")
    public String saveProduct(@ModelAttribute("product") Product product){
      productService.saveProduct(product);
      return "redirect:/";
    }

    // delete product list
    @GetMapping("/deleteProduct")
    public String deleteProduct(@PathVariable(value = "id") long id){
        this.productService.deleteProductById(id);
        return "redirect:/";
    }


}
