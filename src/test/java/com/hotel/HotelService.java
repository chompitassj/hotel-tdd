package com.hotel;

import java.time.LocalDate;

public class HotelService {

    public String registrarHabitacion(String numero, String cliente, LocalDate fecha) {

        if (numero == null || numero.isBlank() ||
                cliente == null || cliente.isBlank() ||
                fecha == null) {
            return "Debe ingresar los datos requeridos";
        }

        if (!numero.matches("[123][0-9]{2}")) {
            return "Ingrese una habitación valida";
        }

        if (!cliente.matches("[a-zA-Z]{4,}")) {
            return "Recuerde que el nombre del cliente debe contener al menos cuatro caracteres";
        }

        if (!fecha.isAfter(LocalDate.now())) {
            return "Debe ingresar una fecha valida";
        }

        return "Debe ingresar los datos requeridos";
    }
}
