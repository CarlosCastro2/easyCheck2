/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.SwingConstants; 
/**
 *
 * @author Carlos
 */
public class Reserva {
    Integer _id;
    Integer id_servei;
    String localitzador;
    String nomClient;
    String cognomClient;
    String cognomClient2;
    String dniClient;
    String dataServei;
    String emailClient;
    String QRClient;
    
    String checkIn;
    static ArrayList<Reserva> reservas  = new ArrayList();
    
    public Reserva (){}
    public Reserva(Integer id, Integer idServei, String localitzador, String dataServei, String nomClient, String cognomClient,String cognomClient2,String emailClient, String QRClient, String dniClient, String checkIn) {
        this._id = id;
        this.id_servei = idServei;
        this.localitzador = localitzador;
        this.dataServei = dataServei;
        this.nomClient = nomClient;
        this.cognomClient = cognomClient;
        this.cognomClient2 = cognomClient2;
        this.emailClient = emailClient;
        this.QRClient = QRClient;
        this.dniClient = dniClient;
        this.checkIn = checkIn;
    }
    
    public void setCheckIn(String checkIn){
        this.checkIn = checkIn;
    }
    
    public String getCheckIn(){
        return checkIn;
    }
    public Integer getId() {
        return _id;
    }

    public void setId(Integer id) {
        this._id = id;
    }

    public Integer getIdServei() {
        return id_servei;
    }

    public void setIdServei(Integer idServei) {
        this.id_servei = idServei;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getCognomClient() {
        return cognomClient;
    }

    public void setCognomClient(String cognomClient) {
        this.cognomClient = cognomClient;
    }
    
    public String getCognomClient2() {
        return cognomClient2;
    }

    public void setCognomClient2(String cognomClient2) {
        this.cognomClient2 = cognomClient2;
    }
    public String getDniClient() {
        return dniClient;
    }

    public void setDniClient(String dniClient) {
        this.dniClient = dniClient;
    }

    public String getDataServei() {
        return dataServei;
    }

    public void setDataServei(String dataServei) {
        this.dataServei = dataServei;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    public String getQRClient() {
        return QRClient;
    }

    public void setQRClient(String QRClient) {
        this.QRClient = QRClient;
    }

    public String getLocalitzador() {
        return localitzador;
    }

    public void setLocalitzador(String localitzador) {
        this.localitzador = localitzador;
    }
    
    public static ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public static void setReservas(Reserva reserva) {
        Reserva.reservas.add(reserva);
    }
    public JLabel getLabel(){
        JLabel label = new JLabel("<html><FONT FACE=\"impact\" SIZE=6 COLOR=\"red\">"+nomClient+" "+cognomClient+" "+cognomClient2+"</FONT> <br> "
                + "<FONT FACE=\"courier\" SIZE=4><b>Dni:</b> "+dniClient+" <b>Email:</b> "+emailClient+" "+"<br> "
                        + "<b>QR:</b> "+QRClient+" <b>Check-In:</b> "+checkIn(checkIn)+"<hr style=\"border:2px;\"></FONT></html>", SwingConstants.LEFT);
        return label;
        //Integer id, Integer idServei, String localitzador, String dataServei, String nomClient, String cognomClient,String cognomClient2,String emailClient, String QRClient, String dniClient, String checkIn) {
       // return nomClient+" "+cognomClient+" "+cognomClient2+" Dni: "+dniClient+" "+emailClient+" "+"QR: "+QRClient+" "+checkIn(checkIn);
    }
    public String checkIn(String checkIn){
        if (checkIn.equalsIgnoreCase("0")) return "No Realitzat";
        else return "Realitzat";
    }
    
}
