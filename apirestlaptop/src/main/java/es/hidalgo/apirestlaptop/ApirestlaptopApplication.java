package es.hidalgo.apirestlaptop;

import es.hidalgo.apirestlaptop.entitites.Laptop;
import es.hidalgo.apirestlaptop.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class ApirestlaptopApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ApirestlaptopApplication.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop laptop = new Laptop(null, "Apple", "MacBookPro", 1.599, LocalDate.of(2020, 10, 23));
		Laptop laptop1 = new Laptop(null, "Lenovo", "Lenovo Yoga 7i", 1.099, LocalDate.of(2021, 9, 12));

		// almacenar laptop
		System.out.println("Número de libros en base de datos: " + repository.findAll().size());

		repository.save(laptop);
		repository.save(laptop1);

		//recuperar laptop
		System.out.println("Número de libros en base de datos: "+ repository.findAll().size());

		//borrar un libro

	}



}
