package com.projeto.MyFinances.Application.Service;


import com.projeto.MyFinances.Infrastructure.Repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountsService {

    @Autowired
    AccountsRepository accountsRepository;
}
