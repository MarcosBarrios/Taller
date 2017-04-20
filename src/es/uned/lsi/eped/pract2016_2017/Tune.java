package es.uned.lsi.eped.pract2016_2017;

public class Tune implements TuneIF {

	private String titulo;
	private String autor;
	private String genero;
	private String album;
	private int anno;
	private int duracion;
	
	/*
	 * Constructor de la clase que implementa TuneIF
	 * @param -una cadena de caracteres con el t�tulo de la canci�n
	 * 		  -una cadena de caracteres con el autor de la canci�n
	 * 		  -una cadena de caracteres con el g�nero de la canci�n
	 * 		  -una cadena de caracteres con el �lbum al que pertenece
	 * 		  -un entero con el a�o de publicaci�n de la canci�n
	 * 		  -un entero con la duraci�n en segundos de la canci�n
	 * @pre   -t != "" && a != "" && g != "" && al = "" && y > 0 && d > 0*/
	public Tune (String t, String a, String g, String al, int y, int d) {
		this.titulo = minString(t);
		this.autor = minString(a);
		this.genero = minString(g);
		this.album = minString(al);
		this.anno = minValue(y);
		this.duracion = minValue(d);
	}
	
	/**
	 * Asigna una cadena de caracteres no vac�a a otra cadena de caracteres
	 * @param in La cadena a tratar
	 * @return in La cadena del par�metro si es v�lido. Devuelve null si el par�metro no es v�lido.
	 */
	private String minString(String in){
		if(in.length()>0){
			return in;
		}else{
			System.err.println("El tama�o del nombre/album/genero/autor de la canci�n no es v�lido.");
			return null;
		}
	}
	
	/**
	 * Asigna un entero no negativo si este es v�lido.
	 * @param in El entero a tratar
	 * @param in El entero del par�metro si es v�lido. Devuelve 0 si no es v�lido.
	 */
	private int minValue(int in){
		if(in>=0){
			return in;
		}else{
			System.err.println("El a�o o la duraci�n no es v�lida.");
			return 0;
		}
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}

	public String getGenero() {
		return genero;
	}

	public String getAlbum() {
		return album;
	}

	public int getAnno() {
		return anno;
	}

	public int getDuracion() {
		return duracion;
	}

	public boolean match(QueryIF q) {
		//Creamos una matriz de enteros, cada entero valdr� 1 o 0. 
		//Se le sumar� cada entero de la matriz al entero aux para la b�squeda.
		int coincidencias[] = new int[8];
		int aux = 0; //Si aux = 8 la canci�n coincide con la b�squeda.
				
		//comprobamos si las cadenas de caracteres coinciden
		coincidencias[0] = checkMatch(q.getTitle(), getTitulo());
		coincidencias[1] = checkMatch(q.getAuthor(), getAutor());
		coincidencias[2] = checkMatch(q.getGenre(), getGenero());
		coincidencias[3] = checkMatch(q.getAlbum(), getAlbum());
				
		//comprobamos si el a�o y la duraci�n de la canci�n entran en el rango de b�squeda
		coincidencias[4] = checkMatchMinValue(q.getMin_year(), getAnno());
		coincidencias[5] = checkMatchMaxValue(q.getMax_year(), getAnno());
		coincidencias[6] = checkMatchMinValue(q.getMin_duration(), getDuracion());
		coincidencias[7] = checkMatchMaxValue(q.getMax_duration(), getDuracion());

		for(int i = 0; i < coincidencias.length; i++){
			aux += coincidencias[i]; //Se suma 1 a aux por cada coincidencia
		}
		
		if(aux==8){
			return true;
		}else{
			return false;
		}
	}
	
	//Compara dos cadenas de caracteres asumiendo un valor por defecto.
	//Devuelve 1 si la cadena i1 est� en su valor por defecto o si es igual a la cadena i2
	private int checkMatch(String i1, String i2){
		if(i1.equals("")){
			return 1;
		}else if(i1.equals(i2) && !i1.equals("")){
			return 1;
		}else{
			return 0;
		}
	}
	
	//Compara dos enteros asumiendo un valor por defecto.
	//Devuelve 1 si v1 est� en su valor por defecto o si v1 es menor o igual que v2
	private int checkMatchMinValue(int v1, int v2){
		if(v1==-1){
			return 1;
		}else if(v1<=v2 && v1!=-1){
			return 1;
		}else{
			return 0;
		}
	}
	
	//Compara dos enteros asumiendo un valor por defecto.
	//Devuelve 1 si v1 est� en su valor por defecto o si v1 es mayor o igual que v2
	private int checkMatchMaxValue(int v1, int v2){
		if(v1==-1){
			return 1;
		}else if(v1>=v2 && v1!=-1){
			return 1;
		}else{
			return 0;
		}
	}
}
