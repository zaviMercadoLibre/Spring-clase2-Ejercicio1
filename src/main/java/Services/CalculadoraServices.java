package Services;

import Entities.Habitaciones;

import java.util.ArrayList;

public class CalculadoraServices {

    public static double calcularArea(ArrayList<Habitaciones> habitacion){

        double areaTotal = 0;
        //{nombre:baño  ,ancho:3,largo3:}{nombre:pieza ,ancho:5,largo:4}{nombre:comedor, ancho:6,largo:6}
        for (Habitaciones h : habitacion) {
            areaTotal = areaTotal + h.getAncho() * h.getLargo();
        }
        return areaTotal;
    }

    public static Habitaciones habitacionMasGrande(ArrayList<Habitaciones> habitacion){
        Habitaciones mayorArea = habitacion.get(0);
        double mayorHabitacion = habitacion.get(0).getAncho() * habitacion.get(0).getLargo();
        double aux = 0;
        for (int i = 1; i < habitacion.size(); i++) {
            aux = habitacion.get(i).getAncho() * habitacion.get(i).getLargo();
            if(mayorHabitacion < aux ){
                mayorHabitacion = aux;
                mayorArea = habitacion.get(i);
            }
        }

        return mayorArea;

    }
    public static ArrayList<Double> metrosPorHabitacion(ArrayList<Habitaciones> habitacion){

        ArrayList<Double> metrosPorHab = new ArrayList<>();

        for (Habitaciones h: habitacion ) {
            metrosPorHab.add((double) (h.getAncho()*h.getLargo()));
        }
        return metrosPorHab;
    }


}
