public class Studenr
{
    private String  name;
    private int     alter;
    private boolean matura;
    private String religion;
    
    public Studenr(String newName, int newAlter, boolean newMatura, String newReligion)
    {
     setName(newName);
     setAlter(newAlter);
     setMatura(newMatura);
     setReligion(newReligion);     
    }
   
    public void setName(String newName)
    {
        name = newName;
    }
    
    public void setAlter(int newAlter)
    {
        alter = newAlter;
    }
    
    public void setMatura(boolean newMatura)
    {
        matura = newMatura;
    }
    
    public void setReligion(String newReligion)
    {
        religion = newReligion;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getAlter()
    {
        return alter;
    }
    
    public boolean getMatura()
    {
        return matura;
    }
    
    public String getReligion()
    {
        return religion;
    }
    
    public void printStundr()
    {
        System.out.println("Name: " + name + ", Alter: " + alter + ", Matura: " + matura + ", ja, sie hat, Religion: " + religion);
    }
}