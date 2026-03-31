package com.asistencia;

public class AsistenciaService {

    private AsistenciaRepository repository;

    public AsistenciaService(AsistenciaRepository repository) {
        this.repository = repository;
    }

    public String marcarAsistencia(String codigo) {

        if (codigo == null || codigo.isBlank()) {
            return "Identificación inválida";
        }

        if (repository.yaMarco(codigo)) {
            return "No se permite doble marcación";
        }

        repository.registrar(codigo);
        return "Registro exitoso";
    }
}