package com.example.dekormarket.repository;

import com.example.dekormarket.entity.SubCategoryDekor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubCategoryDekorRepository extends JpaRepository<SubCategoryDekor,Long>{
}
