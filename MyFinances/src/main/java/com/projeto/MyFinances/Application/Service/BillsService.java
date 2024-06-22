package com.projeto.MyFinances.Application.Service;

import com.projeto.MyFinances.Domain.Entity.Bills;
import com.projeto.MyFinances.Infrastructure.Repository.BillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BillsService {

    @Autowired
    BillsRepository billsRepository;

    public List<Bills> getAllBills() {
        return billsRepository.findAll();
    }

    public Bills saveBills(Bills bills) {
        return billsRepository.save(bills);
    }

    public void deleteBills(Long id) throws Exception {
        Optional<Bills> bills = billsRepository.findById(id);
        if (!bills.isPresent()) {
            throw new Exception("Bill not found");
        }
        billsRepository.deleteById(id);
    }
}
