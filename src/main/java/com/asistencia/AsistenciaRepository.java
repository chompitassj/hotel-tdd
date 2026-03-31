package com.asistencia;

public interface AsistenciaRepository {
    boolean yaMarco(String codigo);
    void registrar(String codigo);
}
