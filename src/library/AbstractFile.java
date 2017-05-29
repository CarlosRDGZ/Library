package library;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AbstractFile
{
    protected RandomAccessFile file;
    
    public AbstractFile(String fileName)
    {
        try
        {
            file = new RandomAccessFile(fileName + ".dat", "rw");
        }
        catch (FileNotFoundException ex)
        {Logger.getLogger(LibraryFile.class.getName()).log(Level.SEVERE, null, ex);}
    }
    
    abstract void delete();
    
    abstract int numberOfRecords();
    
    protected String inputString(String str, int length)
    {
        StringBuilder sb = new StringBuilder(str);
        sb.setLength(length);
        return sb.toString();
    }

    protected String outputString(byte b[])
    {
        String str = new String(b);
        if(str.indexOf('\0') != -1)
            return str.substring(0, str.indexOf('\0'));
        else
            return str;
    }
}