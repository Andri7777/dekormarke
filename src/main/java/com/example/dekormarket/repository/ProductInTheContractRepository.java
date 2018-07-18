package com.example.dekormarket.repository;

import com.example.dekormarket.entity.ProductInTheContract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductInTheContractRepository extends JpaRepository<ProductInTheContract,Long> {
}