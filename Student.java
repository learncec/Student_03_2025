public class Student
{
    private String  name;
    private int     alter;
    private boolean matura;
    private String religion;
    
    //Constructoren
    //Vier Varianten um ein Objekt anzulegen.
    //Die Konstruktoren müssen sich im Methodenkopf durch die Signatur unterscheiden.
    public Student(String name, int alter, boolean matura, String religion)
    {
     setName(name);
     setAlter(alter);
     setMatura(matura);
     setReligion(religion);     
    }
       public Student(String name, int alter, String religion)
    {
        setName(name);
        setAlter(alter);
        setReligion(religion);
        setMatura(false); //Wurde nicht als Paramter übergeben, also muss man hier den Default Wert für matura annehmen.
    }
    public Student(String name)
    {
        setName(name);
        setAlter(14);//Default Werte:
        setMatura(false);
        setReligion("ob");
    }
    public Student()
    {
        setName("UNKN");
        setAlter(14);//Default Werte:
        setMatura(false);
        setReligion("ob");
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
        public void setAlter(int alter)
    {
        this.alter = alter;
    }
        public void setMatura(boolean matura)
    {
        this.matura = matura;
    }
        public void setReligion(String religion)
    {
        this.religion = religion;
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
    
    //ifAbfrage: Abhängig von der Eigenschaft matura(true/false): zwei Texte -->Entweder Matura oder keine Matura
    public void printStudent()
    {
        if(matura == true)
        {
        System.out.println("Name: " + name + ", Alter: " + alter + ", ja, hat Matura, Religion: " + religion + ".");
        }
        else{
        System.out.println("Name: " + name + ", Alter: " + alter + ", nein hat keine Matura, Religion: " + religion + ".");
        }
    }
}