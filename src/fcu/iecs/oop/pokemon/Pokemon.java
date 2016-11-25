package fcu.iecs.oop.pokemon;

public class Pokemon {
	private String name=new String();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	private int cp;
	
	Pokemon(String name,int cp)
	{
		this.name = name;
		this.cp = cp;
	}
}
