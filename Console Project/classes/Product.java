package classes;
 
import java.util.Scanner;
public class Product 
{
   public String productName;
   public  int productnum;
   public double price;
   public int qty;
   public double tax;
   public double discount;
   public Product(){}
   public Product( int a,double b,int c,double d,double e)
   {
     productnum=a;
     price=b;
     qty=c;
     tax=d;
     discount=e;
  
    }
	public void setProductName(String productName)
    {
	  this.productName=productName;
    }
    public void setProductnum(int productnum)
    {
	  this.productnum=productnum;
    }
    public void setPrice(double price)
    {
	  this.price=price;
    }
    public void setQty(int qty)
    {
	  this.qty=qty;
    }
 public void setTax(double tax)
 {
	 this.tax=tax;
 }
 public void setDiscount(double discount)
 {
	 this.discount=discount;
 }
 public String getProductName(){return productName;} 
 public int getProductnum(){return productnum;} 
 public double getPrice(){return price;}
 public int getQty(){return qty;}
 public double getTax(){return tax;}
 public double getDiscount(){return discount;}
 
 
 public void addProduct()
 {
	 String p;
	 int no;
	 Scanner s=new Scanner(System.in);
	  
	 System.out.print("\t\tEnter No of product you want to add");
	 no=s.nextInt();
	 setProductnum(no);
	 s.nextLine();
	 for(int i=1;i<=getProductnum();i++)
	 {
		 System.out.print("\t\t\t\tEnter The Name of the "+i+" product : ");
		 p=s.nextLine();
		 setProductName(p);
		 System.out.print("\t\t\t\tNew added product for  "+i+": "+getProductName());
		 
	 }
	  
	   int q;
									      
	   for(int i=1;i<=getProductnum();i++)
	   {
        System.out.print("\t\tEnter The Price of the "+i+" product : ");
		q=s.nextInt();
		setPrice(q);
		System.out.println("\t\t\t\tPrice for "+i+"product : "+getPrice()+" Taka");
										   
	   }
       for(int i=1;i<=getProductnum();i++)
	   {
        System.out.print("\t\tEnter The Quantity of the "+i+" product : ");
		q=s.nextInt();
	    setQty(q);
		System.out.println("\t\t\t\tQuantity for "+i+" product : "+getQty()+" kg");
	                                   
	   }
 
 }
 
 public void showPrice()
 {   
	  System.out.println("\t\t\t\t---------------------------------");
	  System.out.println("\t\t\t\tTomato:12 tk Kg");
	  System.out.println("\t\t\t\tBanana: 8 tk piece");
	  System.out.println("\t\t\t\tOnion:100 tk kg ");
	  System.out.println("\t\t\t\tEggplant:40 tk kg");
	  System.out.println("\t\t\t\tFish:55 tk kg");
	  System.out.println("\t\t\t\tRice:82 taka kg");
	  System.out.println("\t\t\t\tSugar:52 tk kg");
	  System.out.println("\t\t\t\tPulses:64 tk kg");
	  System.out.println("\t\t\t\t---------------------------------");
 }
 
 
 public void ChangePrize()
	{
		int choice1;
        Scanner s=new Scanner(System.in);
        System.out.println("\t\tPlease select an option");
		 
        System.out.println("\t\t\t\t1.Change product price ");
        System.out.println("\t\t\t\t2.Add product");
		System.out.println("\t\t\t\t---------------------------------");
		System.out.print("\t\tGive Your Choice: ");
		
		choice1 = s.nextInt();
		System.out.println("\t\t\t\t---------------------------------");
		switch (choice1)
		{
			case 1:
	            int choice;
                System.out.println("\t\tPlease select an option");
		 
                System.out.println("\t\t\t\t1.Tomato ");
                System.out.println("\t\t\t\t2.Banana");
		        System.out.println("\t\t\t\t3.Onion");
		        System.out.println("\t\t\t\t4.Eggplant");
		        System.out.println("\t\t\t\t5.Fish");
		        System.out.println("\t\t\t\t6.Rice");
		        System.out.println("\t\t\t\t7.Sugar");
		        System.out.println("\t\t\t\t8.Pulses");
				 
				System.out.println("\t\t\t\t---------------------------------");
				System.out.print("\t\tGive Your Choice: ");
       

                choice = s.nextInt();
				System.out.println("\t\t\t\t---------------------------------");

                switch (choice)
				    {
                          case 1:
			                   System.out.print("\t\tEnter Quantity: ");
			                   double i=s.nextDouble();
							   setPrice(i);
                               System.out.println("\t\t\t\tprice to add: "+getPrice()+" per kg Tomato");
				               System.out.println("\t\t\t\tNew price is :"+(getPrice()+12)+" Taka");
				  
				   
				  
                                break;

                          case 2:
			                   System.out.print("\t\tEnter  prize to add: ");
			                   double j=s.nextDouble();
				               setPrice(j);
                               System.out.println("\t\t\t\tPrize: "+getPrice()+" per piece Banana");
				               System.out.println("\t\t\t\tNew total price is :"+(getPrice()+8)+" Taka");
                               break;

                          case 3:
			                   System.out.print("\t\tEnter  prize to add : ");
			                   double k=s.nextDouble();
				               setPrice(k);
			                   System.out.println("\t\t\t\tYou want to add: "+getPrice()+"per kg Onion");
				               System.out.println("\t\t\t\tNew price is: :"+(getPrice()+100)+" Taka");
				               break;
			
			              case 4:
			                   System.out.print("\t\tEnter  prize to add : ");
			                   double l=s.nextDouble();
				               setPrice(l);
			                   System.out.println("\t\t\t\tYou want to add: "+getPrice()+"per kg Eggplant");
				               System.out.println("\t\t\t\tNew price is: :"+(getPrice()+40)+" Taka");
				               break;
				  
			             case 5:
			                  System.out.print("\t\tEnter  prize to add : ");
			                  double m=s.nextDouble();
				              setPrice(m);
			                  System.out.println("\t\t\t\tYou want to add: "+getPrice()+"per kg fish");
				              System.out.println("\t\t\t\tNew price is: :"+(getPrice()+55)+" Taka");
				              break;
				  
			             case 6:
			                  System.out.print("\t\tEnter  prize to add : ");
			                  double n=s.nextDouble();
				              setPrice(n);
			                  System.out.println("\t\t\t\tYou want to add: "+getPrice()+"per kg  Rice");
				              System.out.println("\t\t\t\tNew price is: :"+(getPrice()+82)+" Taka");
				              break;
			
			            case 7:
			                 System.out.print("\t\tEnter  prize to add : ");
			                 double o=s.nextDouble();
				             setPrice(o);
			                 System.out.println("\t\t\t\tYou want to add: "+getPrice()+"per kg  Sugar");
				             System.out.println("\t\t\t\tNew price is: :"+(getPrice()+52)+" Taka");
				             break;
				  
			            case 8:
			                 System.out.print("\t\tEnter  prize to add : ");
			                 double p=s.nextDouble();
				             setPrice(p);
			                 System.out.println("\t\t\t\tYou want to add: "+getPrice()+"per kg  pulses");
				             System.out.println("\t\t\t\tNew price is: :"+(getPrice()+64)+" Taka");
				             break;
				  

                      default:
                             System.out.println("\t\t\t\tInvalid option:\n\n");
                 
                             break;
                    }
			case 2:
                 addProduct();
                 break;	
            default:
                   System.out.println("\t\t\t\tInvalid option:\n\n");
				   break;
                 
		}                  				 
	}
	
	
 
