/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.util.Iterator;

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
     public JLabel getLabel(){
        JLabel label = new JLabel("<html><FONT FACE=\"impact\" SIZE=6 COLOR=\"red\">"+servei+"</FONT> <br> "
                + "<FONT FACE=\"courier\" SIZE=4><b>Data:</b> "+dataServei+" "+"<br> "
                        + "<b>Hora Inici:</b> "+horaInici+" <b>Hora Fi:</b> "+horaFi+"<br> "+isAdmin(id_treballador)+"<hr style=\"border:2px;\"></FONT></html>", SwingConstants.LEFT);
        return label;
        //Integer id, Integer idServei, String localitzador, String dataServei, String nomClient, String cognomClient,String cognomClient2,String emailClient, String QRClient, String dniClient, String checkIn) {
       // return nomClient+" "+cognomClient+" "+cognomClient2+" Dni: "+dniClient+" "+emailClient+" "+"QR: "+QRClient+" "+checkIn(checkIn);
    }
    public static ArrayList<Servei> getServeisTreballador (int treballador){
        ArrayList<Servei> serveis = new ArrayList();
        Iterator<Servei> it = llistaServeis.iterator();
        while(it.hasNext()){
            Servei s = it.next();
            if (s.id_treballador==treballador){
                serveis.add(s);
            }
        }
        return serveis;
    }
    public String isAdmin (int treballador){
        ArrayList<Treballador> treballadors = Treballador.getTreballadors();
        Iterator<Treballador> it = treballadors.iterator();
        while(it.hasNext()){
            Treballador t = it.next();
            if (t._id==treballador && t.esAdmin.equalsIgnoreCase("1")){
                return "<b>Administrador:</b> "+t.nom+" "+t.cognom1+" "+t.cognom2;
            } else if(t._id==treballador && t.esAdmin.equalsIgnoreCase("0")){
                return "<b>Treballador:</b> "+t.nom+" "+t.cognom1+" "+t.cognom2;
            }
        }
        return null;
    }
}
