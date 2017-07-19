package com.viseo.c360.cv.services;

import org.springframework.stereotype.Component;

public interface AccountService {
    boolean exist(String mail, String password);
}
