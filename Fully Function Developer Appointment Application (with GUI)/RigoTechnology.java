import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
        
public class RigoTechnology implements ActionListener
{    
    JTextField Textfield_Interviewer, Textfield_Platform, Textfield_Working_hour, Textfield_Termination_date, Textfield_appointed_by, Textfield_Salary,Textfield_Platform2 ,Textfield_Working_hour2 ,Textfield_Salary2 ,Textfield_Interviewer2 ,Textfield_contract_Period , Textfield_Name, Textfield_joining_Date, Textfield_dev_No, Textfield_room_No, Textfield_advance_Salary, Textfield_Name2, Textfield_Specialization, Textfield_dev_No2, Textfield_appoint_Date, Textfield_termination;
    JButton Button_junior, Button_senior, Button_appoint, Button_terminate, Button_appoint_Junior, Button_display_All, Button_clear;
    JLabel Label_label1, Label_label2, Label_label3, Label_label4, Platform, Salary, Working_hour, Interviewer, Appointed_by, Termination_date, Platform1, Salary1, Working_hour1, Interviewer1, Contract_period, Name1, Joining_date, Dev_no1, Room_no, Adv_Salary, Name2, Specialization, Dev_no2, Appoint_date, Termination;
    ArrayList<Developer> developerList= new ArrayList<>();
   
