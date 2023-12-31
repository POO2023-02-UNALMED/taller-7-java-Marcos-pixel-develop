package comunicacion;

import java.util.ArrayList;
public class Tesis extends Escrito{
	public String idea,conclusion,referencias,interpretacion;
	public String[] values = new String[8];
	public static String[] argumentos = new String[100];

	
	public Tesis( String origen, String titulo, String autor,int paginas,String idea,String[] argumentos, String conclusion, String referencias,String interpretacion) {
	
		super(origen,titulo,autor,paginas);
		this.idea = idea;
		this.referencias = referencias;
		this.conclusion= conclusion;
		this.interpretacion = interpretacion;
		Tesis.argumentos = argumentos;
		values[0] = origen;
		values[1] = titulo;
		values[2] = autor;
		values[3] = Integer.toString(paginas);
		values[4] = idea;
		values[5] = argumentos.toString();
		values[6] = conclusion;
		values[7] = referencias;
		
		
	
		
	}
	
	public String[] getArgumentos() {
		
		return argumentos;
		
	}
	public String getIdea() {
		return idea;
		
	}
	public String getConclusion() {
		return conclusion;
		
	}
	
	 public String getReferencias() {
	        return referencias;
	    }
	    
	    public String getInterpretacion() {
	        return interpretacion;
	    }
	   
	    public void setReferencias(String referencias) {
	        this.referencias = referencias;
	    }

	  
	    public void setInterpretacion(String interpretacion) {
	        this.interpretacion = interpretacion;
	    }
	    public void setConclusion(String conclusion) {
	        this.conclusion = conclusion;
	    }

	    public void setIdea(String idea) {
	        this.idea = idea;
	    }


	
	
	public int palabrasTotales(int value) {
		int valor = this.getPaginas()*value*5;
		return valor;
	}
	public String interpretacion() {
		return this.interpretacion;
	}
	public String toString() {
		return (this.getOrigen()+ "\n" + this.getTitulo() + "\n"+ this.getAutor() + "\n"+ this.getPaginas()+
				"\n"+this.getIdea()+ "\n" + this.getArgumentos().length+ "\n" + this.getConclusion()+"\n"+  this.getReferencias());
		
	}

}
