package com.example.dekormarket.controller;


import com.example.dekormarket.dto.ContractRequest;
import com.example.dekormarket.dto.ContractResponce;
import com.example.dekormarket.entity.Contract;
import com.example.dekormarket.repository.ContractRepository;
import com.example.dekormarket.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/contract1")
public class ContractController {

    @Autowired
    private ContractService contractService;

    @PostMapping
    public ContractResponce save(@RequestBody ContractRequest contractRequest){
//        contractService.save(contractRequest);
        return contractService.save(contractRequest);
    }
    @GetMapping
    public List<Contract> finContracts(){
        return contractService.findAll();
    }
}
