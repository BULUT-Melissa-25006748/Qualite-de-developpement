package Book;

import java.util.Scanner;

public class LibraryUI {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        Classe_Library maBibliotheque = new Classe_Library("IUT Aix", "Aix-en-Provence", 100);
        boolean continuer = true;
        
        while (continuer) {
            System.out.println("\n--- MENU BIBLIOTHÈQUE ---");
            System.out.println("1. Afficher les livres");
            System.out.println("2. Ajouter un livre");
            System.out.println("3. Éliminer les doublons");
            System.out.println("4. Trier par auteur");
            System.out.println("0. Quitter");
            System.out.print("Ton choix : ");

            int choix = clavier.nextInt();
            clavier.nextLine();
            
            switch (choix) {
                case 1:
                    maBibliotheque.afficherLivre();
                    break;
                    
                case 2:
                    System.out.print("Titre du livre : ");
                    String titre = clavier.nextLine();
                    
                    System.out.print("Auteur : ");
                    String auteur = clavier.nextLine();
                    
                    System.out.print("Éditeur : ");
                    String editeur = clavier.nextLine();
                    
                    System.out.print("Nombre de pages : ");
                    int pages = clavier.nextInt();
                    clavier.nextLine();
                    
                    Classe_Book nouveauLivre = new Classe_Book(titre, auteur, editeur, pages);
                    maBibliotheque.ajouterLivre(nouveauLivre);
                    System.out.println("-> Livre ajouté avec succès !");
                    break;
                    
                case 3:
                    maBibliotheque.eliminerDoublons();
                    System.out.println("-> Doublons éliminés.");
                    break;
                    
                case 4:
                    maBibliotheque.trierParAuteur();
                    System.out.println("-> Livres triés par auteur.");
                    break;
                    
                case 0:
                    continuer = false;
                    System.out.println("Fermeture du programme. À plus !");
                    break;
                    
                default:
                    System.out.println("Choix invalide, réessaie.");
            }
        }
        clavier.close();
    }
}