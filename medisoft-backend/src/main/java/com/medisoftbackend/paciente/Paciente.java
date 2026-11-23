package com.medisoftbackend.paciente;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "pacientes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, nullable = false, length = 20)
    private String numeroDocumento;

    @Column(nullable = false, length = 100)
    private String nombres;

    @Column(nullable = false, length = 100)
    private String apellidos;

    @Column(nullable = false, length = 10)
    private String sexo;

    private LocalDate fechaNacimiento;

    @Column(length = 100)
    private String email;

    @Column(length = 150)
    private String direccion;

    @Column(length = 15)
    private String telefono;

    @Column(length = 15)
    private String celular;

    @Column(length = 50)
    private String eps;

    private Boolean estado = true;
}
