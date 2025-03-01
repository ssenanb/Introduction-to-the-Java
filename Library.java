import java.util.*;
public class Library{

private ArrayList<Book> books;//mainde tanımlamayıp globalde array list oluşturdum

public Library(){
books = new ArrayList<>();
}


public void addBook(Book book){
	books.add(book);
}
public void removeBook(String isbn){
	for(Book book : books){
	   if(book.isbn.equals(isbn)){
		books.remove(book);
		return;
	}
}
	System.out.println("kitap yok");
}
public void displayAllBooks(){
	for(Book book: books){
		book.displayInfo();
	}
}
public Book findBookByTitle(String title){
	for(Book book : books){
	   if(book.title.equalsIgnoreCase(title))
		return book;
	}
	return null;
}

public static void main(String args[]){

Scanner scan = new Scanner(System.in);
Library library = new Library();

library.addBook(new Book("Kırmızı Saçlı Kadın", "Orhan Pamuk", "1234"));
library.addBook(new Book("Suç ve Ceza", "Dostoyevski", "1357"));
library.addBook(new Book("İçimizdeki Şeytan", "Sabahattin Ali", "2468"));

while(true){

System.out.println("Kütüphane yönetim sistemi");
System.out.println("1- Tüm kitapları görüntüle");
System.out.println("2- Kitap ödünç al");
System.out.println("3- Kitap iade et");
System.out.println("4- Kitap ekle");
System.out.println("5- Kitap kaldır");
System.out.println("6- Çıkış");
System.out.println("İşleminizi seçiniz");

int select = scan.nextInt();
scan.nextLine(); //bu son satırı silme işlemidir  ***ÖNEMLİ***

switch(select){

case 1 : library.displayAllBooks();
	 break;
case 2 :
	System.out.println("Ödünç alınacak kitabın adını giriniz");
	String b_book = scan.nextLine();
        Book borrow_book =  library.findBookByTitle(b_book);
	if (borrow_book != null){
           borrow_book.borrowBook();
         }
              break;
case 3 :
	System.out.println("İade edilecek kitabın adını giriniz");
	String r_book = scan.nextLine();
	Book bookToReturn = library.findBookByTitle(r_book);
        if (bookToReturn != null) {
            bookToReturn.returnBook();
        }
        break;
case 4 :
	 System.out.println("Kitabın adı:");
	 String title = scan.nextLine();
         System.out.print("Yazar adı: ");
         String author = scan.nextLine();
         System.out.print("ISBN: ");
         String isbn = scan.nextLine();

       	 library.addBook(new Book(title, author, isbn));
         break;
 case 5 :
         System.out.print("Silinecek kitabın ISBN numarasını giriniz: ");
         String removeIsbn = scan.nextLine();
         library.removeBook(removeIsbn);
         break;
case 6:
         System.out.println("Çıkış yapılıyor...");
         scan.close();
	 return;
 default :
         System.out.println("Geçersiz seçim! Tekrar deneyin.");

	}
}}}




