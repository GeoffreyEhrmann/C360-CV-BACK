package com.viseo.c360.cv.repositories;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

public interface AccountRepository {

    boolean exist(String mail, String password);
}
