package com.viseo.c360.cv.services;


import com.viseo.c360.cv.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public boolean exist(String mail, String password) {

        return accountRepository.exist(mail,password);
    }
}
