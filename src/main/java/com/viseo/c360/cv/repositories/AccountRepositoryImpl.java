package com.viseo.c360.cv.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class AccountRepositoryImpl implements AccountRepository {

    @Override
    public boolean exist(String mail, String password) {
        if(mail.equals("test@test.try")){
            return true;
        }else{
            return false;
        }
    }
}
