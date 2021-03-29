package clase2Spring.CalcMetrosCuadrados;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"Controllers"})
public class CalcMetrosCuadradosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalcMetrosCuadradosApplication.class, args);
	}

}
