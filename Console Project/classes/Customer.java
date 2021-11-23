package classes;
 
import java.util.Scanner;
public class Customer extends Product  
{
    private String CustomerName;
    private String CustomerId;
    private String CustomerAddress;
    private int mobileNo;
    private int bkashOrDbbl;
	int a;
    
    public Customer(){}
    public Customer( String CustomerName,String CustomerId,String CustomerAddress,int mobileNo,int bkashOrDbbl)
    {
         
        this.CustomerName=CustomerName;
        this.CustomerId=CustomerId;
        this.CustomerAddress=CustomerAddress;
        this.mobileNo=mobileNo;
        this.bkashOrDbbl=bkashOrDbbl;
    }
    public void setCustomerName(String CustomerName)
    {
        this.CustomerName=CustomerName;
    }
    public void setCustomerId(String CustomerId)
    {
        this.CustomerId=CustomerId;
    }
     
    public void setCustomerAddress(String CustomerAddress)
    {
        this.CustomerAddress=CustomerAddress;
    }
    public void setMobileNo(int mobileNo)
    {
        this.mobileNo=mobileNo;
    }
    public void setBkashOrDBBL(int bkashOrDbbl)
    {
        this.bkashOrDbbl=bkashOrDbbl;
    }
    public String getCustomerName(){return CustomerName;}
    public String getCustomerId(){return CustomerId;}
    public String getCustomerAddress(){return CustomerAddress;}
    public int getMobileNo(){return mobileNo;}
    public int getBashOrDBBl(){return bkashOrDbbl;}
    
     public void customerOption()
    {
      int choice;
        Scanner s=new Scanner(System.in);
		System.out.println("");
        System.out.println("\t\tPlease select an option");
        System.out.println("");
        System.out.println("\t\t\t\t1.First Time");
        System.out.println("\t\t\t\t2.Not First Time");
        System.out.println("\t\t\t\t3.see product price");
        System.out.println("");
		System.out.println("\t\t\t\t---------------------------------");
		System.out.print("\t\tGive Your Choice: ");
 

        choice = s.nextInt();
		System.out.println("\t\t\t\t---------------------------------");

 

        switch (choice) {
            case 1:
                 productOption();
                 payCustomer();
				 another();
                break;


            case 2:
			     System.out.println("\t\t\t\tCongratulation. You have 5% discount");
                 productOption2();
				 payCustomer();
                 another();
                 break;

            case 3:
                  showPrice();
                 customerOption();
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
        System.out.println("\t\tDo you want other option of Customer?\n\n\t\tPress 1 for another option\n\t\t2 To for main manu");
		System.out.println("\t\t\t\t---------------------------------");
		System.out.print("\t\tGive Your Choice: ");
        a = s .nextInt();
	    System.out.println("\t\t\t\t---------------------------------");
        if (a == 1) {
            customerOption() ;  
        } else if (a  == 2) {
            System.out.println("\t\t\t\tThanks for Coming.");
            customerOption();
        } else {
			
            System.out.println("\t\t\t\tInvalid choice\n\n");
             
        }
    }
    
    
    
    public void showCustomer()
    {
        System.out.println("Name  : "+getCustomerName());
        System.out.println("Id : "+getCustomerId());
        System.out.println("Address : "+getCustomerAddress());
        System.out.println("Address : "+getCustomerAddress());
        System.out.println("Mobile no : "+getMobileNo());
        System.out.println("Bkash or DBBL No : "+getBashOrDBBl());
        
    }
    
	 public void payCustomer()
	{   
	    int choice1;
	    Scanner s=new Scanner(System.in);
	    System.out.println( "\t\tSelect Your Payment method bellow..");
		
        System.out.println("\t\t\t\t1. Pay online");
        System.out.println("\t\t\t\t2. Cash On delivery");
		System.out.println("\t\t\t\t---------------------------------");
		System.out.print("\t\tGive Your Choice: ");
		choice1 = s .nextInt();
		System.out.println("\t\t\t\t---------------------------------");
		switch (choice1) {
            case 1:
                int choice;
	             
		        System.out.print("\t\tEnter Your Bkash or DBBL no");
		         a = s .nextInt();
		        setBkashOrDBBL(a);
		        System.out.println("\t\t0"+getBashOrDBBl()+ " Is this your Bkash or DBBL No:");
		
                System.out.println("\t\t\t\t1. Yes");
                System.out.println("\t\t\t\t2. No");
				System.out.println("\t\t\t\t---------------------------------");
				System.out.print("\t\tGive Your Choice: ");
		        choice = s .nextInt();
				System.out.println("\t\t\t\t---------------------------------");
		        switch (choice) {
                case 1:
                System.out.println("\t\t\t\tYou Have paid Full money By  0"+getBashOrDBBl()+" account"); 
				System.out.println("\t\t\t\tYou will get Your producs within 24 hours");
				another();
                break;

            case 2:
                 payCustomer();
                 break;

             

            default:
                System.out.println("\t\t\t\tInvalid option:\n\n");
                another();
                break;
        }
				another();
                break;

            case 2:
                 System.out.println("\t\t\t\tYou will get Your producs within 24 hours and have to pay the full amount");
				 another();
                break;

             

            default:
                System.out.println("\t\t\t\tInvalid option:\n\n");
                break;
        }
		
	}

 

 

 

    
    
}