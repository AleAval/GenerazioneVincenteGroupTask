import com.company.costant.Area;
//AVALLONE ALESSANDRO
public class Stagista implements User{
	
	private final String nome;
	private final String cognome;
	private final String mail; 
	private Area area;
	private Task task;
	
	public Stagista(String nome, String cognome, String mail) {
        this.nome = nome;
        this.cognome = cognome;
        this.mail = mail;
    }

	public Stagista(String nome, String cognome, String mail, Area area, Task task) {
		this.nome = nome;
		this.cognome = cognome;
		this.mail = mail;
		this.area = area;
		this.task = task;
	}




	public final void setArea(final Area area) {
        this.area = area;
    }

    public final void setTask(final Task task) {
        this.task = task;
    }
    
    

    public String getNome() {
        return this.nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public String getMail() {
        return this.mail;
    }

    public Area appartiene() {
        return this.area;
    }

    public Task taskSvolta() {
        return this.task;
    }

    public boolean allocatoSuTask() {
        return false;
    }
}
