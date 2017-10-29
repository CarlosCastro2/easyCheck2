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
    Integer id_treballador;
    String servei;
    Integer idServei;
    String dataServei,horaInici,horaFi;
    static ArrayList<Servei> llistaServeis = new ArrayList();

    public Servei(Integer idServei,String servei, Integer id_treballador, String dataServei, String horaInici, String horaFi) {
        this.id_treballador = id_treballador;
        this.servei = servei;
        this.idServei = idServei;
        this.horaInici = horaInici;
        this.horaFi = horaFi;
        this.dataServei = dataServei;
    }
    
    public Integer getIdServei(){
        return idServei;
    }
    public void setIdServei(Integer idServei){
        this.idServei = idServei;
    }
    public Integer getId_Treballador() {
        return id_treballador;
    }

    public void setId_Treballador(Integer id_treballador) {
        this.id_treballador = id_treballador;
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
    
    public String getDataServei() {
        return dataServei;
    }

    public void setDataServei(String dataServei) {
        this.dataServei = dataServei;
    }
    public String getHoraInici() {
        return horaInici;
    }

    public void setHoraInici(String horaInici) {
        this.horaInici = horaInici;
    }
    public String getHoraFi() {
        return horaFi;
    }

    public void setHoraFi(String horaFi) {
        this.horaFi = horaFi;
    }
    public String toString(){
        return idServei+" "+servei+" "+dataServei+" "+horaInici+" "+horaFi+" "+id_treballador;
    }

}
