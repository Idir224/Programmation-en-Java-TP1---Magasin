/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gestionMagasin;

/**
 *
 * @author USER
 */

import java.util.ArrayList;

public class Magasin {
    private ArrayList<Produit> produits;

    public Magasin() {
        produits = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    public void afficherProduitsDisponibles() {
        for (Produit produit : produits) {
            System.out.println(produit.getNom());
        }
    }

    public Produit trouverProduitParNom(String nom) {
        for (Produit produit : produits) {
            if (produit.getNom().equals(nom)) {
                return produit;
            }
        }

        return null;
    }
}
