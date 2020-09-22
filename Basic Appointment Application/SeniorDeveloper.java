/* Made by Sohail Dangol*/
public class SeniorDeveloper extends Developer
{
    private double Salary;
    private String JoiningDate;
    private String StaffRoomnumber;
    private int ContactPeriod;
    private double AdvanceSalary;
    private boolean Appointed;
    private boolean Terminated;
    
    public SeniorDeveloper(String platform, String interviewer, int workhour,double Salary, int ContactPeriod) 
    {
        super(platform,interviewer,workhour);
        this.Salary=Salary;
        this.JoiningDate="";
        this.StaffRoomnumber="";
        this.ContactPeriod=ContactPeriod;
        this.AdvanceSalary=0.0;
        this.Appointed= false;
        this.Terminated=false;
    }
    
    public double getsalary()//access method of salary
    {
        return this.Salary;
    }
    
    public String getjoindate()//access method of JoinDate
    {
        return this.JoiningDate;
    }
    
    public String getstaffroomno()//access method of StaffRoomnumber
    {
        return this.StaffRoomnumber;
    }
    
    public int getcontactperiod()//access method of ContactPeriod
    {
        return this.ContactPeriod;
    }
    
    public double getadvancesalary()//access method of Advance Salary
    {
        return this.AdvanceSalary;
    }
    
    public boolean getappointed()//access method of Appointed
    {
        return this.Appointed;
    }
    
    public boolean getterminated()//access method of Terminated
    {
        return this.Terminated;
    }
    
    public void setsalary(double Salary)//mutor method of Salary
    {
        this.Salary=Salary;
    }
    
    public void setcontactperiod(int ContactPeriod)//mutor method of ContactPeriod
    {
        this.ContactPeriod=ContactPeriod;
    }
    
    public void developerappoint(String developer, String JoiningDate, double AdvanceSalary, String StaffRoomnumber)//hiring Developer
    {
        super.setDeveloper(developer);
        if(developer!="")
        {
            this.JoiningDate=JoiningDate;
            this.AdvanceSalary=AdvanceSalary;
            this.StaffRoomnumber=StaffRoomnumber;
            this.Appointed=true;
            this.Terminated=false;
            System.out.println(developer+" is Hired");   
        }
        
    }
    
    public void terminate()//terminates the hired developer
    {
        if(Terminated==true)
        {
            System.out.println("This Contract is terminated!!");
        }
        else
        {
            super.setDeveloper("");
            this.JoiningDate="";
            this.StaffRoomnumber="";
            this.AdvanceSalary=0.0;
            this.Appointed=false;
            this.Terminated=true;
        }
    }
    
    public void showName()//shows the platform, interview, salary
    {
        System.out.println("Platform: " +getPlatform());
        System.out.println("Interviewer Name: " +getInterview());
        System.out.println("Salary: " +getsalary());
    }
        
    public void showfinal()// show all the value
    {
        if(Appointed==true)
        {
            System.out.println("Platform: " +getPlatform());
            System.out.println("Interviewer Name: " +getInterview());
            System.out.println("Salary: " +getsalary());
            System.out.println("Advance Salary: " +getadvancesalary());
            System.out.println("Developer: " +getDeveloper());
            System.out.println("Terminated Status: " +getterminated());
            System.out.println("Joining Date: " +getjoindate());
        }
        else
        {
            System.out.println("Terminated!!");
        }
    }
                      
}
