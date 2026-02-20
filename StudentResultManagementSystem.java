import java.util.Scanner;
import java.util.ArrayList;
public class StudentResultManagementSystem
{
    ArrayList<Integer> rolllist = new ArrayList<>();
    ArrayList<String> namelist = new ArrayList<>();
    ArrayList<Integer> totallist = new ArrayList<>();
    ArrayList<Double> averagelist = new ArrayList<>();
    ArrayList<String> gradelist = new ArrayList<>();
    ArrayList<Integer> m1list = new ArrayList<>();
    ArrayList<Integer> m2list = new ArrayList<>();
    ArrayList<Integer> m3list = new ArrayList<>();
    ArrayList<Integer> m4list = new ArrayList<>();
    ArrayList<Integer> m5list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void add_student()
    {
        System.out.print("Enter the roll no : ");
        int rollno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the name : ");
        String name = sc.nextLine();
        int m1;
        while(true)
        {
        System.out.println("Enter the mark1 (0-100): ");
        m1 = sc.nextInt();
        if(m1>=0 && m1<=100)
        {
        break;
        }
        else
        {
        System.out.println("Invalid mark! Enter between 0 and 100 only.");
         }
}

 
        int m2;
        while(true)
        {
            System.out.println("Enter mark2 (0-100)");
            m2 = sc.nextInt();
            if(m2>=0 && m2<=100)
            {
                break;
            }
            else
            {
                System.out.println("Enter the mark between 0-100 only");
            }
        }
        int m3;
        while(true)
        {
            System.out.println("Enter mark3 (0-100)");
            m3 = sc.nextInt();
            if(m3>=0 && m3<=100)
            {
                break;
            }
            else
            {
                System.out.println("Enter the mark between 0-100 only");
            }
        }

        int m4;
        while(true)
        {
            System.out.println("Enter mark4 (0-100)");
            m4 = sc.nextInt();
            if(m4>=0 && m4<=100)
            {
                break;
            }
            else
            {
                System.out.println("Enter the mark between 0-100 only");
            }
        }

        int m5 ;
        while(true)
        {
            System.out.println("Enter mark5 (0-100)");
            m5 = sc.nextInt();
            if(m5>=0 && m5<=100)
            {
                break;
            }
            else
            {
                System.out.println("Enter the mark between 0-100 only");
            }
        }
        int total = m1+m2+m3+m4+m5;
        double avg = total/5.0;
        String grade = calculategrade(m1,m2,m3,m4,m5,avg);
        rolllist.add(rollno);
        namelist.add(name);
        totallist.add(total);
        averagelist.add(avg);
        gradelist.add(grade);
        m1list.add(m1);
        m2list.add(m2);
        m3list.add(m3);
        m4list.add(m4);
        m5list.add(m5);
        System.out.println("Student added successfully!");
    }
    public String calculategrade(int m1,int m2,int m3,int m4,int m5,double avg)
    {
        if(m1<45 || m2<45 || m3<45 || m4<45 || m5<45)
        {
            return " 'Fail' ";
        }
        else if(avg>=90)
        {
            return " 'O' ";
        }
        else if(avg>=80)
        {
            return " 'A+' ";
        }
        else if(avg>=70)
        {
            return " 'A' ";
        }
        else if(avg>=60)
        {
            return " 'B+' ";
        }
        else if(avg>=50)
        {
            return " 'B' ";
        }
        else if(avg>=45)
        {
            return " 'C' ";
        }
        else
        {
            return "Fail";
        }
    }
    public void view_students()
    {
        System.out.println("====Student records====");
        if(rolllist.isEmpty())
        {
            System.out.println("No records are found!");
            return;
        }
        else
        {
            for(int i = 0;i<rolllist.size();i++)
            {
                System.out.println("Roll no : "+rolllist.get(i));
                System.out.println("Name : "+namelist.get(i));
                System.out.println("Total : "+totallist.get(i));
                System.out.println("Average : "+averagelist.get(i));
                System.out.println("Grade : "+gradelist.get(i));
                System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
            }
        }
    }
    public void update_student()
    {
        if(rolllist.isEmpty())
        {
            System.out.println("No records are found!");
            return;
        }
    
        System.out.print("Enter student's roll number to update : ");
        int roll_no = sc.nextInt();
        sc.nextLine();
        int index = rolllist.indexOf(roll_no);
  
        if(index==-1)
        {
            System.out.println("Student is not found!");
            return;
        }
        else
        {
            int m1 = m1list.get(index);
            int m2 = m2list.get(index);
            int m3 = m3list.get(index);
            int m4 = m4list.get(index);
            int m5 = m5list.get(index);
            System.out.println("What do u want to update");
            System.out.println("1.Name \n2.Mark1 \n3.Mark2 \n4.Mark3 \n5.Mark4 \n6.Mark5");
            System.out.print("Enter the option u want to update : ");
            int opt = sc.nextInt();
            if(opt == 1)
            {
                System.out.print("Enter new name to update : ");
                sc.nextLine();
                String name = sc.nextLine();
                namelist.set(index,name);
            }
            else if(opt == 2)
            {
                while(true)
                {
                System.out.println("Enter the new mark1 (0-100): ");
                m1 = sc.nextInt();
                if(m1>=0 && m1<=100)
                {
                
                m1list.set(index,m1);
                break;
                }
               else
              {
               System.out.println("Invalid mark! Enter between 0 and 100 only.");
              }
            }
            }
            else if(opt == 3)
            {
                
                while(true)
                {
                System.out.println("Enter the new mark2 (0-100): ");
                m2 = sc.nextInt();
                if(m2>=0 && m2<=100)
                {
                m2list.set(index,m2);
            
                break;
                }
               else
              {
               System.out.println("Invalid mark! Enter between 0 and 100 only.");
              }
            }
            }
        else if(opt == 4)
            {
                
                while(true)
                {
                System.out.println("Enter the new mark3 (0-100): ");
                 m3 = sc.nextInt();
                if(m3>=0 && m3<=100)
                {
                m3list.set(index,m3);
                break;
                }
               else
              {
               System.out.println("Invalid mark! Enter between 0 and 100 only.");
              }
            }
            }
            else if(opt == 5)
            {
                
                while(true)
                {
                System.out.println("Enter the new mark4 (0-100): ");
                 m4 = sc.nextInt();
                if(m4>=0 && m4<=100)
                {
                   
                m4list.set(index,m4);
                break;
                }
               else
              {
               System.out.println("Invalid mark! Enter between 0 and 100 only.");
              }
            }
            }
            else if(opt == 6)
            {
                
                while(true)
                {
                System.out.println("Enter the new mark5 (0-100): ");
                 m5 = sc.nextInt();
                if(m5>=0 && m5<=100)
                {
                m5list.set(index,m5);
                break;
                }
               else
              {
               System.out.println("Invalid mark! Enter between 0 and 100 only.");
              }
            }
            }
            m1 = m1list.get(index);
         m2 = m2list.get(index);
             m3 = m3list.get(index);
             m4 = m4list.get(index);
             m5 = m5list.get(index);
        int total = m1+m2+m3+m4+m5;
        double avg = total/5.0;
        String grade = calculategrade(m1,m2,m3,m4,m5,avg);
       
        totallist.set(index,total);
        averagelist.set(index,avg);
        gradelist.set(index,grade);
        System.out.println("The Student record is updated successfully!");
        }
    }
    public void search_student()
    {
         if(rolllist.isEmpty())
        {
            System.out.println("No records are found!");
            return;
        }
        System.out.print("Enter student's roll number to search : ");
        int roll_no = sc.nextInt();
        sc.nextLine();
        int index = rolllist.indexOf(roll_no);
        if(index==-1)
        {
            System.out.println("Student is not found!");
        }
        else
        {
            System.out.println("Roll no : "+rolllist.get(index));
                System.out.println("Name : "+namelist.get(index));
                System.out.println("Total : "+totallist.get(index));
                System.out.println("Average : "+averagelist.get(index));
                System.out.println("Grade no : "+gradelist.get(index));
                System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        }
    }
     public void delete_student()
    {
         if(rolllist.isEmpty())
        {
            System.out.println("No records are found!");
            return;
        }
        System.out.print("Enter student's roll number to delete : ");
        int roll_no = sc.nextInt();
        sc.nextLine();
        int index = rolllist.indexOf(roll_no);
        if(index==-1)
        {
            System.out.println("Student is not found!");
        }
        else
        {
            rolllist.remove(index);
            namelist.remove(index);
            totallist.remove(index);
            averagelist.remove(index);
            gradelist.remove(index);
            m1list.remove(index);
            m2list.remove(index);
            m3list.remove(index);
            m4list.remove(index);
            m5list.remove(index);
            System.out.println("Student record is deleted successfully!");
        }
    }
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        StudentResultManagementSystem obj = new StudentResultManagementSystem();
        while(true)
        {
            System.out.println("================================");
            System.out.println("STUDENT RESULT MANAGEMENT SYSTEM");
            System.out.println("================================");
        System.out.println("1.Add Student \n2.View Students \n3.Update Student \n4.Search Student \n5.Delete Student \n6.Exit");
        System.out.println("Enter choice : ");
        int choice = scan.nextInt();
        if(choice == 1)
        {
           obj.add_student();
        }
        else if(choice == 2)
        {
            obj.view_students();
        }
        else if(choice == 3)
        {
            obj.update_student();
        }
        else if(choice == 4)
        {
            obj.search_student();
        }
        else if(choice == 5)
        {
            obj.delete_student();
        }
        else if(choice == 6)
        {
            System.out.println("Exiting the program..");
            break;
        }
        else
        {
            System.out.println("Invalid choice!");
        }
        }
    }
}