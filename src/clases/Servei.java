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
    Treballador treballador;
    String servei;
    Integer idServei;
    static ArrayList<Servei> llistaServeis = new ArrayList();

    public Servei(Treballador treballador, String servei, Integer idServei) {
        this.treballador = treballador;
        this.servei = servei;
        this.idServei = idServei;
    }
    
    public Integer getIdServei(){
        return idServei;
    }
    public void setIdServei(Integer idServei){
        this.idServei = idServei;
    }
    public Treballador getTreballador() {
        return treballador;
    }

    public void setTreballador(Treballador treballador) {
        this.treballador = treballador;
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
