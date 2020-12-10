import java.util.Arrays;
public class livre {
	private String title;
	private String summary;
	private int year;
	private long[] actors;
	private Director director;
	
	public livre() {}
	
	public livre(String title,String summary,int year)
	{
		this.title=title;
		this.summary=summary;
		this.year=year;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary=summary;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director=director;
	}
	public long[] getActors() {
	return actors;
	}
	public void setActors(long[] actors) {
		this.actors=actors;
	}
	public String toString() {
		StringBuilder sb=  new StringBuilder();
		sb.append(" ***** Livre details ***** \n");
		sb.append("Title="+getTitle()+"\n");
		sb.append("Summary="+getSummary()+"\n");
		sb.append("Year="+getYear()+"\n");
		sb.append("Director="+getDirector());
		sb.append("Actors="+Arrays.toString(getActors())+"\n");
		sb.append("\n************************");
		return sb.toString();
	}
public static void main(String[] args) {
	livre liv1= new livre("The Social network","On a fall night in 2003, Harvard undergrad and \r\n"
			+ "            programming genius Mark Zuckerberg sits down at this \r\n"
			+ "            computer and heatedly begins working on a new idea.",2010);
	System.out.println(liv1.toString());
}

}
	
