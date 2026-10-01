/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionMagasin;

/**
 *
 * @author USER
 */
public class Produit {
    private int id;
    private String nom;
    private double prix;
    private int quantite;

    public Produit(int parId, String parNom, double parPrix, int parQuantite) {
        this.id = parId;
        this.nom = parNom;
        this.prix = parPrix;
        this.quantite = parQuantite;
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
    // Getter et setter prix
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    // Getter et setter quantité
    public int getQuantite() {
        return quantite;
    }
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    
    public void afficherDetails(){
        System.out.println("ID : " + this.id + "\nNom : " + this.nom + "\nPrix : " + this.prix + "\nQuantité : " + this.quantite);
    }
}
