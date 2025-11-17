/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public abstract class Empleado {
    private int idEmpleado;
    private String Nombre;
    private int edad;
    private double salario;
    private int Nhijos;

    public Empleado() {
    }

    public Empleado(int idEmpleado, String Nombre, int edad, double salario, int Nhijos) {
        this.idEmpleado = idEmpleado;
        this.Nombre = Nombre;
        this.edad = edad;
        this.salario = salario;
        this.Nhijos = Nhijos;
    }
    
    
    public abstract double calcularBonificacion();


    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNhijos() {
        return Nhijos;
    }

    public void setNhijos(int Nhijos) {
        this.Nhijos = Nhijos;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", Nombre=" + Nombre + ", edad=" + edad + ", salario=" + salario + ", Nhijos=" + Nhijos + '}';
    }
    
    
    
}
