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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String documento;
    private String nombres;
    private String apellidos;
    private String sexo;
    private LocalDate fechaNacimiento;
    private String email;
    private String direccion;
    private String telefono;
    private String celular;
    private String eps;
    private Boolean estado = true;
}
