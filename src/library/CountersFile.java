package library;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CountersFile 
{
    private RandomAccessFile file;
    
    public CountersFile()
    {
        try {
            file = new RandomAccessFile("counters.dat", "rw");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CountersFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    public long readUsers()
    {
        try {
            file.seek(0);
            long users = file.readLong();
            return users;
        } catch (IOException ex) {
            Logger.getLogger(CountersFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
    public void writeUsers(long users)
    {
        try {
            file.seek(0);
            file.writeLong(users);
        } catch (IOException ex) {
            Logger.getLogger(CountersFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
