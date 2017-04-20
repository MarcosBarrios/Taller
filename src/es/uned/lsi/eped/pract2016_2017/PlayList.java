package es.uned.lsi.eped.pract2016_2017;

import es.uned.lsi.eped.DataStructures.List;
import es.uned.lsi.eped.DataStructures.ListIF;

public class PlayList implements PlayListIF {

	private List<Integer> playList;
	
	private String playListID;
	
	public PlayList(String playListID){
		playList = new List<Integer>();
		this.playListID = playListID;
	}
	
	public ListIF<Integer> getPlayList() {
		return playList;
	}

	public void addListOfTunes(ListIF<Integer> lT) {
		for(int i = 0; i <= lT.size(); i++){
			playList.insert(lT.get(i), playList.size()+i);
		}
	}

	public void removeTune(int tuneID) {
		while(playList.contains(tuneID)){
			playList.remove(tuneID);
		}
	}

	public String getPlayListID() {
		return playListID;
	}

}
