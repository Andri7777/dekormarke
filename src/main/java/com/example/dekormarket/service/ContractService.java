package com.example.dekormarket.service;

import com.example.dekormarket.dto.ContractRequest;
import com.example.dekormarket.dto.ContractResponce;
import com.example.dekormarket.entity.Contract;

import java.util.List;

public interface ContractService {

    ContractResponce save(ContractRequest contractRequest);
    List<Contract> findAll();
}