   public void productOption()
	{
	    int choice;
        Scanner s=new Scanner(System.in);
        System.out.println("\t\tPlease select an option");
		 
        System.out.println("\t\t\t\t1.Tomato ");
        System.out.println("\t\t\t\t2.Banana");
		System.out.println("\t\t\t\t3.Onion");
		System.out.println("\t\t\t\t4.Eggplant");
		System.out.println("\t\t\t\t5.Fish");
		System.out.println("\t\t\t\t6.Rice");
		System.out.println("\t\t\t\t7.Sugar");
		System.out.println("\t\t\t\t8.Pulses");
		System.out.println("\t\t\t\t---------------------------------");
		System.out.print("\t\tGive Your Choice: ");
       

        choice = s.nextInt();
		System.out.println("\t\t\t\t---------------------------------");

        switch (choice) {
            case 1:
			      System.out.print("\t\tEnter Quantity: ");
			      int i=s.nextInt();
				  setQty(i);
                  System.out.println("\t\t\t\tQuantity: "+getQty()+" kg Tomato");
				  System.out.println("\t\t\t\tYour total price is :"+(getQty()*12)+" Taka");
				  
                break;

            case 2:
			      System.out.print("\t\tEnter Quantity: ");
			      int j=s.nextInt();
				  setQty(j);
                  System.out.println("\t\t\t\tQuantity: "+getQty()+" piece Banana");
				  System.out.println("\t\t\t\tYour total price is :"+(getQty()*8)+" Taka");
                break;

             case 3:
			      System.out.print("\t\tEnter Quantity: ");
			      int k=s.nextInt();
				  setQty(k);
			      System.out.println("\t\t\t\tYou want to sell "+getQty()+" kg Onion");
				  System.out.println("\t\t\t\tQuantity: :"+(getQty()*100)+" Taka");
				  break;
			
			 case 4:
			      System.out.print("\t\tEnter Quantity: ");
			      int l=s.nextInt();
				  setQty(l);
			      System.out.println("\t\t\t\tYou want to sell "+getQty()+" kg Eggplant");
				  System.out.println("\t\t\t\tQuantity: :"+(getQty()*40)+" Taka");
				  break;
				  
			 case 5:
			      System.out.print("\t\tEnter Quantity: ");
			      int m=s.nextInt();
				  setQty(m);
			      System.out.println("\t\t\t\tYou want to sell "+getQty()+" kg Fish");
				  System.out.println("\t\t\t\tQuantity: :"+(getQty()*55)+" Taka");
				  break;
				  
			 case 6:
			      System.out.print("\t\tEnter Quantity: ");
			      int n=s.nextInt();
				  setQty(n);
			      System.out.println("\t\t\t\tQuantity: "+getQty()+" kg Rice");
				  System.out.println("\t\t\t\tYour total price is :"+(getQty()*82)+" Taka");
				  break;
			
			 case 7:
			      System.out.print("\t\tEnter Quantity: ");
			      int o=s.nextInt();
				  setQty(o);
			      System.out.println("\t\t\t\tQuantity: "+getQty()+" kg Sugar");
				  System.out.println("\t\t\t\tYour total price is :"+(getQty()*52)+" Taka");
				  break;
				  
			 case 8:
			      System.out.print("\t\tEnter Quantity: ");
			      int p=s.nextInt();
				  setQty(p);
			      System.out.println("\t\t\t\tQuantity: "+getQty()+" kg Pulses");
				  System.out.println("\t\t\t\tYour total price is :"+(getQty()*64)+" Taka");
				  break;
				  

            default:
                System.out.print("\t\t\t\tInvalid option:\n\n");
                 
                break;
        }	
	}
 
