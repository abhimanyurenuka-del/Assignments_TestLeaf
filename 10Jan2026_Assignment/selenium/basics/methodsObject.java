package selenium.basics;

public class methodsObject {
	
	public String addBook(String BookTitle)
	{
		System.out.println("The book is issue successfully");
		return BookTitle;
		
		
	}
	
	public void issueBook()
	{
		System.out.println("The book is issue successfully");
	}


	public static void main(String[] args) {

		methodsObject opt = new methodsObject();
		
		String returnbook = opt.addBook("Java automation");
		System.out.println(returnbook);
		opt.issueBook();
    
		
	}

}
