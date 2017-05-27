package library;

public class Book
{
    private String title;
    private String author;
    private String code;
    private int yearPrint;
    private String editorial;
    private int copies;
    private int available;
    private int registryNumber;

    public Book(){}

    public Book(String title, String author, String code,
        int yearPrint, String editorial, int copies, int registryNumber)
    {
        this.title = title;
        this.author = author;
        this.code = code;
        this.yearPrint = yearPrint;
        this.editorial = editorial;
        this.copies = copies;
        this.available = copies;
        this.registryNumber = registryNumber;
    }

    public Book(String title, String author, String code,
        int yearPrint, String editorial, int copies, int available, int registryNumber)
    {
        this.title = title;
        this.author = author;
        this.code = code;
        this.yearPrint = yearPrint;
        this.editorial = editorial;
        this.copies = copies;
        this.available = available;
        this.registryNumber = registryNumber;
    }
    
    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getCode()
    {
        return code;
    }

    public int getYearPrint()
    {
        return yearPrint;
    }

    public String getEditorial()
    {
        return editorial;
    }

    public int getCopies()
    {
        return copies;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public void setAvailable(int available)
    {
        this.available = available;
    }
    
    public void setRegistryNumber(int registryNumber)
    {
        this.registryNumber = registryNumber;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public void setYearPrint(int yearPrint)
    {
        this.yearPrint = yearPrint;
    }

    public void setEditorial(String editorial)
    {
        this.editorial = editorial;
    }
    
    public void setCopies(int copies)
    {
        this.copies = copies;
    }
    
    public int getAvailable()
    {
        return available;
    }
    
    public int getRegistryNumber()
    {
        return registryNumber;
    }
}
