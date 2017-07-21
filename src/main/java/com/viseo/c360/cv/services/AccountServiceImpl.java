package com.viseo.c360.cv.services;


import com.viseo.c360.cv.models.entities.UsersEntity;
import com.viseo.c360.cv.repositories.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountDAO accountDAO;

    @Override
    public boolean exist(String mail, String password) {

        //accountDAO.findByMailAnd();

        Iterable<UsersEntity> aa = accountDAO.findAll();
        return false;
    }
}
