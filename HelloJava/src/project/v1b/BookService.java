package project.v1b;

public interface BookService  
{
		void addBook(BookV0 bs);	
		String getBook();
		String getBook(String name);
		void modifyBook(BookV0 bs);
		void removeBook(String name);

}
