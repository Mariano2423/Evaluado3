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
public class Producto {
    
    public int codigo;
    public String nombreProducto;
    public int cantidadProducto;
    public String tipoProducto;
    public int precioBase;
    public double precioBruto;

    public Producto(int codigo, String nombreProducto, int cantidadProducto, String tipoProducto, int precioBase, double precioBruto) {
        this.codigo = codigo;
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.tipoProducto = tipoProducto;
        this.precioBase = precioBase;
        this.precioBruto = precioBruto;
    }
    
    public void solicitudProducto(){
       codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el codigodel producto"));
       nombreProducto = JOptionPane.showInputDialog(null,"Ingrese el nombre del producto");
       cantidadProducto = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el nombre del producto"));
       tipoProducto = JOptionPane.showInputDialog(null,"Ingrese el tipo del producto");
       precioBase = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el precio del producto"));
    }
    
    public void precio() {
        if (tipoProducto.equals("Alimentos")) {
            precioBruto = precioBase * 0.2 + precioBase;
        }
        if (tipoProducto.equals("Bebidas")) {
            precioBruto = precioBase * 0.3 + precioBase;
        }
        if (tipoProducto.equals("Higiene")) {
            precioBruto = precioBase * 0.25 + precioBase;
        }
        if (tipoProducto.equals("Limpieza")) {
            precioBruto = (precioBase * 0.19) + (precioBase * 0.04) + 1000 + precioBase;
        }
        
        JOptionPane.showMessageDialog(null,"El precio bruto es: " + precioBruto);
    }

    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecioBruto() {
        return precioBruto;
    }

    public void setPrecioBruto(double precioBruto) {
        this.precioBruto = precioBruto;
    }
    
    
}

