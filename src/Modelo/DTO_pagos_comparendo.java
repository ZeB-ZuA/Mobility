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
public class DTO_pagos_comparendo {
  
    private int cod_trans;
    private long cc;
    private int radicado;
    private String estado;

    public DTO_pagos_comparendo() {
    }

    public int getCod_trans() {
        return cod_trans;
    }

    public void setCod_trans(int cod_trans) {
        this.cod_trans = cod_trans;
    }

    public long getCc() {
        return cc;
    }

    public void setCc(long cc) {
        this.cc = cc;
    }

    public int getRadicado() {
        return radicado;
    }

    public void setRadicado(int radicado) {
        this.radicado = radicado;
    }


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
    
    
    
    
    
    
}
