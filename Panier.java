/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionMagasin;

/**
 *
 * @author USER
 */
import java.util.ArrayList;

public class Panier {
    private ArrayList<Produit> produits;

    public Panier() {
        produits = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    public void supprimerProduit(Produit produit) {
        produits.remove(produit);
    }

    public void afficherPanier() {
        for (Produit produit : produits) {
            System.out.println(produit.getNom());
        }
    }

    public double calculerTotal() {
        double total = 0;

        for (Produit produit : produits) {
            total += produit.getPrix();
        }

        return total;
    }
    
    public ArrayList<Produit> getProduits() {
    return produits;
    }
}