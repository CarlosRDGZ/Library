package library;

public class UserControler
{
    public static LibraryUser createUser(String name, int age, String school,
        int registryNumber, long counter)
    {
        String libraryID = generateID(counter);
        
        return new LibraryUser(name, libraryID, age, school, registryNumber);
    }
    
    private static String generateID(long counter)
    {
        String userID = Long.toString(counter);
        
        while(userID.length() < 8)
        {
            userID = "0" + userID;
        }
        
        return userID;
    }
}
