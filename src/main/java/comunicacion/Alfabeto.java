package comunicacion;
public class Alfabeto extends Pictograma{
	static String[] letras = new String[30];
	public String interpretacion;
	
	public Alfabeto(String origen, String[] letras , String interpretacion){
		super(origen);
		this.letras = letras;
		
		this.interpretacion=interpretacion;
	}
	
	public int cantidadLetras() {	
		return Alfabeto.letras.length; 
	}
	public String interpretacion() {
		return this.interpretacion;

		
	}
	 public String toString() {
		 String cadena= "";
	        for(int i=0; i<Alfabeto.letras.length;i++) {
	        	if(i!=Alfabeto.letras.length-1) {
	        	cadena = cadena + Alfabeto.letras[i]+ ", " ;

	        		
	        	}
	        	else {
	        		cadena = cadena + Alfabeto.letras[i];
	        	}
	        }
	        return cadena;
	        }
	    
			
		
	

	    
	    public String getInterpretacion() {
	        return interpretacion;
	    }

	    public void setInterpretacion(String interpretacion) {
	        this.interpretacion = interpretacion;
	    }

}
