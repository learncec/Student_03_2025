public class Studenr
{
    private String  name;
    private int     alter;
    private boolean matura;
    private String religion;
    
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
}