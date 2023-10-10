package comunicacion;
import java.util.ArrayList;
public class Alfabeto extends Pictograma{
	static String[] letras = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	public String interpretacion;
	
	public Alfabeto(String interpretacion){
		super("");
		
		this.interpretacion=interpretacion;
	}
	
	public int cantidadLetras() {	
		return Alfabeto.letras.length; 
	}
	public String interpretacion() {
		return this.interpretacion;

		
	}
	public  String toString() {
		return "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z";
				
	}
	

	    
	    public String getInterpretacion() {
	        return interpretacion;
	    }

	    public void setInterpretacion(String interpretacion) {
	        this.interpretacion = interpretacion;
	    }

}