 public void productOption2()
	{
	  int choice;
        Scanner s=new Scanner(System.in);
        System.out.println("t\tPlease select an option");
		 
        System.out.println("\t\t\t\t1.Tomato ");
        System.out.println("\t\t\t\t2.Banana");
		System.out.println("\t\t\t\t3.Onion");
		System.out.println("\t\t\t\t4.Eggplant");
		System.out.println("\t\t\t\t5.Fish");
		System.out.println("\t\t\t\t6.Rice");
		System.out.println("\t\t\t\t7.Sugar");
		System.out.println("\t\t\t\t8.Pulses");
        System.out.println("\t\t\t\t---------------------------------");
		System.out.print("\t\tGive Your Choice: ");

        choice = s.nextInt();
		System.out.println("\t\t\t\t---------------------------------");

        switch (choice) {
            case 1:
			      System.out.print("\t\tEnter Quantity: ");
			      int i=s.nextInt();
				  setQty(i);
                  System.out.println("\t\t\t\tQuantity: "+getQty()+" kg Tomato");
				  System.out.println("\t\t\t\tYour total price is :"+((getQty()*12)*0.05)+" Taka");
				  
                break;

            case 2:
			      System.out.print("\t\tEnter Quantity: ");
			      int j=s.nextInt();
				  setQty(j);
                  System.out.println("\t\t\t\tQuantity: "+getQty()+" piece Banana");
				  System.out.println("\t\t\t\tYour total price is :"+((getQty()*8)*0.05)+" Taka");
                break;

             case 3:
			      System.out.print("\t\tEnter Quantity: ");
			      int k=s.nextInt();
				  setQty(k);
			      System.out.println("\t\t\t\tQuantity: "+getQty()+" kg Onion");
				  System.out.println("\t\t\t\tYour total price is :"+((getQty()*100)*0.05)+" Taka");
				  break;
			
			 case 4:
			      System.out.print("\t\tEnter Quantity: ");
			      int l=s.nextInt();
				  setQty(l);
			      System.out.println("\t\t\t\tQuantity: "+getQty()+" kg Eggplant");
				  System.out.println("\t\t\t\tYour total price is :"+(getQty()*40)+" Taka");
				  break;
				  
			 case 5:
			      System.out.print("\t\tEnter Quantity: ");
			      int m=s.nextInt();
				  setQty(m);
			      System.out.println("\t\t\t\tQuantity: "+getQty()+" kg Fish");
				  System.out.println("\t\t\t\tYour total price is :"+((getQty()*55)*0.05)+" Taka");
				  break;
				  
			 case 6:
			      System.out.print("\t\tEnter Quantity: ");
			      int n=s.nextInt();
				  setQty(n);
			      System.out.println("\t\t\t\tQuantity: "+getQty()+" kg Rice");
				  System.out.println("\t\t\t\tYour total price is :"+((getQty()*82)*0.05)+" Taka");
				  break;
			
			 case 7:
			      System.out.print("\t\tEnter Quantity: ");
			      int o=s.nextInt();
				  setQty(o);
			      System.out.println("\t\t\t\tQuantity: "+getQty()+" kg Sugar");
				  System.out.println("\t\t\t\tYour total price is :"+((getQty()*52)*0.05)+" Taka");
				  break;
				  
			 case 8:
			      System.out.println("\t\tEnter Quantity: ");
			      int p=s.nextInt();
				  setQty(p);
			      System.out.println("\t\t\t\tQuantity: "+getQty()+" kg Pulses");
				  System.out.println("\t\t\t\tYour total price is :"+((getQty()*64)*0.05)+" Taka");
				  break;
				  

            default:
                System.out.println("\t\t\t\tInvalid option:\n\n");
                 
                break;
        }	
  
  
    }
 
}