/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionMagasin;

/**
 *
 * @author USER
 */

public class Client {
    private int id;
    private String nom;
    private String email;

    // Constructeur
    public Client(int parId, String parNom, String parEmail) {
        this.id = parId;
        this.nom = parNom;
        this.email = parEmail;
    }

    // Getter et setter id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter et setter nom
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getter et setter email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void afficherDetails() {
        System.out.println("Client : " + nom);
        System.out.println("ID : " + id);
        System.out.println("Email : " + email);
    }
}


