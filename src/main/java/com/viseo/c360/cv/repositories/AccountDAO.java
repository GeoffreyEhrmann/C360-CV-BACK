package com.viseo.c360.cv.repositories;

import com.viseo.c360.cv.models.UsersEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
public interface AccountDAO extends CrudRepository<UsersEntity, Long> {

}
