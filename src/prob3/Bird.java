package prob3;

public abstract class Bird {
	protected String name;
	public abstract void fly();
	public abstract void sing();
	public abstract String toString();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
