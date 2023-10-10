package comunicacion;

public class Fabula extends Escrito{
	public String[] values = new String[5];
	public Fabula(String origen, String titulo, String autor,int paginas, String ensenanza, String interpretacion){
		

		super(origen,titulo,autor,paginas);
		this.ensenanza=ensenanza;
		this.interpretacion = interpretacion;
		values[0] = this.ensenanza;
		values[1] = this.getTitulo();
		values[2] = this.getAutor();
		values[3] = Integer.toString(this.getPaginas());
	}

	public String ensenanza, interpretacion;
	
	
	
	public int palabrasTotales(int value) {
		int valor = this.getPaginas()*value*1;
		return valor;
	}
	public String interpretacion() {
		return this.interpretacion;

	}
	public String toString() {
		String cadena ="";
		for(int j=0; j<5;j++) {
			cadena = cadena + values[j] + "\n"; 
		}
		return cadena;	}
	 public String getEnsenanza() {
	        return ensenanza;
	    }

	    public void setEnsenanza(String ensenanza) {
	        this.ensenanza = ensenanza;
	    }

	    public String getInterpretacion() {
	        return interpretacion;
	    }

	    public void setInterpretacion(String interpretacion) {
	        this.interpretacion = interpretacion;
	    }
}
