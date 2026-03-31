package com.asistencia;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class AsistenciaServiceTest {

    @Test
    void noDebePermitirDobleMarcacion() {

        AsistenciaRepository repoMock = mock(AsistenciaRepository.class);

        when(repoMock.yaMarco("123"))
                .thenReturn(true);

        AsistenciaService service = new AsistenciaService(repoMock);

        String resultado = service.marcarAsistencia("123");

        assertEquals("No se permite doble marcación", resultado);
    }
}
