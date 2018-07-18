package com.example.dekormarket.repository;

import com.example.dekormarket.entity.CategoryDekor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDekorRepository extends JpaRepository<CategoryDekor,Long>{

}
