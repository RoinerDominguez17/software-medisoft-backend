package com.medisoftbackend.Paciente;

public class Paciente {

    String nombres;
    String apellidos;
    Integer Documento;
    Integer edad;

    public Paciente() {
    }

    public Paciente(String nombres, String apellidos, Integer documento, Integer edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        Documento = documento;
        this.edad = edad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getDocumento() {
        return Documento;
    }

    public void setDocumento(Integer documento) {
        Documento = documento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
