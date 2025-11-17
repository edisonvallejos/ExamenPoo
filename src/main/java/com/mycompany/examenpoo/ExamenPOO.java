/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examenpoo;


/**
 *
 * @author DELL
 */
public class ExamenPOO {

    public static void main(String[] args) {
        Reportable e1 = new Desarrollador("Java", 0, "Israel", 18, 900, 2);
        Reportable e2 = new Gerente(4, 1, "Maria", 30, 1500, 4);

        System.out.println(e1.generarReporte());
        System.out.println(e2.generarReporte());
    }
    }


