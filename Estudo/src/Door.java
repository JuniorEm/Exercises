
public class Door {
	boolean opened;
	String color;
	double dimensionX;
	double dimensionY;
	double dimensionZ;
	static int cont;
	static int contX;

	//Constructors
	public Door(){
		Door.contX++;
	}
	
	//Get & Set
	
	//Methods
	
	public void open(){
		this.opened = true;
		Door.cont++;
	}
	
	public void close(){
		this.opened = false;
	}
	
	public void paint(String color){
		this.color = color;
	}
	
	public boolean isItOpened(){
		if (this.opened==true){
			System.out.println("It's opened!");
			return true;
		} else {
			System.out.println("It's closed!");
			return false;
		}
	}
	
	public String show(){
		String info = "\nDimensão X: "+this.dimensionX+
					"\nDimensão Y: "+this.dimensionY+
					"\nDimensao Z: "+this.dimensionZ+
					"\nCor: "+this.color;
		return info;
	}

}
