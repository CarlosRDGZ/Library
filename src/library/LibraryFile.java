package library;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LibraryFile
{
    private RandomAccessFile file;
    private final int RECORD_SIZE = 122;

    public LibraryFile(String fileName)
    {
        try
        {
            file = new RandomAccessFile(fileName + ".dat", "rw");
        }
        catch (FileNotFoundException ex)
        {Logger.getLogger(LibraryFile.class.getName()).log(Level.SEVERE, null, ex);}
    }
    
    public void delete()
    {
        try {
            file.setLength(file.length() - RECORD_SIZE);
        } catch (IOException ex) {
            Logger.getLogger(LibraryFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addRecord(Book book, int recordNum)
    {
        try
        {
            long position = RECORD_SIZE * recordNum;

            file.seek(position);

            file.writeBytes(inputString(book.getTitle(),30));

            file.writeBytes(inputString(book.getAuthor(),50));

            file.writeBytes(inputString(book.getCode(),13));

            file.writeInt(book.getYearPrint());

            file.writeBytes(inputString(book.getEditorial(),13));

            file.writeInt(book.getCopies());
            
            file.writeInt(book.getAvailable());
            
            file.writeInt(book.getRegistryNumber());

        }
        catch (IOException ex)
        {Logger.getLogger(LibraryFile.class.getName()).log(Level.SEVERE, null, ex);}
    }

    public Book readRecord(int recordNum)
    {
        try
        {
            file.seek(recordNum * RECORD_SIZE);

            byte[] bTitle = new byte[30];
            file.read(bTitle);
            String title = outputString(bTitle);

            byte[] bAuthor = new byte[50];
            file.read(bAuthor);
            String author = outputString(bAuthor);

            byte[] bCode = new byte[13];
            file.read(bCode);
            String code = outputString(bCode);

            int year = file.readInt();

            byte[] bEditorial = new byte[13];
            file.read(bEditorial);
            String editorial = outputString(bEditorial);

            int copies = file.readInt();
            
            int available = file.readInt();
            
            int registryNumber = file.readInt();

            return new Book(title, author, code, year, editorial,
                    copies, available, registryNumber);
        }
        catch (IOException ex)
        {Logger.getLogger(LibraryFile.class.getName()).log(Level.SEVERE, null, ex);}

        return null;
    }

    public ArrayList<Book> readAll()
    {
        ArrayList<Book> allRecords = new ArrayList();
        for(int i = 0; i < numberOfRecords(); i++)
        {
            Book book = readRecord(i);
            allRecords.add(book);
        }
        return allRecords;
    }

    public int numberOfRecords()
    {
        try
        {
            return (int)(file.length()/RECORD_SIZE);
        }
        catch (IOException ex)
        {Logger.getLogger(LibraryFile.class.getName()).log(Level.SEVERE, null, ex);}
        return -1;
    }

    private String inputString(String str, int length)
    {
        StringBuilder sb = new StringBuilder(str);
        sb.setLength(length);
        return sb.toString();
    }

    private String outputString(byte b[])
    {
        String str = new String(b);
        if(str.indexOf('\0') != -1)
            return str.substring(0, str.indexOf('\0'));
        else
            return str;
    }
}
