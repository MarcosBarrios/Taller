package es.uned.lsi.eped.pract2016_2017;

import es.uned.lsi.eped.DataStructures.List;
import es.uned.lsi.eped.DataStructures.ListIF;

public class Player implements PlayerIF {

	private TuneCollectionIF T;
	
	private int maxRecentlyPlayed;
	
	 /* Constructor de la clase que implementa PlayerIF
	 * @param -una colección de canciones como un objeto TuneCollectionIF
	 * 		  -un entero representando el número máximo de canciones
	 * 		  reproducidas que se pueden almacenar
	 */
	public Player(TuneCollectionIF T, int maxRecentlyPlayed){
		this.T = T;
		this.maxRecentlyPlayed = maxRecentlyPlayed;
	}
	
	@Override
	public ListIF<String> getPlayListIDs() {
		
		return null;
	}

	@Override
	public ListIF<Integer> getPlayListContent(String playListID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIF<Integer> getPlayBackQueue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIF<Integer> getRecentlyPlayed() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createPlayList(String playListID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removePlayList(String playListID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addListOfTunesToPlayList(String playListID, ListIF<Integer> lT) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addSearchToPlayList(String playListID, String t, String a, String g, String al, int min_y, int max_y,
			int min_d, int max_d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeTuneFromPlayList(String playListID, int tuneID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addListOfTunesToPlayBackQueue(ListIF<Integer> lT) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addSearchToPlayBackQueue(String t, String a, String g, String al, int min_y, int max_y, int min_d,
			int max_d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addPlayListToPlayBackQueue(String playListID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clearPlayBackQueue() {
		// TODO Auto-generated method stub

	}

	@Override
	public void play() {
		// TODO Auto-generated method stub

	}

}
