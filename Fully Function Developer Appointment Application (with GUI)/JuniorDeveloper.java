/* Made by Sohail Dangol*/
public class JuniorDeveloper extends Developer
{
   private double Salary;
   private String AppointedDate;
   private String TerminationDate;
   private String Specialization;
   private String AppointedBy;
   private boolean Join;
   
   public JuniorDeveloper(String platform, String interviewer, int workhour, double salary, String Appointedby, String TerminationDate )
   {
       super(platform, interviewer, workhour);
       this.Salary=Salary;
       this.AppointedDate="";
       this.TerminationDate=TerminationDate;
       this.Specialization="";
       this.AppointedBy=AppointedBy;     
       this.Join=false;
    }
    
   public double getsalary()//access method of salary
   {
       return this.Salary;
    }
    
    public String getappointdate()//access method of AppointedDate
    {
        return this.AppointedDate;
    }
    
    public String getterminatedate()//access method of TerminarionDate
    {
        return this.TerminationDate;
    }
    
    public String getspecility()//access method of Specialization
    {
        return this.Specialization=Specialization;
    }
    
    public String getappointedby()//access method of AppointedBy
    {
        return this.AppointedBy;
    }
    
    public boolean getjoined()//access method of Join
    {
        return this.Join;
    }
    
    public void setsalary(double Salary)//mutor of salary
    {
        if(this.Join==true)
        {
            System.out.println("Sorry, The salary is fixed.");
        }
        else
        {
            this.Salary=Salary;
        }
    }
    public void Developerappoint(String developer, String AppointedDate, String TerminationDate, String Specialization)
    //appointing a new developer
    {
        if (this.Join==false)
        {
            super.setDeveloper(developer);
            this.Join=true;
            this.AppointedDate=AppointedDate;
            this.TerminationDate=TerminationDate;
            this.Specialization=Specialization;
        }
        else
        {
            System.out.println("Developer appointed by: "+this.AppointedDate);
        }
    }
    
    public void Show()//showing the results
    {
        super.show();
        if(this.Join==true)
        {
            System.out.println("Developer appointed at: " +getappointdate());
            System.out.println("Termination Date: " +getterminatedate());
            System.out.println("Developer Salary: " +getsalary());
            System.out.println("Developer Specialization: " +getspecility());
            System.out.println("Developer appointed by: " +getappointedby());
        }
    }
}
