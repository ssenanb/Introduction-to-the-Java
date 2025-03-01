public class Book{
String title;
String author;
String isbn;
boolean available = true;

public Book(String title, String author,String isbn){
this.title = title;
this.author = author;
this.isbn = isbn;
}
public void displayInfo(){
	System.out.println("Kütüphanedeki kitaplar:");
	System.out.println("Kitap: " + title + " Yazar: " + author + " ISBN: " + isbn + " Mevcut: " + available);
}
public void borrowBook(){
if(available)
	available = false;
else
	System.out.println("kütüphanede bu kitap var");
}
public void returnBook(){
if(!available)
	available = true;
else
	System.out.println("kütüphanede bu kitap mevcut değil");
}

}
