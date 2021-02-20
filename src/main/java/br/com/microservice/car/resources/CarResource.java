package br.com.microservice.car.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservice.car.domains.Car;
import br.com.microservice.car.services.CarService;

@RestController
@RequestMapping(value = "/cars")
public class CarResource {
	
	private CarService carService;

	@Autowired
	public CarResource(CarService carService) {
		this.carService = carService;
	}
	
	@PostMapping
	public ResponseEntity<Car> save(@RequestBody Car car){
		
		Car createCar = carService.saveCar(car);
		return ResponseEntity.status(HttpStatus.CREATED).body(createCar);
		
	}
	
	@GetMapping
	public ResponseEntity<List<Car>> list(){
		
		List<Car> cars = carService.listAllCars();
		return ResponseEntity.status(HttpStatus.OK).body(cars);
		
	}

}
