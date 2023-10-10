package comunicacion;

public class Fabula extends Escrito{
	String[] values = new String[5];
	Fabula(String origen, String titulo, String autor,int paginas, String enseñanza, String interpretacion){
		

		super(origen,titulo,autor,paginas);
		this.enseñanza=enseñanza;
		this.interpretacion = interpretacion;
		values[0] = this.enseñanza;
		values[1] = this.getTitulo();
		values[2] = this.getAutor();
		values[3] = Integer.toString(this.getPaginas());
	}

	String enseñanza, interpretacion;
	
	
	
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
	 public String getEnseñanza() {
	        return enseñanza;
	    }

	    // Setter para el atributo 'enseñanza'
	    public void setEnseñanza(String enseñanza) {
	        this.enseñanza = enseñanza;
	    }

	    // Getter para el atributo 'interpretacion'
	    public String getInterpretacion() {
	        return interpretacion;
	    }

	    // Setter para el atributo 'interpretacion'
	    public void setInterpretacion(String interpretacion) {
	        this.interpretacion = interpretacion;
	    }
}
