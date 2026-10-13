package RelationBetnObjectsHAS_A;

public class Engine {
	private int piston;
	private int hp;
	
	public Engine() {
		
	}
	

	
	public Engine(int piston, int hp) {
		this.piston = piston;
		this.hp = hp;
	}
	
	public int getPiston() {
		return piston;
	}
	public void setPiston(int piston) {
		this.piston = piston;
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	

}
