import java.lang.*;
import java.util.Scanner;
import classes.*;
import fileio.*;
public class  project
{
public static void main(String [] args)
{	
       Scanner sc = new Scanner(System.in);
	    
	   FileReadWriteDemo frwd = new FileReadWriteDemo();
	   boolean repeat = true; 
	    

	   while(repeat)
		{
	     
        Scanner s=new Scanner(System.in);
	    System.out.println(" ");
		System.out.println("\t\t\tWelcome To Our Project And Its our pleasure To See You\n\n" );
        System.out.println("\t\tPlease select an option");
		System.out.println(" "); 
        System.out.println("\t\t\t\t1.Farmer");
        System.out.println("\t\t\t\t2.Customer");
		System.out.println("\t\t\t\t3.Admin");
		System.out.println("\t\t\t\t4.Exit");
		System.out.println("\t\t\t\t---------------------------------");
       
        System.out.print("\t\tGive Your Choice: ");
        int choice = s.nextInt();
		System.out.println("\t\t\t\t---------------------------------");

        switch (choice) {
            case 1:
			     
                 Farmer f= new Farmer();
	             System.out.print("\t\tEnter your Name: ");
				 s.nextLine();
		         String name=s.nextLine();
		         f.setFarmerName(name);
		         System.out.print("\t\tEnter your Address: ");
		         String add=s.nextLine();
		         f.setFarmerAddress(add);
		         System.out.print("\t\tEnter your Mobile no: ");
		         int mno=s.nextInt();
		         f.setMobileNo(mno);
				 frwd.writeInFile("\t\t\t\t\t\tFarmer Information ");
				 frwd.writeInFile("\t\t\t\tName: "+name );
				 frwd.writeInFile("\t\t\t\tAddress: "+add );
				 frwd.writeInFile("\t\t\t\tMobile No 0: "+mno );
		         System.out.println("\t\t\t\tName: "+f.getFarmerName());
		         System.out.println("\t\t\t\tName and Address: "+f.getFarmerAddress());
		         System.out.println("\t\t\t\tMobile No:0"+f.getMobileNo());
				 System.out.println("\t\t\t\t---------------------------------");
		         int choice2;
                  
                 System.out.println("\t\tPlease select an option");
		         System.out.println(" "); 
                 System.out.println("\t\t\t\t1.First Time");
                 System.out.println("\t\t\t\t2.You Have already your User Id and Password");
		         System.out.println("\t\t\t\t3.see product price");
		         System.out.println(" ");
				 System.out.println("\t\t\t\t---------------------------------");
       
                 System.out.print("\t\tGive Your Choice: ");
                 choice2 = s.nextInt();
				 System.out.println("\t\t\t\t---------------------------------");

                 switch (choice2) {
                             case 1:
                                  f.farmerInfo();
                                    break;

                             case 2:
                                  f.farmerlogin();
				                  System.out.println("\t\t\t\t*********************************");
				                  System.out.println("\t\t\t\tLog in Succesfully");
				                  System.out.println("\t\t\t\t*********************************");
				  
				  
				  
				  
				                  int choice4;
         
                                  System.out.println("\t\tWhich Product do you want to sell");
		 
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
                                  choice4 = s.nextInt();
								  System.out.println("\t\t\t\t---------------------------------");

                                 switch (choice4) {
                                 case 1:
			                     System.out.print("\t\tEnter Quantity: ");
			                     int i=s.nextInt();
				                 f.setQty(i);
                                 System.out.println("\t\t\t\tQuantity: "+f.getQty()+" kg Tomato");
				                 System.out.println("\t\t\t\tYour total price is :"+(f.getQty()*12)+" Taka");
								 frwd.writeInFile("\t\t\t\t\t******************");
								 frwd.writeInFile("\t\t\t\tQuantity: "+i+" kg Eggplant");
								 frwd.writeInFile("\t\t\t\tYour total price is :"+(i*12)+" Taka");
								 System.out.println("\t\t\t\t---------------------------------");
				  
                                 break;

                                 case 2:
								 
			                           System.out.print("\t\tEnter Quantity: ");
			                           int j=s.nextInt();
				                       f.setQty(j);
                                       System.out.println("\t\t\t\tQuantity: "+f.getQty()+" piece Banana");
				                       System.out.println("\t\t\t\tYour total price is :"+(f.getQty()*8)+" Taka");
									   frwd.writeInFile("\t\t\t\t\t******************");
								       frwd.writeInFile("\t\t\t\tQuantity: "+j+" Piece Banana");
								       frwd.writeInFile("\t\t\t\tYour total price is :"+(j*8)+" Taka");
									   System.out.println("\t\t\t\t---------------------------------");
                                       break;

                                 case 3:
								 
			                            System.out.print("\t\tEnter Quantity: ");
			                            int k=s.nextInt();
				                        f.setQty(k);
			                            System.out.println("\t\t\t\tYou want to sell "+f.getQty()+" kg Onion");
				                        System.out.println("\t\t\t\tQuantity: :"+(f.getQty()*100)+" Taka");
										frwd.writeInFile("\t\t\t\t\t******************");
								        frwd.writeInFile("\t\t\t\tQuantity: "+k+" kg Onion");
								        frwd.writeInFile("\t\t\t\tYour total price is :"+(k*100)+" Taka");
										System.out.println("\t\t\t\t---------------------------------");
				                        break;
			
			                     case 4:
			                           System.out.print("\t\tEnter Quantity: ");
			                           int l=s.nextInt();
				                       f.setQty(l);
			                           System.out.println("\t\t\t\tYou want to sell "+f.getQty()+" kg Eggplant");
				                       System.out.println("\t\t\t\tQuantity: :"+(f.getQty()*40)+" Taka");
									   frwd.writeInFile("\t\t\t\t\t******************");
								       frwd.writeInFile("\t\t\t\tQuantity: "+l+" kg Eggplant");
								       frwd.writeInFile("\t\t\t\tYour total price is :"+(l*40)+" Taka");
									   System.out.println("\t\t\t\t---------------------------------");
				                       break;
				  
			                     case 5:
			                           System.out.print("\t\t\t\tEnter Quantity: ");
			                           int m=s.nextInt();
				                       f.setQty(m);
			                           System.out.println("\t\t\t\tYou want to sell "+f.getQty()+" kg Fish");
				                       System.out.println("\t\t\t\tQuantity: :"+(f.getQty()*55)+" Taka");
									   frwd.writeInFile("\t\t\t\t\t******************");
								       frwd.writeInFile("\t\t\t\tQuantity: "+m+" kg Fish");
								       frwd.writeInFile("\t\t\t\tYour total price is :"+(m*55)+" Taka");
									   System.out.println("\t\t\t\t---------------------------------");
				                       break;
				  
			                     case 6:
			                           System.out.print("\t\t\t\tEnter Quantity: ");
			                           int n=s.nextInt();
				                       f.setQty(n);
			                           System.out.println("\t\t\t\tQuantity: "+f.getQty()+" kg Rice");
				                       System.out.println("\t\t\t\tYour total price is :"+(f.getQty()*82)+" Taka");
								       frwd.writeInFile("\t\t\t\t\t******************");
								       frwd.writeInFile("\t\tQuantity: "+n+" kg Rice");
								       frwd.writeInFile("\t\t\t\tYour total price is :"+(n*64)+" Taka");
									   System.out.println("\t\t\t\t---------------------------------");
				                       break;
			
			                     case 7:
			                           System.out.print("\t\tEnter Quantity: ");
			                           int o=s.nextInt();
				                       f.setQty(o);
			                           System.out.println("\t\t\t\tQuantity: "+f.getQty()+" kg Sugar");
				                       System.out.println("\t\t\t\tYour total price is :"+(f.getQty()*52)+" Taka");
									   frwd.writeInFile("\t\t\t\t\t******************");
								       frwd.writeInFile("\t\t\t\tQuantity: "+o+" kg Sugar");
								       frwd.writeInFile("\t\t\t\tYour total price is :"+(o*52)+" Taka");
									   System.out.println("\t\t\t\t---------------------------------");
				                       break;
				  
			                     case 8:
			                           System.out.print("\t\tEnter Quantity: ");
			                           int p=s.nextInt();
				                       f.setQty(p);
			                           System.out.println("\t\t\t\tQuantity: "+f.getQty()+" kg Pulses");
				                       System.out.println("\t\t\t\tYour total price is :"+(f.getQty()*64)+" Taka");
									   frwd.writeInFile("\t\t\t\t\t******************");
								       frwd.writeInFile("\t\t\t\tQuantity: "+p+" kg Pulses");
								       frwd.writeInFile("\t\t\t\tYour total price is :"+(p*64)+" Taka");
									   System.out.println("\t\t\t\t---------------------------------");
				                       break;
				  

                                default:
                                       System.out.println("\t\t\t\tInvalid option:\n\n");
                 
                                       break;
                                    }	
				  
				 
				  
				 int choice1;
				 System.out.print("\t\tEnter Your Bkash or DBBL no");
				 int a = s .nextInt();
				 frwd.writeInFile("\t\t\t\tBkash or DBBL Of the Farmer: 0"+a);
				 f.setBkashOrDBBL(a);
				 System.out.println("\t\t0"+f.getBashOrDBBl()+" Is this your Bkash or DBBL No:");
				 System.out.println("\t\t\t\t1. Yes");
				 System.out.println("\t\t\t\t2. No");
				 System.out.println("\t\t\t\t---------------------------------");
				 System.out.print("\t\tGive Your Choice: ");
				 choice1 = s .nextInt();
				 System.out.println("\t\t\t\t---------------------------------");
				 
				 switch (choice1) {
                            case 1:
							   frwd.writeInFile("Your Full money Have been Send In your 0"+a+"Number" );
                               System.out.println("\t\t\t\tYour Full money Have been Send In your "+f.getBashOrDBBl()+" account"); 
				               f.another();
                               break;

                            case 2:
                               f.payFarmer();
                               break;

             

                            default:
                                System.out.println("\t\t\t\tInvalid option:\n\n");
                
                              break;
                            }
				f.another();
                break;

             case 3:
			      f. showPrice();
				  f.farmerOption();
				 break;

            default:
                System.out.println("\t\t\t\tInvalid option:\n\n");
                f.another();
                break;
        }	
				  
				  
				  
                 break;

            case 2:
                  Customer c= new  Customer();
	              System.out.print("\t\tEnter your Name: ");
				  s.nextLine();
		          String name1=s.nextLine();
		          c.setCustomerName(name1);
		          System.out.print("\t\tEnter your Address: ");
		          String add1=s.nextLine();
		          c.setCustomerAddress(add1);
				  System.out.print("\t\tEnter your Mobile No: ");
		          int mno1=s.nextInt();
		          c.setMobileNo(mno1);
				  frwd.writeInFile("\t\t\t\t\t\tCustomer Information ");
				  frwd.writeInFile("\t\t\t\tName: "+name1 );
				  frwd.writeInFile("\t\t\t\tAddress: "+add1 );
				  frwd.writeInFile("\t\t\t\tMobile No 0: "+mno1 );
				  System.out.println("\n");
		          System.out.println("\t\t\t\tName: "+c.getCustomerName());
		          System.out.println("\t\t\t\tName and Address: "+c.getCustomerAddress());
		          System.out.println("\t\t\t\tMobile No: 0"+c.getMobileNo());
				  System.out.println("\t\t\t\t---------------------------------");
				  System.out.println("\n");
		           
				   
				   
				   
				   
				  int choice9;
         
		          System.out.println("");
                  System.out.println("\t\tPlease select an option");
                  System.out.println("");
                  System.out.println("\t\t\t\t1.First Time");
                  System.out.println("\t\t\t\t2.Not First Time");
                  System.out.println("\t\t\t\t3.see product price");
                  System.out.println("");
				  System.out.println("\t\t\t\t---------------------------------");
 
                  System.out.print("\t\tGive Your Choice: ");
                  choice9 = s.nextInt();
				  System.out.println("\t\t\t\t---------------------------------");

 

                  switch (choice9) {
                         case 1:
						          int choice10;
                                  System.out.println("\t\tWhich Product do you want to Buy");
		 
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
                                  choice10 = s.nextInt();

                                 switch (choice10) {
                                 case 1:
			                     System.out.print("\t\tEnter Quantity: ");
			                     int i=s.nextInt();
				                 c.setQty(i);
                                 System.out.println("\t\t\t\tQuantity: "+c.getQty()+" kg Tomato");
				                 System.out.println("\t\t\t\tYour total price is :"+(c.getQty()*12)+" Taka");
								 frwd.writeInFile("\t\t\t\t\t******************");
								 frwd.writeInFile("\t\t\t\tQuantity: "+i+" kg Eggplant");
								 frwd.writeInFile("\t\t\t\tYour total price is :"+(i*12)+" Taka");
								 System.out.println("\t\t\t\t---------------------------------");
				  
                                 break;

                                 case 2:
								 
			                           System.out.print("\t\tEnter Quantity: ");
			                           int j=s.nextInt();
				                       c.setQty(j);
                                       System.out.println("\t\t\t\tQuantity: "+c.getQty()+" piece Banana");
				                       System.out.println("\t\t\t\tYour total price is :"+(c.getQty()*8)+" Taka");
									   frwd.writeInFile("\t\t\t\t\t******************");
								       frwd.writeInFile("\t\t\t\tQuantity: "+j+" Piece Banana");
								       frwd.writeInFile("\t\t\t\tYour total price is :"+(j*8)+" Taka");
									   System.out.println("\t\t\t\t---------------------------------");
                                       break;

                                 case 3:
								 
			                            System.out.print("\t\tEnter Quantity: ");
			                            int k=s.nextInt();
				                        c.setQty(k);
			                            System.out.println("\t\t\t\tYou want to sell "+c.getQty()+" kg Onion");
				                        System.out.println("\t\t\t\tQuantity: :"+(c.getQty()*100)+" Taka");
										frwd.writeInFile("\t\t\t\t\t******************");
								        frwd.writeInFile("\t\t\t\tQuantity: "+k+" kg Onion");
								        frwd.writeInFile("\t\t\t\tYour total price is :"+(k*100)+" Taka");
										System.out.println("\t\t\t\t---------------------------------");
				                        break;
			
			                     case 4:
			                           System.out.print("\t\tEnter Quantity: ");
			                           int l=s.nextInt();
				                       c.setQty(l);
			                           System.out.println("\t\t\t\tYou want to sell "+c.getQty()+" kg Eggplant");
				                       System.out.println("\t\t\t\tQuantity: :"+(c.getQty()*40)+" Taka");
									   frwd.writeInFile("\t\t\t\t\t******************");
								       frwd.writeInFile("\t\t\t\tQuantity: "+l+" kg Eggplant");
								       frwd.writeInFile("\t\t\t\tYour total price is :"+(l*40)+" Taka");
									   System.out.println("\t\t\t\t---------------------------------");
				                       break;
				  
			                     case 5:
			                           System.out.print("\t\t\t\tEnter Quantity: ");
			                           int m=s.nextInt();
				                       c.setQty(m);
			                           System.out.println("\t\t\t\tYou want to sell "+c.getQty()+" kg Fish");
				                       System.out.println("\t\t\t\tQuantity: :"+(c.getQty()*55)+" Taka");
									   frwd.writeInFile("\t\t\t\t\t******************");
								       frwd.writeInFile("\t\t\t\tQuantity: "+m+" kg Fish");
								       frwd.writeInFile("\t\t\t\tYour total price is :"+(m*55)+" Taka");
									   System.out.println("\t\t\t\t---------------------------------");
				                       break;
				  
			                     case 6:
			                           System.out.print("\t\t\t\tEnter Quantity: ");
			                           int n=s.nextInt();
				                       c.setQty(n);
			                           System.out.println("\t\t\t\tQuantity: "+c.getQty()+" kg Rice");
				                       System.out.println("\t\t\t\tYour total price is :"+(c.getQty()*82)+" Taka");
								       frwd.writeInFile("\t\t\t\t\t******************");
								       frwd.writeInFile("\t\tQuantity: "+n+" kg Rice");
								       frwd.writeInFile("\t\t\t\tYour total price is :"+(n*64)+" Taka");
									   System.out.println("\t\t\t\t---------------------------------");
				                       break;
			
			                     case 7:
			                           System.out.print("\t\tEnter Quantity: ");
			                           int o=s.nextInt();
				                       c.setQty(o);
			                           System.out.println("\t\t\t\tQuantity: "+c.getQty()+" kg Sugar");
				                       System.out.println("\t\t\t\tYour total price is :"+(c.getQty()*52)+" Taka");
									   frwd.writeInFile("\t\t\t\t\t******************");
								       frwd.writeInFile("\t\t\t\tQuantity: "+o+" kg Sugar");
								       frwd.writeInFile("\t\t\t\tYour total price is :"+(o*52)+" Taka");
									   System.out.println("\t\t\t\t---------------------------------");
				                       break;
				  
			                     case 8:
			                           System.out.print("\t\tEnter Quantity: ");
			                           int p=s.nextInt();
				                       c.setQty(p);
			                           System.out.println("\t\t\t\tQuantity: "+c.getQty()+" kg Pulses");
				                       System.out.println("\t\t\t\tYour total price is :"+(c.getQty()*64)+" Taka");
									   frwd.writeInFile("\t\t\t\t\t******************");
								       frwd.writeInFile("\t\t\t\tQuantity: "+p+" kg Pulses");
								       frwd.writeInFile("\t\t\t\tYour total price is :"+(p*64)+" Taka");
									   System.out.println("\t\t\t\t---------------------------------");
				                       break;
				  

                                default:
                                       System.out.print("\t\t\t\tInvalid option:\n\n");
                 
                                       break;
                                    }	
                               c.payCustomer();
				               c.another();
                               break;


                         case 2:
			                   System.out.println("\t\t\t\tCongratulation. You have 5% discount");
                               c.productOption2();
				               c.payCustomer();
                               c.another();
                               break;

                         case 3:
                               c.showPrice();
                               c.customerOption();
				               c.another();
                               break;

                          default:
                               System.out.println("\t\t\t\tInvalid option:\n\n");
                               c.another();
                               break;
                            }    
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				  
                break;

             case 3:
			      	
	              Admin a= new Admin();
		           
	              System.out.print("\t\t\t\tEnter your Name: ");
				  s.nextLine();
		          String name2=s.nextLine();
		          a.setAdminName(name2);
		          System.out.print("\t\t\t\tEnter your Address: ");
		          String add2=s.nextLine();
		          a.setAdminAddress(add2);
				   
		          System.out.print("\t\t\t\tEnter your Mobile no: ");
		          int mno2=s.nextInt();
				  frwd.writeInFile("\t\t\t\t\t\tAdmin Information ");
				  frwd.writeInFile("\t\t\t\tName: "+name2 );
				  frwd.writeInFile("\t\t\t\tAddress: "+add2 );
				  frwd.writeInFile("\t\t\t\tMobile No : 0"+mno2 );
		          a.setMobileNo(mno2);
		          System.out.println("\t\t\t\tName: "+a.getAdminName());
		          System.out.println("\t\t\t\tName and Address: "+a.getAdminAddress());
		          System.out.println("\t\t\t\tMobile No: 0"+a.getMobileNo());
				  System.out.println("\t\t\t\t---------------------------------");
		          a.Adminlogin();
		          int choice5;
                   
		          System.out.println(" ");
                  System.out.println("\t\t\t\tPlease select an option");
		          System.out.println(" "); 
                  System.out.println("\t\t\t\t1.See Amount Of Each Product In Stock");
                  System.out.println("\t\t\t\t2.See Amount Of Each Product selling");
		          System.out.println("\t\t\t\t3.See Amount Of Each Product Buying");
		          System.out.println("\t\t\t\t4.Making change of the products");
				  System.out.println("\t\t\t\t---------------------------------");
       
                  System.out.print("\t\tGive Your Choice: ");
                  choice5 = s.nextInt();

                  switch (choice5) {
                           case 1:
                                 System.out.println("\t\tProduct no  Product Type  Product amount previous  Buying Amount  Selling  Amount  Date    Rest of the Amount in Stock"); 
				                 System.out.println("\t\t 1          Vegetable        41kg                   24kg            26kg          12/08/20 39kg");
				                 System.out.println("\t\t 2          Fish             42kg                   24kg            26kg          12/08/20 40kg");
				                 System.out.println("\t\t 3          Rice             104kg                  52kg            102kg         12/08/20 54kg");
				                 System.out.println("\t\t 4          pulses           104kg                  52kg            102kg         12/08/20 54kg");
				                 a.another();
                                 break;

                          case 2:
                                 System.out.println("\t\tProduct no  Product Type  Product amount previous    Selling  Amount  Date   Rest of the Amount in Stock"); 
				                 System.out.println("\t\t 1          Vegetable        41kg                    26kg          12/08/20  39kg");
				                 System.out.println("\t\t 2          Fish             42kg                    26kg          12/08/20  40kg");
				                 System.out.println("\t\t 3          Rice             104kg                   102kg         12/08/20  54kg");
				                 System.out.println("\t\t 4          pulses           104kg                   102kg         12/08/20  54kg");
				                 a.another();
				  
                                 break;

                          case 3:
			      
			                     System.out.println("\t\tProduct no  Product Type  Product amount previous  Buying Amount    Date     Rest of the Amount in Stock"); 
				                 System.out.println("\t\t 1          Vegetable        41kg                   24kg            12/08/20    39kg");
				                 System.out.println("\t\t 2          Fish             42kg                   24kg            12/08/20    40kg");
				                 System.out.println("\t\t 3          Rice             104kg                  52kg            12/08/20    54kg");
				                 System.out.println("\t\t 4          pulses           104kg                  52kg            12/08/20    54kg");
				                 a.another();
				                 break;
				 
				 
			              case 4:
						         int choice6;
           
                                 System.out.println("\t\tPlease select an option");
		 
                                 System.out.println("\t\t\t\t1.Change product price ");
                                 System.out.println("\t\t\t\t2.Add product");
								 System.out.println("\t\t\t\t---------------------------------");
								 System.out.print("\t\tGive Your Choice: ");
		
		                         choice6 = s.nextInt();
								 System.out.println("\t\t\t\t---------------------------------");
		                         switch (choice6)
		                         {
			                       case 1:
	                                     int choice7;
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
       

                                         choice7 = s.nextInt();
										 System.out.println("\t\t\t\t---------------------------------");

                                         switch (choice7)
				                            {
                                           case 1:
			                                   System.out.print("\t\tEnter Price: ");
			                                   double i=s.nextDouble();
							                   a.setPrice(i);
                                               System.out.println("\t\t\t\tprice to add: "+a.getPrice()+" per kg Tomato");
				                               System.out.println("\t\t\t\tNew price is :"+(a.getPrice()+12)+" Taka");
											   frwd.writeInFile("\t\t\t\t\t******************");
											   frwd.writeInFile("\t\t\t\tYou have Changed the price of Tomato");
											   frwd.writeInFile("\t\t\t\tYou have add "+i+" Taka");
											   frwd.writeInFile("\t\t\t\tNew Price is: "+(i+12));
				  
				   
				  
                                                break;

                                           case 2:
			                                    System.out.print("\t\tEnter  prize to add: ");
			                                    double j=s.nextDouble();
				                                a.setPrice(j);
                                                System.out.println("\t\t\t\tPrize: "+a.getPrice()+" per piece Banana");
				                                System.out.println("\t\t\t\tNew total price is :"+(a.getPrice()+8)+" Taka");
												frwd.writeInFile("\t\t\t\t\t******************");
												frwd.writeInFile("\t\t\t\tYou have Changed the price of Banana");
												frwd.writeInFile("\t\t\t\tYou have add "+j+" Taka");
												frwd.writeInFile("\t\t\t\tNew Price is: "+(j+8));
                                                break;

                                          case 3:
			                                    System.out.print("\t\tEnter  prize to add : ");
			                                    double k=s.nextDouble();
				                                a.setPrice(k);
			                                    System.out.println("\t\t\t\tYou want to add: "+a.getPrice()+"per kg Onion");
				                                System.out.println("\t\t\t\tNew price is: :"+(a.getPrice()+100)+" Taka");
												frwd.writeInFile("\t\t\t\t\t******************");
												frwd.writeInFile("\t\t\t\tYou have Changed the price of Onion");
												frwd.writeInFile("\t\t\t\tYou have add "+k+" Taka");
												frwd.writeInFile("\t\t\t\tNew Price is: "+(k+100));
				                                break;
			
			                              case 4:
			                                    System.out.print("\t\tEnter  prize to add : ");
			                                    double l=s.nextDouble();
				                                a.setPrice(l);
			                                    System.out.println("\t\t\t\tYou want to add: "+a.getPrice()+"per kg Eggplant");
				                                System.out.println("\t\t\t\tNew price is: :"+(a.getPrice()+40)+" Taka");
												frwd.writeInFile("\t\t\t\t\t******************");
												frwd.writeInFile("\t\t\t\tYou have Changed the price of Eggplant");
												frwd.writeInFile("\t\t\t\tYou have add "+l+" Taka");
												frwd.writeInFile("\t\t\t\tNew Price is: "+(l+40));
				                                break;
				  
			                              case 5:
			                                    System.out.print("\t\tEnter  prize to add : ");
			                                    double m=s.nextDouble();
				                                a.setPrice(m);
			                                    System.out.println("\t\t\t\tYou want to add: "+a.getPrice()+"per kg fish");
				                                System.out.println("\t\t\t\tNew price is: :"+(a.getPrice()+55)+" Taka");
												frwd.writeInFile("\t\t\t\t\t******************");
												frwd.writeInFile("\t\t\t\tYou have Changed the price of Fish");
												frwd.writeInFile("\t\t\t\tYou have add "+m+" Taka");
												frwd.writeInFile("\t\t\t\tNew Price is: "+(m+55));
				                                break;
				  
			                              case 6:
			                                    System.out.print("\t\tEnter  prize to add : ");
			                                    double n=s.nextDouble();
				                                a.setPrice(n);
			                                    System.out.println("\t\t\t\tYou want to add: "+a.getPrice()+"per kg  Rice");
				                                System.out.println("\t\t\t\tNew price is: :"+(a.getPrice()+82)+" Taka");
												frwd.writeInFile("\t\t\t\t\t******************");
												frwd.writeInFile("\t\t\t\tYou have Changed the price of Rice");
												frwd.writeInFile("\t\t\t\tYou have add "+n+" Taka");
												frwd.writeInFile("\t\t\t\tNew Price is: "+(n+82));
				                                break;
			
			                              case 7:
			                                    System.out.print("\t\tEnter  prize to add : ");
			                                    double o=s.nextDouble();
				                                a.setPrice(o);
			                                    System.out.println("\t\t\t\tYou want to add: "+a.getPrice()+"per kg  Sugar");
				                                System.out.println("\t\t\t\tNew price is: :"+(a.getPrice()+52)+" Taka");
												frwd.writeInFile("\t\t\t\t\t******************");
												frwd.writeInFile("\t\t\t\tYou have Changed the price of Sugar");
												frwd.writeInFile("\t\t\t\tYou have add "+o+" Taka");
												frwd.writeInFile("\t\t\t\tNew Price is: "+(o+52));
				                                break;
				  
			                              case 8:
			                                    System.out.print("\t\tEnter  prize to add : ");
			                                    double p=s.nextDouble();
				                                a.setPrice(p);
			                                    System.out.println("\t\t\t\tYou want to add: "+a.getPrice()+"per kg  pulses");
				                                System.out.println("\t\t\t\tNew price is: :"+(a.getPrice()+64)+" Taka");
												frwd.writeInFile("\t\t\t\t\t******************");
												frwd.writeInFile("\t\t\t\tYou have Changed the price of Pulses");
												frwd.writeInFile("\t\t\t\tYou have add "+p+" Taka");
												frwd.writeInFile("\t\t\t\tNew Price is: "+(p+64));
				                                break;
				  

                                        default:
                                                System.out.println("\t\t\t\tInvalid option:\n\n");
                 
                                                break;
                                            }
											break;
			
			                    case 2:
                                      String p;
	                                  int no;
	                              
	                                  System.out.print("\t\tEnter No of product you want to add: ");
	                                  no=s.nextInt();
	                                  a.setProductnum(no);
	                                  s.nextLine();
									   
	                                  for(int i=1;i<=a.getProductnum();i++)
	                                   {
		                                  System.out.print("\t\tEnter The Name of the "+i+" product : ");
		                                  p=s.nextLine();
		                                  a.setProductName(p);
		                                  System.out.println("\t\t\t\tNew added product for  "+i+": "+a.getProductName());
		                                  frwd.writeInFile("\t\t\t\tNew Added Product "+i+" is: "+p);
	                                    }
										 int q;
									      
										for(int i=1;i<=a.getProductnum();i++)
	                                   {
		                                  System.out.print("\t\tEnter The Price of the "+i+" product : ");
		                                  q=s.nextInt();
		                                  a.setPrice(q);
		                                  System.out.println("\t\t\t\tPrice for "+i+"product : "+a.getPrice()+" Taka");
										  frwd.writeInFile("\t\t\t\tNew Added "+i+" Product's Price is: "+q+" Taka");
		                                   
	                                    }
										for(int i=1;i<=a.getProductnum();i++)
	                                   {
		                                  System.out.print("\t\tEnter The Quantity of the "+i+" product : ");
		                                  q=s.nextInt();
		                                  a.setQty(q);
		                                  System.out.println("\t\t\t\tQuantity for "+i+" product : "+a.getQty()+" kg");
										  frwd.writeInFile("\t\t\t\tNew Added "+i+" Product's Quantity is: "+q+" kg");
		                                   
	                                    }
										
										
		                                   
	                                     
                                       break;	
                                 default:
                                        System.out.println("\t\t\t\tInvalid option:\n\n");
				                         break;
                 
		                                }                  				 
	                            a.another();
				                break;
				            

                         default:
                                 System.out.println("\t\t\t\tInvalid option:\n\n");
                                 break;
                                }	
				   
				   
				 
				         break;
						 
						 
						 
				 
			case 4:
			       
			      System.out.println("\t\t\t\t---------------------------------");
				  System.out.println("\t\t\t\tYou Choose Exit");
				  System.out.println("\t\t\t\t---------------------------------");
				  repeat = false;
				  break;

            default:
                System.out.println("\t\t\t\tInvalid option:\n\n");
                System.out.println("\t\t\t\t---------------------------------"); 
                break;
        }
	}
		
	 
	
	 
	
     
       
}
     
    	 
	
	
}
