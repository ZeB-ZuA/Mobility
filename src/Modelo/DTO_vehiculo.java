/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ZEB
 */
public class DTO_vehiculo {

    private String placa;
    private String tipo;
    private int modelo;
    private String color;
    private String marca;
    private int cilindraje;
    private double valorComercial;
    private long cc;
    private String combustible;
    private int anioR;

    public int getAnioR() {
        return anioR;
    }

    public void setAnioR(int anioR) {
        this.anioR = anioR;
    }
    

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }


    
    public long getCc() {
        return cc;
    }

    public void setCc(long cc) {
        this.cc = cc;
    }
    

    public DTO_vehiculo() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getClindraje() {
        return cilindraje;
    }

    public void setClindraje(int clindraje) {
        this.cilindraje = clindraje;
    }

    public double getValorComercial() {
        return valorComercial;
    }

    public void setValorComercial(double valorComercial) {
        this.valorComercial = valorComercial;
    }

}
