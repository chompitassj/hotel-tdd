package com.hotel;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class HotelServiceTest {
    @Test
    void deberiaRetornarErrorSiHayCamposVacios() {
        HotelService service = new HotelService();
        String resultado = service.registrarHabitacion("", "Juan", LocalDate.now().plusDays(1));
        assertEquals("Debe ingresar los datos requeridos", resultado);
    }
    @Test
    void deberiaValidarNumeroHabitacion() {
        HotelService service = new HotelService();
        String resultado = service.registrarHabitacion("499", "Juan", LocalDate.now().plusDays(1));
        assertEquals("Ingrese una habitación valida", resultado);
    }
    @Test
    void deberiaValidarNombreCliente() {
        HotelService service = new HotelService();
        String resultado = service.registrarHabitacion("101", "Ana", LocalDate.now().plusDays(1));
        assertEquals("Recuerde que el nombre del cliente debe contener al menos cuatro caracteres", resultado);
    }
    @Test
    void deberiaValidarFechaReserva() {
        HotelService service = new HotelService();
        String resultado = service.registrarHabitacion("101", "Carlos", LocalDate.now());
        assertEquals("Debe ingresar una fecha valida", resultado);
    }
    @Test
    void deberiaRegistrarCorrectamente() {
        HotelService service = new HotelService();
        String resultado = service.registrarHabitacion("101", "Carlos", LocalDate.now().plusDays(1));
        assertEquals("El registro ha sido exitoso", resultado);
    }
}
