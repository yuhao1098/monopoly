package dataObj;

import java.util.ArrayList;
import java.util.List;

public class Map {
	private List<Block> gameMap = new ArrayList<Block>();
	
	public Map() {
		// read file here?
		initMap();
	}
	
	private void initMap() {
		
	}
	
	public Block getBlock(Integer pos) {
		return gameMap.get(pos);
	}
	
	public Integer getMapSize() {
		return gameMap.size();
	}
}
