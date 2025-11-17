/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Gerente extends Empleado implements Reportable{
    private int nEquiposCargo;
    static int nG;

    public Gerente(int nEquiposCargo) {
        this.nEquiposCargo = nEquiposCargo;
    }

    public Gerente(int nEquiposCargo, int idEmpleado, String Nombre, int edad, double salario, int Nhijos) {
        super(idEmpleado, Nombre, edad, salario, Nhijos);
        this.nEquiposCargo = nEquiposCargo;
    }

    @Override
    public double calcularBonificacion() {
        return nEquiposCargo * 10;
    }

    @Override
    public String generarReporte() {
        return "GERENTE: "+ "Nombre: "+ getNombre() +"\n"+
                "edad: " + getEdad()+ "\n"+
                "Bonificacion: "+ calcularBonificacion()+"\n"+
                "Equipos a cargo: " + nEquiposCargo;
        
    }
    

   
    
    
}
