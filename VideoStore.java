//STORE CLASS//

import java.util.Scanner;
public class VideoStore extends Video
{
    Video store[]=new Video[10];
    public String name;
    static int i=0;
    Scanner input = new Scanner(System.in);

	public void addVideo()
	{
        System.out.print("\nEnter Title to add: ");
        name = input.nextLine();
        boolean flag=true;
        for(int k=0;k<i;k++)
        {
            if(store[k].videoName.equalsIgnoreCase(name) && store[k].checkout)
            {
                flag = false;
            }
        }    

        if(flag==true)
        {
            store[i]=new Video(name);
		    System.out.println("\nVideo "+'"'+store[i].getName()+'"'+" added successfully...");
            i++;
        }

        else
        {
            System.out.println("\nVideo is already available...");
        }
		
        
	}
	public void doCheckout()
	{
        if(i==0)
        {
            System.out.println("\nNo Videos Available...");
        }

        else
        {
            int k=0;
            boolean flag=true;
            System.out.print("Enter Video to checkout: ");
            name = input.nextLine();
            while(k<i)
            {
                if(store[k].videoName.equalsIgnoreCase(name) && store[k].checkout==true)
                {
                    store[k].doCheckout();
                    System.out.println("\nVideo is rented...");
                    flag=false;
                    break;
                }
                else if(store[k].videoName.equalsIgnoreCase(name) && store[k].checkout==false)
                {
                    System.out.println("\nSorry Video not available...");
                    flag=false;
                    break;
                }
                k++;
            }
            if(flag==true)
            {
                System.out.println("\nSorry the video does not exist in store...");
            }
        }    
	}
	public void doReturn()
	{
        if(i==0)
        {
            System.out.println("\nYou have no video to return...");
        }
        else
        {
            System.out.print("Enter Video to return: ");
            name = input.nextLine();
            int k=0;
            boolean flag=true;

            while(k<i)
            {
                if(store[k].videoName.equalsIgnoreCase(name) && store[k].checkout==false)
                {
                    store[k].doReturn();
                    flag=false;
                    break;
                }
                k++;
            }
            if(flag==true)
            {
                System.out.println("\nThis video doesn't belong to the Store...");
            }
        }
	}
    
	public void receiveRating() 
    {
		if(i==0)
        {
            System.out.println("\nNo Videos Available...");
        }
        else
        {
            int k=0;
            boolean flag=true;

            System.out.print("Enter Video to rate: ");
            name = input.nextLine();

            while(k<i)
            {
                if(store[k].videoName.equalsIgnoreCase(name))
                {
                    System.out.println("\nEnter rating for video: ");
                    double rating = input.nextFloat();
                    store[k].receiveRating(rating);
                    System.out.println("\nRating "+'"'+store[k].getRating()+'"'+" has been mapped to the Video ''"+store[k].getName()+'"');
                    System.out.println("\n\nThank you for your feedback.");
                    flag=false;
                    break;
                }
                k++;
            }
            if(flag==true)
            {
                System.out.println("\nSorry, the video does not exist in store...");
            }
        }
	}
	public void listInventory() 
    {
        if(i==0)
        {
            System.out.println("\nNo Videos Available...");
        }
        else
        {
            System.out.println("\n------------------------------------------------------------------------------");
            System.out.println("Video Name \t\t\t|\t Availability \t|\t Rating\n");
            for(int k = 0; k<i; k++)
            {
                System.out.println(store[k].getName()+"\t\t\t|\t   " +store[k].getCheckout()+ "\t\t|\t   "+ store[k].getRating());
            }
            System.out.println("--------------------------------------------------------------------------------");
        }
	}

    public void removeVideo()
	{
        if(i==0)
        {
            System.out.println("\nNo Videos Available...");
        }

        else
        {
            int k=0;
            boolean flag=true;
            System.out.print("Enter Title to delete: ");
            name = input.nextLine();
            while(k<i)
            {
                if(store[k].videoName.equalsIgnoreCase(name) && store[k].checkout==true)
                {
                    for(int j=k;j<i;j++)
                    {
                        store[j]=store[j+1];
                    }
                    i--;
                    System.out.println("\nVideo removed...");
                    flag=false;
                    break;
                }
                else if(store[k].videoName.equalsIgnoreCase(name) && store[k].checkout==false)
                {
                    System.out.println("\nVideo isn't in Store, Wait for return...");
                    flag=false;
                    break;
                }
                k++;
            }
            if(flag==true)
            {
                System.out.println("\nVideo doesn't exist...");
            }
            
               
        }     
	}
}
