/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author ZEB
 */
public class DTO_comparendo {
    
     private int radicado;
    private long cc;
    private Date fecha;
    private String descripcion;        
    private double valor;        

    public DTO_comparendo() {
    }

    public int getRadicado() {
        return radicado;
    }

    public void setRadicado(int radicado) {
        this.radicado = radicado;
    }

    public long getCc() {
        return cc;
    }

    public void setCc(long cc) {
        this.cc = cc;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
}
