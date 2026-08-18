/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1.biblioteca;

/**
 *
 * @author PC USER
 */

public class Material {
    private String codigo;
    private String titulo;
    private String anioPublic;

    public Material(String codigo, String titulo, String anioPublic) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anioPublic = anioPublic;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnioPublic() {
        return anioPublic;
    }

    public void setAnioPublic(String anioPublic) {
        this.anioPublic = anioPublic;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + ", Titulo: " + titulo + ", Anio: " + anioPublic;
    }
}
