package comunicacion;
import java.util.ArrayList;
public class Alfabeto extends Pictograma{
	static String[] letras = new String[30];
	public String interpretacion;
	
	public Alfabeto(String origen, String[] letras , String interpretacion){
		super(origen);
		for(int i=0; i<letras.length;i++) {
			Alfabeto.letras[i] = letras[i];
		}
		this.interpretacion=interpretacion;
	}
	
	public int cantidadLetras() {	
		return Alfabeto.letras.length; 
	}
	public String interpretacion() {
		return this.interpretacion;

		
	}
	public  String toString() {
		String cadena = "";
		for(int i =0; i<Alfabeto.letras.length;i++) {
			if(Alfabeto.letras[i++] == null) {
				cadena = cadena + Alfabeto.letras[i] ;
				
			}else {
				cadena = cadena + Alfabeto.letras[i]+ ", ";
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
