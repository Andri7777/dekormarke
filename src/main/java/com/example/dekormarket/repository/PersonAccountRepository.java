package com.example.dekormarket.repository;

import com.example.dekormarket.entity.PersonAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonAccountRepository extends JpaRepository<PersonAccount,Long>{
}
