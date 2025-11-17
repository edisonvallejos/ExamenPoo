package com.mycompany.examenpoo;

public class Desarrollador extends Empleado implements Reportable {

    private String lenguajeProgramacion;

    public Desarrollador(String lenguajeProgramacion, int idEmpleado, String nombre, int edad, double salario, int Nhijos) {
        super(idEmpleado, nombre, edad, salario, Nhijos);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    @Override
    public double calcularBonificacion() {
        return Nhijos * 20;
    }

    @Override
    public String generarReporte() {
        return "Desarrollador:\n" +
               "Nombre: " + getNombre() + "\n" +
               "Edad: " + getEdad() + "\n" +
               "Bonificación: " + calcularBonificacion() + "\n" +
               "Lenguaje: " + lenguajeProgramacion;
    }
}
