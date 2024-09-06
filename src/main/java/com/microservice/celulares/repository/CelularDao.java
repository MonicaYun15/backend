package com.microservice.celulares.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microservice.celulares.entity.Celular;


@Repository
public interface CelularDao extends CrudRepository<Celular, Long>{


}
