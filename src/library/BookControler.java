package library;

public class BookControler
{

    static public Book createBook(String title, String author,
            int yearPrint, String editorial)
    {

        char title_num[] = new char[3];
        char author_num[] = new char[3];
        char editorial_num[] = new char[3];

        if (title.length() > 2)
        {
            for(int i = 0; i < 3; i++)
            {title_num[i] = title.charAt(i);}
        }
        else
        {
            for(int i = 0; i < title.length(); i++)
            {title_num[i] = title.charAt(i);}
        }

        if (author.length() >= 3) {
            for(int i = 0; i < 3; i++)
            {author_num[i] = author.charAt(i);}
        }
        else{
            for(int i = 0; i < title.length(); i++)
            {author_num[i] = title.charAt(i);}
        }

        if (editorial.length() > 2)
        {
            for(int i = 0; i < 3; i++)
            {editorial_num[i] = editorial.charAt(i);}
        }
        else{
            for(int i = 0; i < editorial.length(); i++)
            {editorial_num[i] = editorial.charAt(i);}
        }
        String code = "";

        for(int i = 0; i < 3; i++)
            code += title_num[i];

        for(int i = 0; i < 3; i++)
            code += author_num[i];

        for(int i = 0; i < 3; i++)
            code += editorial_num[i];

        code += Integer.toString(yearPrint);

        return new Book(title, author, code, yearPrint, editorial);
    }
}
