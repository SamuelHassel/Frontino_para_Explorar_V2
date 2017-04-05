package com.ruizvilla.frontino_para_explorar;

/**
 * Created by Usuario on 05/04/2017.
 */

public class Lista_Entrada {
    private  int idImagen; // Porque los ID son enteros
    private  String nombre, descrip, direct;

    // Contrustucores que asignen valores

    public Lista_Entrada(int idImagen, String nombre, String descrip, String direct) {
        this.idImagen = idImagen;
        this.nombre = nombre;
        this.descrip = descrip;
        this.direct = direct;
    }

    // Por ser una clase, entonces al estar privados necesitamos unsar gettres y setter
    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getDirect() {
        return direct;
    }

    public void setDirect(String direct) {
        this.direct = direct;
    }
}
