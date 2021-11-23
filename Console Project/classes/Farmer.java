package classes;
import java.lang.*;
import java.util.Scanner;
public class Farmer extends Product  
{
	private String farmerName;
	private String farmerId;
	private String password;
	private String farmerAddress;
	private int mobileNo;
	private int bkashOrDbbl;
	int a;
	String sc,sc2;
	
	 public Farmer(){}
	public Farmer(String farmerName,String farmerId,String farmerAddress,int mobileNo,int bkashOrDbbl)
	{
		  
		this.farmerName=farmerName;
		this.farmerId=farmerId;
		this.farmerAddress=farmerAddress;
		this.mobileNo=mobileNo;
		this.bkashOrDbbl=bkashOrDbbl;
	}
	public void setFarmerName(String farmerName)
	{
		this.farmerName=farmerName;
	}
	public void setFarmerId(String farmerId)
	{
		this.farmerId=farmerId;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public void setFarmerAddress(String farmerAddress)
	{
		this.farmerAddress=farmerAddress;
	}
	public void setMobileNo(int mobileNo)
	{
		this.mobileNo=mobileNo;
	}
	public void setBkashOrDBBL(int bkashOrDbbl)
	{
		this.bkashOrDbbl=bkashOrDbbl;
	}
	public String getFarmerName(){return farmerName;}
	public String getFarmerId(){return farmerId;}
	public String getPassword(){return password;}
    public String getFarmerAddress(){return farmerAddress;}
	public int getMobileNo(){return mobileNo;}
	public int getBashOrDBBl(){return bkashOrDbbl;}
	
	public void farmerlogin()
	{    
	    Scanner s=new Scanner(System.in);
	    System.out.print("\t\tEnter your Id");
	    sc=s.nextLine();
	    System.out.print("\t\tEnter your  password ");
	    sc2=s.nextLine();
	}
	public void farmerOption()
	{
	  int choice;
        Scanner s=new Scanner(System.in);
        System.out.println("\t\tPlease select an option");
		System.out.println(" "); 
        System.out.println("\t\t\t\t1.First Time");
        System.out.println("\t\t\t\t2.You Have already your User Id and Password");
		System.out.println("\t\t\t\t3.see product price");
		System.out.println(" ");
		System.out.println("\t\t\t\t---------------------------------");
		System.out.print("\t\tGive Your Choice: ");
       

        choice = s.nextInt();
		System.out.println("\t\t\t\t---------------------------------");

        switch (choice) {
            case 1:
                 farmerInfo();
				  
				  
                break;

            case 2:
                 farmerlogin();
				 System.out.println("\t\t\t\t*********************************");
				 System.out.println("\t\t\t\tLog in Succesfully");
				 System.out.println("\t\t\t\t*********************************");
				 productOption();
				 payFarmer();
				 another();
                break;

             case 3:
			      showPrice();
				 farmerOption();
				 break;

            default:
                System.out.println("\t\t\t\tInvalid option:\n\n");
                another();
                break;
        }	
	}
	
	public void farmerInfo()
	{
		 int choice;
        Scanner s=new Scanner(System.in);
        System.out.println("\t\t0"+getMobileNo()+ " Is this your Phone No:");
		
        System.out.println("\t\t\t\t1. Yes");
        System.out.println("\t\t\t\t2. No");
		System.out.println("\t\t\t\t---------------------------------");
		System.out.print("\t\tGive Your Choice: ");
       

        choice = s .nextInt();
		System.out.println("\t\t\t\t---------------------------------");

        switch (choice) {
            case 1:
                System.out.println( "\t\t\t\tWe Have send You a farmer id and password for further proccedure");
			    setFarmerId("Farmer112");
			    setPassword("****");
			    System.out.println("\t\t\t\tId: "+getFarmerId() + "and Password: "+getPassword());
				farmerlogin();
				System.out.println("\t\t\t\t*********************************");
				System.out.println("\t\t\t\tLog in Succesfully");
				System.out.println("\t\t\t\t*********************************");
				productOption();
                payFarmer();			
				another();
                break;

            case 2:
                 another();
                break;

             

            default:
                System.out.println("\t\t\t\tInvalid option:\n\n");
                another();
                break;
        }

    
	}
	public  void another() 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("\t\t\t\t---------------------------------");
        System.out.println("\t\tDo you want other option of Farmer?\n\n\t\tPress 1 for another option\n\t\t2 To for main manu");
		System.out.println("\t\t\t\t---------------------------------");
		System.out.print("\t\tGive your Choice:");
        a = s .nextInt();
		System.out.println("\t\t\t\t---------------------------------");
        if (a == 1) {
           another();  
        } else if (a  == 2) {
            System.out.println("\t\t\t\tThanks for Coming.");
			farmerOption();
        } else {
            System.out.println("\t\t\t\tInvalid choice\n\n");
             
        }
    }
	 
	 public void payFarmer()
	{   
	    int choice;
	    Scanner s=new Scanner(System.in);
		System.out.print("\t\tEnter Your Bkash or DBBL no");
		int a = s .nextInt();
		setBkashOrDBBL(a);
		System.out.println("\t\t\t\t"+getBashOrDBBl()+ "Is this your Bkash or DBBL No:");
		System.out.println("\t\t\t\t---------------------------------");
		
        System.out.println("\t\t\t\t1. Yes");
        System.out.println("\t\t\t\t2. No");
		System.out.print("\t\tGive your Choice: ");
		choice = s .nextInt();
		System.out.println("\t\t\t\t---------------------------------");
		switch (choice) {
            case 1:
                System.out.println("\t\t\t\tYour Full money Have been Send In your "+getBashOrDBBl()+" account"); 
				another();
                break;

            case 2:
                payFarmer();
                break;

             

            default:
                System.out.println("\t\t\t\tInvalid option:\n\n");
                
                break;
        }
		
	}
	
	public void showFarmer()
	{
		System.out.println("Name  : "+getFarmerName());
		System.out.println("Id : "+getFarmerId());
	    System.out.println("Address : "+getFarmerAddress());
		System.out.println("Address : "+getFarmerAddress());
		System.out.println("Mobile no : "+getMobileNo());
		System.out.println("Bkash or DBBL No : "+getBashOrDBBl());
		
	}
	

	
	
}