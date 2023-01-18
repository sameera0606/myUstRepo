package com.ust.farmer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.farmer.model.Field;

public interface fieldRepository extends JpaRepository<Field,Integer> {

}
