
public class Director {
	private String first_n;
	private String last_n;

	public Director() {}
	
	public Director(String first_n,String last_n)
	{
		this.first_n=first_n;
		this.last_n=last_n;
	}
	public String getFirst_n() {
		return first_n;
	}
	public void setFirst_n(String first_n) {
		this.first_n=first_n;
	}
	public String getLast_n() {
		return last_n;
	}
	public void setLast_n(String last_n) {
		this.last_n=last_n;
	}
	public String toString() {
		return getFirst_n()+","+getLast_n();
	}

}
