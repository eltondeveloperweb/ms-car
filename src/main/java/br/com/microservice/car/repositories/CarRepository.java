package br.com.microservice.car.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.microservice.car.domains.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long>{

}
