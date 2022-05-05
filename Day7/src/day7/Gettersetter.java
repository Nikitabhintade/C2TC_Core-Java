package day7;
class car
{
	private int id;
	private String model;
	
	public void setid(int i)
	{
		id = i;
	}
	public int getid() 
	{
		return id;
	}
	public void setmodel(String m)
	{
		model = m;
	}
	public String getmodel()
	{
		return model;
	}
}


public class Gettersetter {
	public static void main(String[] args) {
		car Honda= new car();
		Honda.setid(28);
		System.out.println(Honda.getid());
		Honda.setmodel("abc324bb");
		System.out.println(Honda.getmodel());

}
}
