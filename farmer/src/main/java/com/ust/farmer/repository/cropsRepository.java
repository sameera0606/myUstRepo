package com.ust.farmer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.farmer.model.Crops;

public interface cropsRepository extends JpaRepository<Crops,Integer> {

}
