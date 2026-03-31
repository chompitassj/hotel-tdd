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
}
