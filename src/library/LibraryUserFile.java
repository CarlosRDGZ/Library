package library;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LibraryUserFile extends AbstractFile
{
    private final int RECORD_SIZE = 106;
    
    public LibraryUserFile(String fileName) {
        super(fileName);
    }

    @Override
    void delete()
    {
        try {
            file.setLength(file.length() - RECORD_SIZE);
        } catch (IOException ex) {
            Logger.getLogger(LibraryFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    int numberOfRecords()
    {
        try
        {
            return (int)(file.length()/RECORD_SIZE);
        }
        catch (IOException ex)
        {Logger.getLogger(LibraryFile.class.getName()).log(Level.SEVERE, null, ex);}
        return -1;
    }
    
    public void addRecord(LibraryUser user, int recordNum)
    {
        try
        {
            long position = RECORD_SIZE * recordNum;

            file.seek(position);

            file.writeBytes(inputString(user.getUserName(),50));
            
            file.writeBytes(inputString(user.getLibraryID(), 8));
            
            file.writeInt(user.getAge());
            
            file.writeBytes(inputString(user.getSchool(), 40));
            
            file.writeInt(user.getRegistryNumber());
        }
        catch (IOException ex)
        {Logger.getLogger(LibraryFile.class.getName()).log(Level.SEVERE, null, ex);}
    }
    
    public LibraryUser readRecord(int recordNum)
    {
        try
        {
            file.seek(recordNum * RECORD_SIZE);

            byte[] bUser = new byte[50];
            file.read(bUser);
            String user = outputString(bUser);
            
            byte[] bLibraryID = new byte[8];
            file.read(bLibraryID);
            String libaryID = outputString(bLibraryID);
            
            int age = file.readInt();
            
            byte[] bSchool = new byte[40];
            file.read(bSchool);
            String school = outputString(bSchool);
            
            int registryNumber = file.readInt();
            
            return new LibraryUser(user, libaryID, age, school, registryNumber);
        }
        catch (IOException ex)
        {Logger.getLogger(LibraryFile.class.getName()).log(Level.SEVERE, null, ex);}

        return null;
    }
    
    public ArrayList<LibraryUser> readAll()
    {
        ArrayList<LibraryUser> allUsers = new ArrayList();
        for(int i = 0; i < numberOfRecords(); i++)
        {
            LibraryUser user = readRecord(i);
            allUsers.add(user);
        }
        return allUsers;
    }
}
