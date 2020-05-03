package com.pethoalpar.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.pethoalpar.demo.entity.Store;

public interface IStoreRepository extends CrudRepository<Store, Integer>{

}
