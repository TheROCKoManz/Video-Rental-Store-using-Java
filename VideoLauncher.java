//DRIVER CODE//

import java.util.Scanner;
public class VideoLauncher 
{
    public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int choice;
		VideoStore videoStore=new VideoStore();

		do{
			System.out.print("\033[H\033[2J");
        	System.out.flush();
			System.out.println("\n\n\nLOGIN MENU \n=========");
			System.out.println("\n1. Login as Admin.");
			System.out.println("2. Login as User.");
			System.out.println("0. Exit.");
			System.out.print("\nEnter your choice: ");
			choice=input.nextInt();
			switch (choice) 
			{

				case 1:
					System.out.print("\033[H\033[2J");
					System.out.flush();
					do {
						
						System.out.println("\n\nADMIN MENU \n=========");
						System.out.println("\n1. Add Video.");
						System.out.println("2. List Inventory.");
						System.out.println("3. Remove Video.");
						System.out.println("4. Logout.");
						System.out.println("0. Exit.");
						System.out.print("\nEnter your choice: ");
						
						choice=input.nextInt();
						switch (choice) 
						{
							case 1:
								videoStore.addVideo();
								break;
							case 2:
								videoStore.listInventory();
								break;
							case 3:
								videoStore.removeVideo();
								break;	
							case 4: break;
							case 0:
								System.err.println("\nEnter ... !! Thanks for using the application");
								input.next();
								input.close();
								System.exit(1);
								break;
						}
							
					}while(!(choice==4));
					break;
			
				case 2:
					System.out.print("\033[H\033[2J");
					System.out.flush();
					do {
						
						System.out.println("\n\nUSER MENU \n=========");
						System.out.println("\n1. Check Out Video.");
						System.out.println("2. Return Video.");
						System.out.println("3. Receive Rating.");
						System.out.println("4. Logout.");
						System.out.println("0. Exit.");
						System.out.print("\nEnter your choice: ");
						
						choice=input.nextInt();
						switch (choice) 
						{
							case 1:
									videoStore.doCheckout();
									break;
							case 2:
								videoStore.doReturn();
								break;
							case 3:
								videoStore.receiveRating();
								break;
							case 4: break;
							case 0:
								System.err.println("\nEnter ... !! Thanks for using the application");
								input.next();
								input.close();
								System.exit(1);
								break;
						}
					}while(!(choice==4));
					break;

				case 0:
				System.err.println("\nThanks for using the application\n\nEnter any key... !! \n\n");
				input.next();
				System.out.print("\033[H\033[2J");
        		System.out.flush();
				input.close();
				System.exit(1);
				break;	
			}
		}while(!(choice==0));			
	}
}
