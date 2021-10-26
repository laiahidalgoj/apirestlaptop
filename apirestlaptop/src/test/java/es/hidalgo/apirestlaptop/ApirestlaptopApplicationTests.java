package es.hidalgo.apirestlaptop;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApirestlaptopApplicationTests {

	//esto es para imprimir las variables de entorno
	@Test
	void contextLoads() {
		System.getenv().forEach(
				(key, value) -> System.out.println(key + " " + value)
		);
	}

}
