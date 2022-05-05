class Cart
{
	public static void main(String args[])
	{
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		List<Items> c = new ArrayList<Items>();
		System.out.println("**************WELCOME*******************");
		Iterator<Items> itr;
		int sno = 1;
		int choice;
		do
		{
		 System.out.println("*********************************");
		 System.out.println("\t1.Add Item");
		 System.out.println("\t2.Display Item list");
		 System.out.println("\t3.Search item by name");
		 System.out.println("\t4.Delete the item");
		 System.out.println("\t5.Update the quantity of item");
		 System.out.println("\t6.Exit");
		 System.out.print("Enter the choice from Above: ");
		 choice = input1.nextInt();
		 
		 switch (choice)
		 {
			case 1:	//create
				System.out.print("Enter Item name: ");
				String iname = input2.nextLine();
				System.out.print("Enter quantity in numbers : ");
				int iquantity = input1.nextInt();
				
				c.add(new Items(sno,iname,iquantity));	
				sno++;
			break;

			case 2:	//Display
				System.out.println("*******************************");
				System.out.println("sno   Item-Name  Quantity");
				System.out.println("---------------------------");
				itr = c.iterator();
				while(itr.hasNext())
				{
					Items i = itr.next();
					System.out.println(i);
				}
				System.out.println("*******************************");			
			break;

			case 3:	//search
				boolean found = false;
				System.out.print("Enter the Item name: ");
				String itname = input2.nextLine();
				System.out.println("*******************************");
				itr = c.iterator();
				while(itr.hasNext())
				{
					Items i = itr.next();
					if(i.getiname().equals(itname))
					{
					System.out.println(i);
					found =true;
					}
				}

				if(!found)
				{
					System.out.println("Record not found");
				}
				
				System.out.println("*******************************");	
			break;

			case 4:	//delete
				found = false;
				System.out.print("Enter the Item to delete ");
				itname = input2.nextLine();
				System.out.println("*******************************");
				itr = c.iterator();
				while(itr.hasNext())
				{
					Items i = itr.next();
					if(i.getiname().equals(itname))
					{
					itr.remove();
					System.out.println("Item is Deleted successfully");
					found =true;
					}
				}

				if(!found)
				{
					System.out.println("Item not found");
				}
				
				System.out.println("*******************************");	
				
			break;

			case 5:	//update
				found = false;
				System.out.print("Enter the Item name to update ");
				itname = input2.nextLine();
				System.out.println("*******************************");
				ListIterator<Items> li = c.listIterator();
				while(li.hasNext())
				{
					Items i = li.next();
					if(i.getiname().equals(itname))
					{
					int sl = i.getsno();
					//System.out.print("Enter the new name of Employee ");
					//ename = input2.nextLine();
					System.out.print("Enter the new Quantity of item ");
					iquantity = input1.nextInt();
					li.set(new Items(sl,itname,iquantity));
					System.out.println("Item is Updated successfully");
					found =true;
					}
				}

				if(!found)
				{
					System.out.println("Item not found");
				}
				
				System.out.println("*******************************");	
				
			break;


			case 6:
				System.out.println("\tThank you for using our service");
				System.exit(0);
			break;

		 }	
		}while(choice != 6);
	}
}