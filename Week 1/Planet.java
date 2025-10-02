class Planet
{	
	public double radius;
	public String name;
	public static final long g = 10;
	public void display()
	{
		System.out.println("Radius "+ radius);
		System.out.println("Name " + name);
		System.out.println("Long "+ g);	
    }
	public void initialize(double r, String name)
	{
		radius = r;	//usage
		this.name = name;	//usage	
	}
	public static void main(String [] args)	

	{
		Planet p = new Planet(); // creation
		p. initialize(10,"Dunya");		//usage
		p.display();		//usage
		Planet p2 = new Planet();
        p2.initialize(15, "Mars");

        	p2.display();	
	}
}
