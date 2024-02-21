class Author{
	String authorName;
	int age;
	String place;
	
	Author(String name, int age, String place){
		this.authorName = name;
		this.age = age;
		this.place = place;
	}
}
class Book{
	String name;
	int price;
	Author author; //class(datatype), varible name 
	
	Book(String name, int price, Author author){
		this.name = name;
		this.price = price;
		this.author = author;
	}
	
}
public class Aggregation {
public static void main(String[] args){
	Author obj = new Author("Balaguruswamy", 51, "TN");
	Book B = new Book("Book for Java NewBie", 800, obj);
	
	System.out.println("Book Name: "+B.name);
	System.out.println("Book Price: "+B.price);
	System.out.println("----Auther Details----");
	System.out.println("Author Name: "+B.author.authorName);
	System.out.println("Author Age: "+B.author.age);
	System.out.println("Author Place: "+B.author.place);
	
	}
}
