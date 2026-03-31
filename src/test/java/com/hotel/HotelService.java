package com.hotel;

import java.time.LocalDate;

public class HotelService {

    public String registrarHabitacion(String numero, String cliente, LocalDate fecha) {

        if (numero == null || numero.isBlank() ||
                cliente == null || cliente.isBlank() ||
                fecha == null) {
            return "Debe ingresar los datos requeridos";
        }

        return "Debe ingresar los datos requeridos";
    }
}
