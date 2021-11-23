package classes;
import java.util.Scanner;
public class Admin extends Product
{
	private String adminName;
	private String  adminId;
	private String password;
	private String  adminAddress;
	private int mobileNo;
	 
	int a;
	String sc,sc2;
	
	 public  Admin(){}
	public  Admin(String farmerName,String farmerId,String farmerAddress,int mobileNo)
	{
		  
		this. adminName= adminName;
		this. adminId=adminId;
		this. adminAddress=adminAddress;
		this.mobileNo=mobileNo;
		
	}
	public void setAdminName(String adminName)
	{
		this.adminName=adminName;
	}
	public void setadminId(String  adminId)
	{
		this.adminId= adminId;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public void setAdminAddress(String adminAddress)
	{
		this.adminAddress= adminAddress;
	}
	public void setMobileNo(int mobileNo)
	{
		this.mobileNo=mobileNo;
	}
	 
	public String getAdminName(){return adminName;}
	public String getAdminId(){return adminId;}
	public String getPassword(){return password;}
    public String getAdminAddress(){return adminAddress;}
	public int getMobileNo(){return mobileNo;}
	 
	
	public void Adminlogin()
	{    
	    Scanner s=new Scanner(System.in);
	    System.out.print("\t\tEnter your Id: ");
	    sc=s.nextLine();
	    System.out.print("\t\tEnter your  password: ");
	    sc2=s.nextLine();
		System.out.println("\t\t\t\t*********************************");
	    System.out.println("\t\t\t\tLog in Succesfully");
	    System.out.println("\t\t\t\t*********************************");
	}
	public void AdminOption()
	{
		 
	    int choice;
        Scanner s=new Scanner(System.in);
		 System.out.println(" ");
        System.out.println("\t\tPlease select an option");
		System.out.println(" "); 
        System.out.println("\t\t\t\t1.See Amount Of Each Product In Stock");
        System.out.println("\t\t\t\t2.See Amount Of Each Product selling");
		System.out.println("\t\t\t\t3.See Amount Of Each Product Buying");
		System.out.println("\t\t\t\t4.Making change of the products");
		System.out.println("\t\t\t\t---------------------------------");
		System.out.print("\t\tGive Your Choice: ");
       

        choice = s.nextInt();
		System.out.println("\t\t\t\t---------------------------------");

        switch (choice) {
            case 1:
                 System.out.println("\t\tProduct no  Product Type  Product amount previous  Buying Amount  Selling  Amount  Date    Rest of the Amount in Stock"); 
				 System.out.println("\t\t 1          Vegetable        41kg                   24kg            26kg          12/08/20 39kg");
				 System.out.println("\t\t 2          Fish             42kg                   24kg            26kg          12/08/20 40kg");
				 System.out.println("\t\t 3          Rice             104kg                  52kg            102kg         12/08/20 54kg");
				 System.out.println("\t\t 4          pulses           104kg                  52kg            102kg         12/08/20 54kg");
				 another();
                 break;

            case 2:
                 System.out.println("\t\tProduct no  Product Type  Product amount previous    Selling  Amount  Date   Rest of the Amount in Stock"); 
				 System.out.println("\t\t 1          Vegetable        41kg                    26kg          12/08/20  39kg");
				 System.out.println("\t\t 2          Fish             42kg                    26kg          12/08/20  40kg");
				 System.out.println("\t\t 3          Rice             104kg                   102kg         12/08/20  54kg");
				 System.out.println("\t\t 4          pulses           104kg                   102kg         12/08/20  54kg");
				 another();
				  
                break;

             case 3:
			      
			     System.out.println("\t\tProduct no  Product Type  Product amount previous  Buying Amount    Date     Rest of the Amount in Stock"); 
				 System.out.println("\t\t 1          Vegetable        41kg                   24kg            12/08/20    39kg");
				 System.out.println("\t\t 2          Fish             42kg                   24kg            12/08/20    40kg");
				 System.out.println("\t\t 3          Rice             104kg                  52kg            12/08/20    54kg");
				 System.out.println("\t\t 4          pulses           104kg                  52kg            12/08/20    54kg");
				 another();
				 break;
				 
				 
			case 4:
			     ChangePrize();
				 another();
				 break;

            default:
                System.out.println("\t\t\t\tInvalid option:\n\n");
                break;
        }	
	}
	
	 
	
	 
	public void another() 
	{
		Scanner s=new Scanner(System.in);
        System.out.println("\t\t\t\t---------------------------------");
        System.out.println("\t\tDo you want other option of Admin?\n\n\t\tPress 1 for another option\n\t\t2 To for main manu");
		System.out.println("\t\t\t\t---------------------------------");
		System.out.print("\t\tGive Your Choice: ");
        a = s .nextInt();
		System.out.println("\t\t\t\t---------------------------------");
        if (a == 1) {
            AdminOption();  
        } else if (a  == 2) {
            System.out.println("\t\t\t\tThanks for Coming.");
			AdminOption();
        } else {
            System.out.println("\t\t\t\tInvalid choice\n\n");
			System.out.println("\t\t\t\tYou have been logged out");
             
        }
    }
	
	public void showAdmin()
	{
		System.out.println("Name  : "+getAdminName());
		System.out.println("Id : "+getAdminId());
	    System.out.println("Address : "+getAdminAddress());
		 
		System.out.println("Mobile no : "+getMobileNo());
		 
		
	}
	

	
}