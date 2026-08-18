/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1.biblioteca;

/**
 *
 * @author PC USER
 */

public class Libro extends Material {
    private String autor;
    private boolean disponible;

    public Libro(String codigo, String titulo, String anioPublic, String autor) {
        super(codigo, titulo, anioPublic);
        this.autor = autor;
        this.disponible = true; // por defecto, al crearse un libro está disponible
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return super.toString() + ", Autor: " + autor + ", Disponible: " + (disponible ? "Si" : "No");
    }
}
