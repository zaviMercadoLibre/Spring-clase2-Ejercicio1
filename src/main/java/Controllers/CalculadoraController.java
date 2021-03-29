package Controllers;

import Entities.Casa;
import Entities.DtoResponse;
import Services.CalculadoraServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @PostMapping("calculadora")
    public Object calcularArea(@RequestBody Casa objCasa){

        DtoResponse res = new DtoResponse();


        res.setMetrosCuadrados(CalculadoraServices.calcularArea(objCasa.getHabitaciones()));
        res.setValorCasa(res.getMetrosCuadrados()*800);
        res.setHabitacionMasGrande(CalculadoraServices.habitacionMasGrande(objCasa.getHabitaciones()));
        res.setMetrosPorHabitacion(CalculadoraServices.metrosPorHabitacion(objCasa.getHabitaciones()));

        return res;
    }
    @GetMapping("hello")
    public String hello(){
        return "viendo si anda el servidor";
    }
}
