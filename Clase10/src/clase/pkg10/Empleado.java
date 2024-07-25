/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg10;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Empleado {
    
    public String nombre;
    public int cedula;

    Empleado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void infoEmpleado(){
        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del empleado");
        cedula= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de cedula"));
    }
    public Empleado(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    
    
}
