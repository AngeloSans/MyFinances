package com.projeto.MyFinances.Application.Service;


import com.projeto.MyFinances.Infrastructure.Repository.SpendsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpendsService {

    @Autowired
    SpendsRepository spendsRepository;
}
