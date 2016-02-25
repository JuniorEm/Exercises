
public class Home {
	String color;
	int doorTotals;
	Door doors[] = new Door[9];
	
	//Constructors
	
	//Get & Set
	
	//Methods
	public void paint (String color){
		this.color = color;
	}
	
	public int howManyDoorsAreOpened(){
		return Door.cont;
	}
	
	public void addDoor(Door d){
		for (int i = 0; i<doors.length; i++){
			if (this.doors[i]==null){
				this.doors[i] = d;
				break;
			}
		}
	}
	
	public void showDoorInfo(){
		for (Door i: doors){
			if (i!=null){
				System.out.println(i.show());
			}
		}
	}
	
	public int totalDoors(){
		this.doorTotals = Door.contX;
		return doorTotals;
	}

}
