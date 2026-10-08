package Book;

import java.util.List;
import java.util.ArrayList;

public class Classe_Library {
	public static final Integer MAX_BOOK = 1000;
	private String name;
	private String adress;
	private Integer max;
	private List<Classe_Book> books;
	
	public Classe_Library(String name, String adress, Integer max) {
		this.name = name;
		this.adress = adress;
		this.books = new ArrayList<>();
		this.max = max;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAdress() {
		return adress;
	}
	
	public Integer getMax() {
		return max;
	}
	
	public List<Classe_Book> getBooks() {
		return books;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public void setMax(Integer max) {
		this.max = max;
	}
	
	public void setBooks(List<Classe_Book> books) {
		this.books = books;
		
	}
	
	public void afficherLivre() {
		for (Classe_Book b : books) {
			b.afficher();
		}
	}
	
	public void ajouterLivre(Classe_Book b) {
		if (books.size() > max) {
			books.add(b);
		}
		else {
			System.out.println("Plus de place");
		}
	}
	
	public void retirerLivre(Classe_Book b) {
		books.remove(b);
	}
	
	public void eliminerDoublons() {
		List<Classe_Book> sansDoublons = new ArrayList<> ();
		for (Classe_Book n : books) {
			if (!sansDoublons.contains(n)) {
				sansDoublons.add(n);
			}
		}
		this.books = sansDoublons;
	}

	public void afficherCommuns(Classe_Library autreLibrary) {
		System.out.println("Livres en commun :");
		for (Classe_Book b : this.books) {
			if (autreLibrary.getBooks().contains(b)) {
				b.afficher();
			}
			}
		}
		
	public void trierParAuteur() {
		books.sort((livre1, livre2) -> livre1.getAuthor().compareTo(livre2.getAuthor()));
	}
	
}



