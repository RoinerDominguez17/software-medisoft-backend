package com.medisoftbackend.Paciente;

import jakarta.persistence.*;
import lombok.*;

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

    private String nombres;
    private String apellidos;
    private String sexo;
    @Column(unique = true)
    private Integer documento;
    private Integer anioNacimiento;
    private String email;
    private String direccion;
    private String telefono;
}
