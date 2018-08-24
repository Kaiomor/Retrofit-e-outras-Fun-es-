package com.example.aula_01.revisaogeral.Model;

public class Livros {

    public String Titulo;
    public String Autor;

    public Livros(String titulo,String autor){
        this.Autor = autor;
        this.Titulo = titulo;

    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }
}
