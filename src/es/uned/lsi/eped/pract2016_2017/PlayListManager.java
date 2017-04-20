package es.uned.lsi.eped.pract2016_2017;

import es.uned.lsi.eped.DataStructures.List;
import es.uned.lsi.eped.DataStructures.ListIF;

public class PlayListManager implements PlayListManagerIF {

	private List<PlayList> list;
	
	public PlayListManager(){
		list = new List<PlayList>();
	}
	
	private List<PlayList> getList(){
		return list;
	}
	
	public boolean contains(String playListID) {
		if(notEmptyString(playListID)){
			PlayList pl = getPlayList(playListID);
			if(getList().contains(){
				return true;
			}
		}
		return false;
	}

	public PlayListIF getPlayList(String playListID) {
		int aux = StringToIntID(playListID);
		PlayList pl = getList().get(aux);
		
		return pl;
	}

	public ListIF<String> getIDs() {
		List<String> l = new List<String>();
		
		for(int i = 0; i < getList().size(); i++){
			l.insert(getList().get(0).getPlayListID(), i);
		}
		
		return l;
	}

	@Override
	public void createPlayList(String playListID) {
		if(notEmptyString(playListID) && !contains(playListID)){
			PlayList pl = new PlayList(playListID);
			getList().insert(pl, getList().size());
		}
	}

	public void removePlayList(String playListID) {
		int aux = StringToIntID(playListID);
		getList().remove(aux);
	}
	
	//Coge el nombre de una lista de reproducción y devuelve 
	//su posición en la lista del gestionador | Devuelve 0 si es invalido
	private int StringToIntID(String playListID){
		int aux = 0;
		
		if(notEmptyString(playListID) && contains(playListID)){
			while(getList().get(aux).getPlayListID().equals(playListID)){
				aux++;
			}
			return aux;
		}else{
			System.err.println("No se pudo obtener la ID de PlayList(playListID");
			return 0;
		}
	}
	
	//Comprueba si la cadena del parámetro está vacía o no
	private boolean notEmptyString(String in){
		if(in.length()>0){
			return true;
		}else{
			System.err.println("Cadena vacía (PlayListManager.java)");
			return false;
		}
	}

}
