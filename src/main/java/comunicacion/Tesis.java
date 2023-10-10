package comunicacion;

import java.util.ArrayList;
public class Tesis extends Escrito{
	public String idea,conclusion,referencias,interpretacion;
	public String[] values = new String[6];
	public static String[] argumentos = new String[100];

	
	public Tesis( String titulo, String autor,int paginas,String idea,String[] argumentos, String conclusion, String referencias,String interpretacion) {
	
		super(origen,titulo,autor,paginas);
		this.idea = idea;
		this.conclusion=conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
		for(int i =0; i<argumentos.length;i++) {
			Tesis.argumentos[i]=argumentos[i] ;
		}
		values[0] = this.idea;
		values[1] = this.conclusion;
		values[2] = this.referencias;
		values[3] = this.getTitulo();
		values[4] = this.getAutor();
		values[5] = Integer.toString(this.getPaginas());
		
	
		
	}
	
	public int getArgumentos() {
		int contador=0;
		for(int j=0; j<100;j++) {
			if(Tesis.argumentos[j] !=null) {
				contador++;
			}
		}
		return contador;
		
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
		String cadena ="";
		for(int j=0; j<6;j++) {
			cadena = cadena + values[j] + "\n"; 
		}
		return cadena;
	}

}
