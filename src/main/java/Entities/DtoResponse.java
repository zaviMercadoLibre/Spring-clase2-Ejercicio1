package Entities;

import lombok.Data;

import java.util.ArrayList;
@Data

public class DtoResponse {
    private double metrosCuadrados;
    private double valorCasa;
    private Habitaciones habitacionMasGrande;
    private ArrayList<Double> metrosPorHabitacion;
}
