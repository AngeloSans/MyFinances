package com.projeto.MyFinances.Application.Service;


import com.projeto.MyFinances.Domain.Entity.Bills;
import com.projeto.MyFinances.Domain.Entity.Bills;
import com.projeto.MyFinances.Infrastructure.Repository.BillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillsService {

    @Autowired
    BillsRepository billsRepository;

    public Bills saveBills(Bills bills){
        return billsRepository.save(bills);
    }
}
