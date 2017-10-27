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
public class Trabajador {
    Integer id;
    String nom;
    String cognom;
    String dniTreballador;
    static ArrayList<Trabajador> trabajadores  = new ArrayList();

    public Trabajador(Integer id,String nom, String cognom, String dniTreballador) {
        this.id = id;
        this.nom = nom;
        this.cognom = cognom;
        this.dniTreballador = dniTreballador;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getDniTreballador() {
        return dniTreballador;
    }

    public void setDniTreballador(String dniTreballador) {
        this.dniTreballador = dniTreballador;
    }
    public static ArrayList<Trabajador> getTrabajadores(){
        return trabajadores;
    }
    public static void setTrabajadores(Trabajador trabajador){
        trabajadores.add(trabajador);
    }
}
