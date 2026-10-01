/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
package gestionMagasin;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Création des produits
        Produit produit1 = new Produit(1, "Ordinateur", 800, 1);
        Produit produit2 = new Produit(2, "Casque", 20, 2);
        Produit produit3 = new Produit(3, "Clavier", 50, 4);

        // Création du magasin
        Magasin magasin = new Magasin();
        magasin.ajouterProduit(produit1);
        magasin.ajouterProduit(produit2);
        magasin.ajouterProduit(produit3);

        // Création du client
        Client client = new Client(1, "Idir", "idir@email.com");

        // Création du panier
        Panier panier = new Panier();

        int choix;

        do {
            System.out.println("\n--- Menu Magasin ---");
            System.out.println("1. Afficher les produits disponibles");
            System.out.println("2. Ajouter un produit au panier");
            System.out.println("3. Afficher le panier");
            System.out.println("4. Passer la commande");
            System.out.println("5. Quitter");
            System.out.print("Votre choix : ");

            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {

                case 1:
                    magasin.afficherProduitsDisponibles();
                    break;

                case 2:
                    System.out.print("Nom du produit à ajouter : ");
                    String nomProduit = scanner.nextLine();
                    

                    Produit produit = magasin.trouverProduitParNom(nomProduit);

                    if (produit != null) {
                        panier.ajouterProduit(produit);
                        System.out.println("Produit dans le panier.");
                    } else {
                        System.out.println("Produit non trouvé.");
                    }
                    break;

                case 3:
                    panier.afficherPanier();
                    System.out.println("Total : " + panier.calculerTotal() + " €");
                    break;

                case 4:
                    Commande commande = new Commande(1, client, panier.getProduits());
                    commande.afficherDetailsCommande();
                    break;

                case 5:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide.");
            }

        } while (choix != 5);

        scanner.close();
    }
}