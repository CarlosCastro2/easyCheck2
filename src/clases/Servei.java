/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class Servei {
    Trabajador trabajador;
    String servei;
    static ArrayList<Servei> llistaServeis = new ArrayList();

    public Servei(Trabajador trabajador, String servei) {
        this.trabajador = trabajador;
        this.servei = servei;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public String getServei() {
        return servei;
    }

    public void setServei(String servei) {
        this.servei = servei;
    }

    public static ArrayList<Servei> getLlistaServeis() {
        return llistaServeis;
    }

    public static void setLlistaServeis(Servei servei) {
        llistaServeis.add(servei);
    }
    
}
