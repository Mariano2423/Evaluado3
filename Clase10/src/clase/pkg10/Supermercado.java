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
public class Supermercado {
    public String nombre;
    public int codigo;
    
    public void infoSuper(){
        JOptionPane.showInputDialog(null,"Ingrese el nombre del supermercado: ");
        Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el codigo del supermercado: "));
    }

    public Supermercado(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}
