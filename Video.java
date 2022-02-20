//VIDEO CLASS//

public class Video {

	public String videoName;
	public double rating;
    public boolean checkout=true;
	
    public Video() 
    {
	}
	
	public Video(String name)
	{
		videoName=name;
	}
	
    public String getName()
	{
		return videoName;
	}
	
    public void doCheckout()
	{
		System.out.println("\nVideo "+'"'+ getName()+'"' +" checked out successfully.");	
		checkout = false;	
	}
	
    public void doReturn()
	{
		checkout=true;
		System.out.println("\nVideo "+'"'+ getName()+'"' +" returned successfully.");	
	}
	
    public void receiveRating(double rating)
	{
		this.rating=rating;
	}
	
    public double getRating()
	{
		return rating;
	}
	
    public boolean getCheckout()
	{
		return checkout;
	}
}
