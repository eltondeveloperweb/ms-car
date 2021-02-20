package br.com.microservice.car.services;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.microservice.car.domains.Car;

@SpringBootTest
public class CarServiceTests {
	
	@Autowired
	private CarService service;
	
	@Test
	public void saveCarTest() {
		
		Car car = new Car(null, "Caravan");
		service.saveCar(car);
		
		assertThat(car.getId()).isEqualTo(6L);
		
	}
	
	@Test
	public void getListCars() {
		
		List<Car> cars = service.listAllCars();
		
		assertThat(cars.size()).isEqualTo(5L);
	}

}
