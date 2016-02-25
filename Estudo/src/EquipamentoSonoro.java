
public class EquipamentoSonoro extends Equipamento {
	private short volume;
	private boolean stereo;
	
	//Constructors
	public EquipamentoSonoro(){
		super();
	}
	
	//Get & Set
	public void setVolume(short volumeAtual){
		if (volumeAtual<=10 && volumeAtual>=0){
			this.volume = volumeAtual;
		} else {
			System.out.println("Volume inv�lido!");
		}
	}
	
	public short getVolume(){
		return this.volume;
	}
	
	//Methods
	public boolean stereo(){
		return this.stereo=true;
	}
	
	public boolean mono(){
		return this.stereo=false;
	}
	
	public boolean liga(){ //M�todo Sobreescrito
		this.volume = 5;
		return this.ligado=true;
	}
	
	public String toString(){ //M�todo Sobreescrito
		String info = "\nVolume: "+this.getVolume()+
					"\nStereo: "+this.mono();
		return info;
	}
	

}
