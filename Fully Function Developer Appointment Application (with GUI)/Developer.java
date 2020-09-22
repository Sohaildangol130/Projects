/* Made by Sohail Dangol*/
public class Developer
{
    private String platform;
    private String interviewer;
    private String developer;
    private int workhour;
    
    public Developer (String platform, String interviewer, int workhour)
    {
        this.platform=platform;
        this.interviewer=interviewer;
        this.developer="";
        this.workhour=workhour;
    }
    
    public String getPlatform() //access method of platform
    {
        return this. platform;
    }
    
    public String getInterview()//access method of interviewer
    {
        return this.interviewer;
    }
    
    public String getDeveloper()//access method of developer
    {
        return this.developer;
    }
    
    public int getWorkhour()//access method of workhour
    {
        return this.workhour;
    }
    
    public void setDeveloper(String developer)//mutor method of developer
    {
        this.developer=developer;
    }
    
    public void show()//display the result without developer if developer is empty string 
    {
        if(this.developer=="")
        {
            System.out.println("Platform: " +this.platform);
            System.out.println("Interviewer Name: " +this.interviewer);
            System.out.println("Work hour: " +this.workhour);
        }
        else
        {
            System.out.println("Platform: " +this.platform);
            System.out.println("Interviewer Name: " +this.interviewer);
            System.out.println("Work hour: " +this.workhour);
            System.out.println("Developer Name: "+this.developer);
        }
    }
}
