/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Desarrollador extends Empleado implements Reportable{
    private String lenguajeProgramacion;

    

    public Desarrollador(String lenguajeProgramacion, int idEmpleado, String Nombre, int edad, double salario, int Nhijos) {
        super(idEmpleado, Nombre, edad, salario, Nhijos);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    @Override
    public double calcularBonificacion() {
        return Nhijos * 20;
    }

    @Override
    public String generarReporte() {
        return "Desarrollador: " + getNombre()+"\n" +
                "edad: " + getEdad()+"\n" +
                "nhijos: " + getNhijos() + "\n" +
                "lenguaje: " + lenguajeProgramacion;
    }

    
    
   
    
   
    
}
