package com.medisoftbackend.paciente;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

    // Spring genera el SQL automáticamente a partir del nombre del método
    Optional<Paciente> findByNumeroDocumento(String numeroDocumento);

    // Útil para validar antes de registrar que no exista un documento repetido
    boolean existsByNumeroDocumento(String numeroDocumento);

}
