package BookRecieve;

public class BookDetails {
	public void bookName() {       
		System.out.println("Java");
		
	}
	private void bookAuthor() {
		System.out.println("Techmax");
	}
	 void bookPrize() {                   // default package-access only within package
		System.out.println("899 RS.");
	}
	protected void bookEdition() {         //protected  access modifires access only within a package 
		System.out.println("5th");
	}

}
