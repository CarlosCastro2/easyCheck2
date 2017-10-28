/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Carlos
 */
public class Reserva {
    Integer id;
    Integer idServei;
    String nomClient;
    String cognomClient;
    String dniClient;
    String dataServei;
    String horaServei;
    String emailClient;
    String QRClient;
    String localitzador;

    public Reserva(Integer id, Integer idServei, String nomClient, String cognomClient, String dniClient, String dataServei, String horaServei, String emailClient, String QRClient, String localitzador) {
        this.id = id;
        this.idServei = idServei;
        this.nomClient = nomClient;
        this.cognomClient = cognomClient;
        this.dniClient = dniClient;
        this.dataServei = dataServei;
        this.horaServei = horaServei;
        this.emailClient = emailClient;
        this.QRClient = QRClient;
        this.localitzador = localitzador;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdServei() {
        return idServei;
    }

    public void setIdServei(Integer idServei) {
        this.idServei = idServei;
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

    public String getHoraServei() {
        return horaServei;
    }

    public void setHoraServei(String horaServei) {
        this.horaServei = horaServei;
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
    
}
