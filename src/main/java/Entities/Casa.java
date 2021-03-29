package Entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
public class Casa {

    private String nombre;
    private String direccion;
    private ArrayList<Habitaciones> habitaciones;


}

