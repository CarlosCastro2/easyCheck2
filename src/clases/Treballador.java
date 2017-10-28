/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author Maria
 */
public class Treballador {
    public String nom,cognom1,cognom2,login,password,esAdmin,dni;
int _id;
    public Treballador() {
    }

    public Treballador(int _id,String nom, String cognom1, String cognom2, String login, String password, String esAdmin, String dni) {
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.login = login;
        this.password = password;
        this.esAdmin = esAdmin;
        this.dni = dni;
        this._id=_id;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }
    static ArrayList<Treballador> treballador  = new ArrayList();

    public String getNom() {
        return nom;
    }

    public static ArrayList<Treballador> getTreballador() {
        return treballador;
    }

    public static void setTreballador(ArrayList<Treballador> treballador) {
        Treballador.treballador = treballador;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom1() {
        return cognom1;
    }

    public void setCognom1(String cognom1) {
        this.cognom1 = cognom1;
    }

    public String getCognom2() {
        return cognom2;
    }

    public void setCognom2(String cognom2) {
        this.cognom2 = cognom2;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEsAdmin() {
        return esAdmin;
    }

    public void setEsAdmin(String esAdmin) {
        this.esAdmin = esAdmin;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    @Override
    public String toString(){
return nom+" "+cognom1+" "+cognom2;}

   
}
