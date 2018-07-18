package com.example.dekormarket.service.serviceImpl;

import com.example.dekormarket.dto.ContractRequest;
import com.example.dekormarket.dto.ContractResponce;
import com.example.dekormarket.entity.Contract;
import com.example.dekormarket.repository.ContractRepository;
import com.example.dekormarket.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {

    @Autowired
    private ContractRepository contractRepository;

    @Override
    public ContractResponce save(ContractRequest contractRequest) {
        Contract contract = new Contract();
        contract.setName(contractRequest.getName());
        contract.setPhone(contractRequest.getPhone());
        contract.setProductName(contractRequest.getProductName());
        contract.setNumberContract(contractRequest.getNumberContract());
        contract.setProductPrice(contractRequest.getProductPrice());
        contract.setQuantity(contractRequest.getQuantity());
        contract.setDelivery(contractRequest.isDelivery());
        contract = contractRepository.save(contract);
        return new ContractResponce(contractRepository.save(contract));
    }

    @Override
    public List<Contract> findAll() {
        return contractRepository.findAll();
    }
}