    //Main method
    public static void main(String arg[])
    {
    RigoTechnology obj= new RigoTechnology();
    obj.Rigo_technology();
    }
    //Sub method
    public void Rigo_technology()
    {
                      
        //frame
        JFrame frameObj = new JFrame();
        frameObj.setVisible(true);
        frameObj.setSize(700,800);// Width and Height
        frameObj.setLocationRelativeTo(null);
        
        frameObj.setTitle("Appointment System");
        frameObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container container = frameObj.getContentPane();
        
        Label_label1 = new JLabel("Add platform for Junior Developer", JLabel.CENTER);
        Label_label1.setBounds(-70, 10, 450, 50);
        Font font1 = new Font("Arial", Font.BOLD,16);
        Label_label1.setFont(font1);
        
        Label_label2 = new JLabel("Add platform for Senior Developer", JLabel.CENTER);
        Label_label2.setBounds(-70, 155, 450, 50);
        Font font2 = new Font("Arial", Font.BOLD,16);
        Label_label2.setFont(font2);
        
        Label_label3 = new JLabel("Appoint/Terminate Senior Developer", JLabel.CENTER);
        Label_label3.setBounds(-60, 345, 450, 50);
        Font font3 = new Font("Arial", Font.BOLD,16);
        Label_label3.setFont(font3);
        
        Label_label4 = new JLabel("Appoint Junior Developer", JLabel.CENTER);
        Label_label4.setBounds(-100, 490, 450, 50);
        Font font4 = new Font("Arial", Font.BOLD,16);
        Label_label4.setFont(font4);
        
        //Texts
        //Add platform for Junior
        Platform = new JLabel("Platform:");
        Platform.setBounds(30, 60, 120, 30);
        
        Working_hour = new JLabel("Working hour:");
        Working_hour.setBounds(450, 60, 120, 30);
        
        Interviewer = new JLabel("Interviewer:");
        Interviewer.setBounds(30, 95, 120, 30);
        
        Appointed_by = new JLabel("Appointed by:");
        Appointed_by.setBounds(260, 95, 120, 30);
        
        Salary = new JLabel("Salary:");
        Salary.setBounds(260, 60, 120, 30);
        
        Termination_date = new JLabel("Termi. date:");
        Termination_date.setBounds(450, 95, 120, 30);        
        
        //Add platform for Senior
        Platform1 = new JLabel("Platform:");
        Platform1.setBounds(30, 205, 120, 30);
        
        Working_hour1 = new JLabel("Working hour:");
        Working_hour1.setBounds(450, 205, 120, 30);
        
        Salary1 = new JLabel("Salary:");
        Salary1.setBounds(260, 205, 120, 30);
        
        Interviewer1 = new JLabel("Interviewer:");
        Interviewer1.setBounds(30, 240, 120, 30);
        
        Contract_period = new JLabel("Contract Period:");
        Contract_period.setBounds(435, 240, 120, 30);
        
        //Appoint/Terminate Senior Developer
        Name1 = new JLabel("Name:");
        Name1.setBounds(30, 395, 120, 30);
        
        Joining_date = new JLabel("Joining date:");
        Joining_date.setBounds(450, 395, 120, 30);
        
        Dev_no1 = new JLabel("Dev no:");
        Dev_no1.setBounds(30, 430, 120, 30);
       
        Room_no = new JLabel("Room no:");
        Room_no.setBounds(220, 430, 120, 30);
        
        Adv_Salary = new JLabel("Adv Salary:");
        Adv_Salary.setBounds(450, 430, 120, 30);
        
        //Appoint Junior Developer        
        Name2 = new JLabel("Name:");
        Name2.setBounds(30, 535, 120, 30);
        
        Specialization = new JLabel("Specialization:");
        Specialization.setBounds(450, 535, 120, 30);
        
        Dev_no2 = new JLabel("Dev no:");
        Dev_no2.setBounds(30, 570, 120, 30);
        
        Appoint_date = new JLabel("Appoint date:");
        Appoint_date.setBounds(220, 570, 120, 30);
                
        Termination = new JLabel("Termination:");
        Termination.setBounds(450, 570, 120, 30);
        
        //Text fields
        
        //Add platform for Junior Developer
        Textfield_Platform = new JTextField();
        Textfield_Platform.setBounds(100, 60 , 150, 30);
        
        Textfield_Working_hour = new JTextField();
        Textfield_Working_hour.setBounds(540, 60 , 90, 30);
        
        Textfield_Interviewer = new JTextField();
        Textfield_Interviewer.setBounds(100, 95 , 150, 30);
        
        Textfield_appointed_by = new JTextField();
        Textfield_appointed_by.setBounds(340, 95 , 100, 30);
        
        Textfield_Salary = new JTextField();
        Textfield_Salary.setBounds(340, 60 , 100, 30);
        
        Textfield_Termination_date = new JTextField();
        Textfield_Termination_date.setBounds(540, 95 , 90, 30);
        
        //Add platform for Senior Developer        
        Textfield_Platform2 = new JTextField();
        Textfield_Platform2.setBounds(100, 205 , 150, 30);
        
        Textfield_Salary2 = new JTextField();
        Textfield_Salary2.setBounds(340, 205 , 100, 30);
        
        Textfield_Interviewer2 = new JTextField();
        Textfield_Interviewer2.setBounds(100, 240 , 150, 30);
        
        Textfield_Working_hour2 = new JTextField();
        Textfield_Working_hour2.setBounds(540, 205 , 90, 30);
        
        Textfield_contract_Period = new JTextField();
        Textfield_contract_Period.setBounds(540, 240 , 90, 30);
        
        //Appoint/Terminate Senior Developer        
        Textfield_Name = new JTextField();
        Textfield_Name.setBounds(100, 395 , 330, 30);
        
        Textfield_joining_Date = new JTextField();
        Textfield_joining_Date.setBounds(540, 395, 90, 30);
        
        Textfield_dev_No = new JTextField();
        Textfield_dev_No.setBounds(100, 430 , 90, 30);
        
        Textfield_room_No = new JTextField();
        Textfield_room_No.setBounds(280, 430 , 90, 30);
        
        Textfield_advance_Salary = new JTextField();
        Textfield_advance_Salary.setBounds(540, 430, 90, 30);
        
        //Appoint Junior Developer
        Textfield_Name2 = new JTextField();
        Textfield_Name2.setBounds(100, 535 , 90, 30);
        
        Textfield_Specialization = new JTextField();
        Textfield_Specialization.setBounds(540, 535, 90, 30);
        
        Textfield_dev_No2 = new JTextField();
        Textfield_dev_No2.setBounds(100, 570 , 90, 30);
        
        Textfield_appoint_Date = new JTextField();
        Textfield_appoint_Date.setBounds(300, 570, 120, 30);
                
        Textfield_termination = new JTextField();
        Textfield_termination.setBounds(540, 570, 90, 30);
       
        //buttons
        Button_junior = new JButton("Add for Junior");
        Button_junior.setBounds(510, 130, 120, 30);       
                
        Button_senior = new JButton("Add for Senior");
        Button_senior.setBounds(510, 275, 120, 30);                
        
        Button_appoint = new JButton("Appoint");
        Button_appoint.setBounds(370, 465, 120, 30);                
        
        Button_terminate = new JButton("Terminate");
        Button_terminate.setBounds(510, 465, 120, 30);                
        
        Button_appoint_Junior = new JButton("Appoint Junior Developer");
        Button_appoint_Junior.setBounds(410, 605, 220, 30);        
                
        Button_display_All = new JButton("Display all");
        Button_display_All.setBounds(365, 660, 130, 30);               
        
        Button_clear = new JButton("Clear");
        Button_clear.setBounds(500, 660, 130, 30);
        
        
        
        //actionlistener for buttons
        Button_junior.addActionListener(this);
        Button_senior.addActionListener(this);
        Button_appoint.addActionListener(this);
        Button_terminate.addActionListener(this);
        Button_appoint_Junior.addActionListener(this);
        Button_display_All.addActionListener(this);
        Button_clear.addActionListener(this);
        
        //container of frame
        container.setLayout(null);
        container.add(Label_label1);   
        
        container.setLayout(null);
        container.add(Label_label2);
        
        container.setLayout(null);
        container.add(Label_label3);
        
        container.setLayout(null);
        container.add(Label_label4);
        
        //comtainers of text boxes
        container.add(Textfield_Platform);
        container.add(Textfield_Working_hour);
        container.add(Textfield_Interviewer);
        container.add(Textfield_appointed_by);
        container.add(Textfield_Termination_date);
        container.add(Textfield_Salary);
        container.add(Textfield_Platform2);
        container.add(Textfield_Working_hour2);
        container.add(Textfield_Interviewer2);
        container.add(Textfield_contract_Period);
        container.add(Textfield_Salary2);
        container.add(Textfield_Name);
        container.add(Textfield_joining_Date);
        container.add(Textfield_dev_No);
        container.add(Textfield_room_No);
        container.add(Textfield_advance_Salary);
        container.add(Textfield_Name2);
        container.add(Textfield_Specialization);
        container.add(Textfield_dev_No2);
        container.add(Textfield_appoint_Date);
        container.add(Textfield_termination);
        
        //containers of texts
        container.add(Interviewer);
        container.add(Platform);
        container.add(Working_hour);
        container.add(Appointed_by);
        container.add(Termination_date);
        container.add(Salary);
        container.add(Platform1);
        container.add(Working_hour1);
        container.add(Salary1);
        container.add(Interviewer1);
        container.add(Contract_period);
        container.add(Name1);
        container.add(Dev_no1);
        container.add(Joining_date);
        container.add(Room_no);
        container.add(Adv_Salary);
        container.add(Name2);
        container.add(Specialization);
        container.add(Dev_no2);
        container.add(Appoint_date);
        container.add(Termination);
        
        //container for buttons              
        container.add(Button_junior);
        container.add(Button_senior);
        container.add(Button_appoint);
        container.add(Button_terminate);
        container.add(Button_appoint_Junior);
        container.add(Button_display_All);
        container.add(Button_clear);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        //Add for Junior
        if (ae.getSource()==Button_junior)
        {
            try
            {
                
                String Platform1 = Textfield_Platform.getText();
                String Interviewer1 = Textfield_Interviewer.getText();
                String Button_appointed_by1= Textfield_appointed_by.getText();
                String Termi_date1 = Textfield_Termination_date.getText();
                int Salary1 =Integer.parseInt(Textfield_Salary.getText());
                int Working_hour1 =Integer.parseInt(Textfield_Working_hour.getText());
                JuniorDeveloper dev = new JuniorDeveloper( Platform1, Interviewer1, Working_hour1, Salary1, Button_appointed_by1, Termi_date1);
                developerList.add(dev);
                System.out.println("Platform is added for Junior Developer");
            }
            catch(Exception a)
            {
                System.out.println("Valid value needed");
            }                      
        }
        //Add for Senior
        else if(ae.getSource()==Button_senior)
        {
            try
            {                
                String Platform2 = Textfield_Platform2.getText();
                String Interviewer2 = Textfield_Interviewer2.getText();
                int Contract_period2 = Integer.parseInt(Textfield_contract_Period.getText());
                double Salary2 = Double.parseDouble(Textfield_Salary2.getText());
                int Working_hour2 = Integer.parseInt(Textfield_Working_hour2.getText());
                SeniorDeveloper dev1 = new SeniorDeveloper(Platform2, Interviewer2, Working_hour2, Salary2, Contract_period2);
                developerList.add(dev1);
                System.out.println("Platform is added for Senior Developer");
            }
            catch(Exception a)
            {
                System.out.println("Valid value needed");
                
            }        
        }
    
        //Appoint    
        else if(ae.getSource()==Button_appoint)
        {
            try
            {            
                String Name3 = Textfield_Name.getText();
                String Joining_Date1 = Textfield_joining_Date.getText();
                int Dev_no3= Integer.parseInt(Textfield_dev_No.getText());
                String Room_no1 = Textfield_room_No.getText();
                double Adv_Salary1 = Double.parseDouble(Textfield_advance_Salary.getText());
                if (Dev_no3 < developerList.size());
                {
                        if(developerList.get(Dev_no3) instanceof SeniorDeveloper)
                        { 
                            SeniorDeveloper dev3 = (SeniorDeveloper) developerList.get(Dev_no3);
                            dev3.developerappoint(Name3, Joining_Date1, Adv_Salary1, Room_no1);
                            developerList.add(dev3);                              
                        }
                        else
                        {
                        System.out.println("Enter valid value");  
                        }
                }
                }
            catch(Exception b)
            {
                System.out.println("Please fill all the text boxes");
            }            
        }
        //Terminate
        else if(ae.getSource()==Button_terminate)
        {
            try
            {                
                int devNo_senDevter = Integer.parseInt(Textfield_dev_No.getText());
                if(devNo_senDevter < developerList.size())
                {
                    if (developerList.get(devNo_senDevter) instanceof SeniorDeveloper)
                    {
                        SeniorDeveloper dev1 = (SeniorDeveloper) developerList.get(devNo_senDevter);
                        dev1.terminate();
                        System.out.println("Senior Developer has been terminated!!");
                    }
                    else
                    {
                        System.out.println("Senior Developer has not been terminated!!");
                    }
                }
                else{
                     System.out.println("Senior Developer has not been appointed");
                }
                
            }
            catch(Exception a)
            {
                System.out.println("Please give developer no.");
            }
                   
        }
        //Appoint Junior Dev
        else if(ae.getSource()==Button_appoint_Junior){
            try
            {        
                String Name3 = Textfield_Name.getText();
                String Specialization1 = Textfield_Specialization.getText();
                int Dev_no3= Integer.parseInt(Textfield_dev_No2.getText());
                String Button_appoint_date1 = Textfield_appoint_Date.getText();
                String Termination1 = Textfield_advance_Salary.getText();
                System.out.println("Junior Developer appointed!!");
                if (Dev_no3 < developerList.size());
                {
                        if(developerList.get(Dev_no3) instanceof JuniorDeveloper)
                        { 
                            JuniorDeveloper dev4 = (JuniorDeveloper) developerList.get(Dev_no3);
                            dev4.Developerappoint(Name3, Button_appoint_date1, Termination1, Specialization1);
                            developerList.add(dev4); 
                            
                        }
                        else
                        {
                        System.out.println("Enter valid value");  
                        }
                }
                }
            catch(Exception b)
            {
                System.out.println("Please fill all the text boxes");                
            }
        }
        //Display all 
        else if(ae.getSource()==Button_display_All)
        {
            try
            {
                int b = developerList.size();
                for( int i=0; i<b; i++)
                {
                Developer display_Btn = developerList.get(i); 
                if (display_Btn instanceof SeniorDeveloper){
                    SeniorDeveloper dev1 = (SeniorDeveloper) developerList.get(i);
                    dev1.showfinal();
                }
                          
                else if (display_Btn instanceof JuniorDeveloper)
                {
                    JuniorDeveloper dev2 = (JuniorDeveloper) developerList.get(i);
                    dev2.show();
                }                
            }
            }
            catch (Exception a)
            {
                System.out.println("Enter valid data");
            }                     
        }
        //Clear
        else if(ae.getSource()==Button_clear)
        {
            Textfield_Platform.setText("");
            Textfield_Salary.setText("");
            Textfield_Working_hour.setText("");
            Textfield_Interviewer.setText("");
            Textfield_appointed_by.setText("");
            Textfield_Termination_date.setText("");
            Textfield_Platform2.setText("");
            Textfield_Salary2.setText("");
            Textfield_Working_hour2.setText("");
            Textfield_Interviewer2.setText("");
            Textfield_contract_Period.setText("");
            Textfield_Name.setText("");
            Textfield_joining_Date.setText("");
            Textfield_dev_No.setText("");
            Textfield_room_No.setText("");
            Textfield_advance_Salary.setText("");
            Textfield_Name2.setText("");
            Textfield_Specialization.setText("");            
            Textfield_dev_No2.setText("");
            Textfield_appoint_Date.setText("");
            Textfield_termination.setText("");            
        }     
 }        
}
