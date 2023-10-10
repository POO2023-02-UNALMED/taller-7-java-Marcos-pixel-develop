package comunicacion;

public class Libro extends Escrito{
	String co_autor,editorial,edicion,interpretacion;
	String[] values = new String[6];
	Libro(String origen, String titulo, String autor,int paginas,String co_autor,String editorial,String edicion,String interpretacion){
		super(origen,titulo,autor,paginas);
		this.co_autor=co_autor;
		this.editorial = editorial;
		this.edicion=edicion;
		this.interpretacion=interpretacion;
		values[0] = this.co_autor;
		values[1]= this.editorial;
		values[2] = this.edicion;
		values[3]= this.getTitulo();
		values[4] = this.getAutor();
		int valor = this.getPaginas(); 
		values[5] = Integer.toString(valor);
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
	int palabrasTotales(int value) {
		int valor = this.getPaginas()*value*2;
		return valor;
	}
	
	public String getCo_autor() {
        return co_autor;
    }

    // Setter para el atributo 'co_autor'
    public void setCo_autor(String co_autor) {
        this.co_autor = co_autor;
    }

    // Getter para el atributo 'editorial'
    public String getEditorial() {
        return editorial;
    }

    // Setter para el atributo 'editorial'
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    // Getter para el atributo 'edicion'
    public String getEdicion() {
        return edicion;
    }

    // Setter para el atributo 'edicion'
    public void setEdicion(String edicion) {
        this.edicion = edicion;
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
