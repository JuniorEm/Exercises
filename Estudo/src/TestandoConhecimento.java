
public class TestandoConhecimento {
	public static void main(String[] args){
		Home h = new Home();
		h.color = "Red";
		
		Door d1 = new Door();
		d1.color = "Blue";
		d1.dimensionX = 50.0;
		d1.dimensionY = 65.0;
		d1.dimensionZ = 80.0;
		h.addDoor(d1);
		d1.open();
		
		Door d2 = new Door();
		d2.color = "Yellow";
		d2.dimensionX = 60.0;
		d2.dimensionY = 65.0;
		d2.dimensionZ = 70.0;
		h.addDoor(d2);
	    d2.open();
	    
		Door d3 = new Door();
		d3.color = "Purple";
		d3.dimensionX = 60.0;
		d3.dimensionY = 65.0;
		d3.dimensionZ = 80.0;
		h.addDoor(d3);
		
		for (int i = 0; i<5; i++){
			Door p = new Door();
			p.color = "Gray";
			p.dimensionX = i*10;
			p.dimensionY = i*15;
			p.dimensionZ = i*10;
			p.open();
			h.addDoor(p);
		}

		h.showDoorInfo();
		System.out.println("\n"+h.howManyDoorsAreOpened()+" door(s) are opened");
		System.out.println("\nTotal: "+h.totalDoors()+" door(s)");
	}
}
