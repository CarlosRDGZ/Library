package library;

public class BookControler
{

    static public Book editBook(String title, String author,
            int yearPrint, String editorial, Book book)
    {
        String code = "";

        if (title.length() > 2)
        {
            for(int i = 0; i < 2; i++)
                code +=title.charAt(i);
        }
        else
            code += title.charAt(0);

        if (author.length() > 2) {
            for(int i = 0; i < 2; i++)
                code += author.charAt(i);
        }
        else
            code += author.charAt(0);

        if (editorial.length() > 2)
        {
            for(int i = 0; i < 2; i++)
                code += editorial.charAt(i);
        }
        else
            code += editorial.charAt(0);

        code += Integer.toString(yearPrint);
        code = code.toUpperCase();
        
        book.setAuthor(author);
        book.setEditorial(editorial);
        book.setYearPrint(yearPrint);
        book.setTitle(title);
        book.setCode(code);

        return book;
    }
    
     static public Book createBook(String title, String author,
            int yearPrint, String editorial, int copies, int registryNumber)
    {
        String code = "";

        if (title.length() > 2)
        {
            for(int i = 0; i < 2; i++)
                code +=title.charAt(i);
        }
        else
            code += title.charAt(0);
        
        code += Integer.toString(yearPrint);

        if (author.length() > 2) {
            for(int i = 0; i < 2; i++)
                code += author.charAt(i);
        }
        else
            code += author.charAt(0);

        if (editorial.length() > 2)
        {
            for(int i = 0; i < 2; i++)
                code += editorial.charAt(i);
        }
        else
            code += editorial.charAt(0);

        code = code.toUpperCase();

        return new Book(title, author, code, yearPrint, editorial, copies, registryNumber);
    }
}
