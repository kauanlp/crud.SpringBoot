package com.javaparainiciantes.boot.restapicrudexample;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long>{

}