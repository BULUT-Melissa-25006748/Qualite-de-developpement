package Book;

public class Classe_Book {
	private String title;
	private String author;
	private String editor;
	private Integer pageNb;

public Classe_Book(String title, String author, String editor, Integer pageNb) {
	this.title = title;
	this.author = author;
	this.editor = editor;
	this.pageNb = pageNb;
}

public String getTitle() {
	return title;
}

public String getAuthor() {
	return author;
}
public String getEditor() {
	return editor;
}

public Integer getPageNb() {
	return pageNb;
}

public void setTitle(String Title) {
	this.title = title;
}

public void setAuthor(String Author) {
	this.author = author;
}

public void setEditor(String Editor) {
	this.editor = editor;
}

public void setPageNb(Integer PageNb) {
	this.pageNb = pageNb;
}

public String afficher() {
	return ("Livre : '" + title + "' écrit par " + author + " (Edtion : " + editor + ", " + pageNb + " pages)");
}
public boolean equals (Classe_Book newBook) {
	return (this.title.equals(newBook.title) &&
	this.author.equals(newBook.author) &&
	this.editor.equals(newBook.editor) &&
	this.pageNb.equals(newBook.pageNb));
}
}
