/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import static clases.Servei.llistaServeis;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Maria
 */
public class Treballador {

    public String nom, cognom1, cognom2, login, password, esAdmin, dni;
    int _id;
    static ArrayList<Treballador> treballadors = new ArrayList();

    public Treballador() {
    }

    public Treballador(int _id, String nom, String cognom1, String cognom2, String login, String password, String esAdmin, String dni) {
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.login = login;
        this.password = password;
        this.esAdmin = esAdmin;
        this.dni = dni;
        this._id = _id;
    }

    public Treballador(String nom, String cognom1, String cognom2, String login, String password, String esAdmin, String dni) {
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.login = login;
        this.password = password;
        this.esAdmin = esAdmin;
        this.dni = dni;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getNom() {
        return nom;
    }

    public static ArrayList<Treballador> getTreballadors() {
        return treballadors;
    }

    public static void setTreballadors(Treballador treballador) {
        Treballador.treballadors.add(treballador);
    }

    public static int getSize() {
        return treballadors.size();
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
    public String toString() {
        return "Treballador: " + nom + "  " + cognom1 + "  " + cognom2;
    }
    
    public static void exemples() {
       Treballador t1 = new Treballador(1,"Maria", "Puig", "Cadafalch", "login_m", "xxx", "1", "15653131A");
       Treballador  t2 = new Treballador(2,"Pere", "Maria", "Fernan", "login_p", "xxx", "0", "5317731A");
         Treballador t3 = new Treballador(3,"Eric", "Garcia", "Tinent", "login_e", "xxx", "1", "122253131A");
         Treballador t4 = new Treballador(4,"Antonia", "Montseny", "Puig", "login_a", "xxx", "1", "99953131A");
        Treballador.setTreballadors(t1);
        Treballador.setTreballadors(t2);
        Treballador.setTreballadors(t3);
        Treballador.setTreballadors(t4);
        
    }

}
