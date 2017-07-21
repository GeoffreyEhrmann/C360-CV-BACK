package com.viseo.c360.cv.repositories;

import com.viseo.c360.cv.models.entities.UsersEntity;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface AccountDAO extends CrudRepository<UsersEntity, Long> {

}
