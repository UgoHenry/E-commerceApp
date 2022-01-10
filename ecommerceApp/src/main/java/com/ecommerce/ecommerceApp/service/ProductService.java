package com.ecommerce.ecommerceApp.service;

import com.ecommerce.ecommerceApp.model.Product;
import com.ecommerce.ecommerceApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> listAllProduct(){
        return productRepository.findAll();
    }

    public void saveProduct(Product product){
        this.productRepository.save(product);
    }

    public void deleteProductById(long id){
        this.productRepository.deleteById(id);
    }

  public Product getProductById(long id){
        Optional<Product> optional = productRepository.findById(id);
        Product product = null;
        if (optional.isPresent()){
            product = optional.get();
        }else {
            throw new RuntimeException("Product not found for id ::"+ id);
        }
        return product;
  }
}
