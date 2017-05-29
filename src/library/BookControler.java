package library;

public class BookControler
{
    /*Toma la informacion de un libro y lo actualiza con la nueva a traves de los
    datos en sus parametros. el nuevo codigo del libro se genera en un funcion
    dentro de esta clase*/
    public static Book editBook(String title, String author,
            int yearPrint, String editorial, Book book)
    {
        String code = gerateCode(title, author, yearPrint, editorial);
        
        book.setAuthor(author);
        book.setEditorial(editorial);
        book.setYearPrint(yearPrint);
        book.setTitle(title);
        book.setCode(code);

        return book;
    }
    
    /*Crea un libro tomando la informacion que hay en los parametros, utiliza el
    metodo generateCode para crear el codigo del libro*/
    public static Book createBook(String title, String author,
            int yearPrint, String editorial, int copies, int registryNumber)
    {
        String code = gerateCode(title, author, yearPrint, editorial);
        return new Book(title, author, code, yearPrint, editorial, copies, registryNumber);
    }
    
    /*Crea el codigo que servira como identificador del libro*/
    private static String gerateCode(String title, String author, int yearPrint,
        String editorial)
    {
        /*Variable que contendra el codigo del libro*/
        String code = "";

        /*Aisgna carcateres del titulo al codigo*/
        if (title.length() > 2)
        {
            if(title.contains(" "))
            {
                String copy = title;
                code += copy.charAt(0);
                while(copy.contains(" ") && code.length() < 4)
                {
                    code += copy.charAt(copy.indexOf(" ") + 1);
                    copy = copy.substring(copy.indexOf(" ") + 1);
                }
            }
            else
            {
                for(int i = 0; i < 2; i++)
                    code +=title.charAt(i);
            }
        }
        else
            code += title.charAt(0);
        
        /*Asigna caracteres del año al codigo*/
        code += Integer.toString(yearPrint).substring(2);
        
        /*Asigna caracteres del autor al codigo*/
        if (author.length() > 2) {
            if(author.contains(" ") || title.contains("."))
            {
                String copy = author;
                code += copy.charAt(0);
                int charCounter = 1;
                int i = 1;
                while(copy.contains(" ") && charCounter < 4)
                {
                    if(copy.charAt(copy.indexOf(" ") + i) >= 65 &&
                        copy.charAt(copy.indexOf(" ") + i) <= 90 ||
                        copy.charAt(copy.indexOf(" ") + i) >= 97 &&
                        copy.charAt(copy.indexOf(" ") + i) <= 122)
                    {
                        code += copy.charAt(copy.indexOf(" ") + i);
                        copy = copy.substring(copy.indexOf(" ") + i);
                        i = 1;
                        charCounter++;
                    }
                    else
                        i++;
                }
            }
            else
            {
                for(int i = 0; i < 2; i++)
                    code +=author.charAt(i);
            }
        }
        else
            code += author.charAt(0);
        
        /*Asigna caracteres de la editorial al codigo*/
        if (editorial.length() > 2)
        {
            if(editorial.contains(" "))
            {
                String copy = editorial;
                code += copy.charAt(0);
                int charCounter = 1;
                int i = 1;
                while(copy.contains(" ") && charCounter < 2)
                {
                    if(copy.charAt(copy.indexOf(" ") + i) >= 65 &&
                        copy.charAt(copy.indexOf(" ") + i) <= 90 ||
                        copy.charAt(copy.indexOf(" ") + i) >= 97 &&
                        copy.charAt(copy.indexOf(" ") + i) <= 122)
                    {
                        code += copy.charAt(copy.indexOf(" ") + i);
                        copy = copy.substring(copy.indexOf(" ") + i);
                        i = 1;
                        charCounter++;
                    }
                    else
                        i++;
                }
            }
            else
            {
                for(int i = 0; i < 2; i++)
                    code += editorial.charAt(i);
            }
        }
        else
            code += editorial.charAt(0);

        code = code.toUpperCase();
        
        return code;
    }
}
