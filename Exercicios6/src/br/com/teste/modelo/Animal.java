package br.com.teste.modelo;

public abstract class Animal {
	protected String name;
	protected boolean hunger;
	protected String location;
	
	//Constructors
	public Animal() {}
	
	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isHunger() {
		return hunger;
	}

	public void setHunger(boolean hunger) {
		this.hunger = hunger;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	//Methods
	public String makeNoise() {
		//System.out.println("Making noise!");
		return "\tMaking noise!";
	}
	
	public String eat() {
		if (hunger == true) {
			hunger = false;
			return "\tEating. . .";
		}
			return "\tNot Hungry";
		
	}
	
	public String sleep() {
		return "\tzZzZzZzZz. . .";
	}
	
	public String roam() {
		return "\tRoaming. . .";
	}
	
	public String toString() {
		return "" + makeNoise() +
				"" + eat() +
				"" + sleep() +
				"" + roam();
	}
	
	
	

}
