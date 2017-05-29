package library;

public class LibraryUser
{
    private String userName;
    private String libraryID;
    private int age;
    private String school;
    private int registryNumber;
    
    public LibraryUser(String userName, String libraryID, int age,
        String school, int registryNumber)
    {
        this.userName = userName;
        this.libraryID = libraryID;
        this.age = age;
        this.school = school;
        this.registryNumber = registryNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLibraryID() {
        return libraryID;
    }

    public void setLibraryID(String libraryID) {
        this.libraryID = libraryID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getRegistryNumber() {
        return registryNumber;
    }

    public void setRegistryNumber(int registryNumber) {
        this.registryNumber = registryNumber;
    }
    
    @Override
    public String toString()
    {
        return libraryID + " - " + userName;
    }
}
