package br.com.microservice.car.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.microservice.car.domains.Car;
import br.com.microservice.car.repositories.CarRepository;

@Service
public class CarService {
	
	private CarRepository carRepository;

	@Autowired
	public CarService(CarRepository carRepository) {
		this.carRepository = carRepository;
	}
	
	public Car saveCar(Car car) {
		return carRepository.save(car);
	}
	
	public List<Car> listAllCars(){
		return carRepository.findAll();
	}

}
