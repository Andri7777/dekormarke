package com.example.dekormarket.service.serviceImpl;

import com.example.dekormarket.dto.ProductRequest;
import com.example.dekormarket.dto.ProductResponce;
import com.example.dekormarket.entity.Product;
import com.example.dekormarket.repository.ProductRepository;
import com.example.dekormarket.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public ProductResponce save(ProductRequest productRequest) {
        Product product = new Product();
        product.setName(productRequest.getName());
        product.setPrice(productRequest.getPrice());
        product.setSpecification(productRequest.getSpecification());
        product.setPresence(productRequest.isPresence());
        product = productRepository.findOne(productRequest.getIdProduct());
        return new ProductResponce(productRepository.save(product));
    }

    @Override
    public Product findOne(Long id) {
        return productRepository.findOne(id);
    }

    @Override
    public void delete(Long id) {
        productRepository.delete(id);

    }
}
