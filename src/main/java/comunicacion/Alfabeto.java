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
	        for(String i: Alfabeto.letras) {
	        	if(i!=null) {
	        		System.out.print(i);
	        	}
	        	
	        }
	        return "";
	    }
			
		
	

	    
	    public String getInterpretacion() {
	        return interpretacion;
	    }

	    public void setInterpretacion(String interpretacion) {
	        this.interpretacion = interpretacion;
	    }

}
