package logic;

import util.Util;
import dataObj.Block;
import dataObj.Map;
import dataObj.Player;

public class Monopoly {

	public static void main(String[] args) {
		Map gameMap = new Map();
		Player player = new Player("Eric Hou", 0);
		while(isNotEnd()) {
			System.out.println("Player[" + player.getPlayerName() + "]'s round");
			Integer step = Util.getStep();
			System.out.println("Step => " + step);
			Integer newPos = Util.getNewPos(player.getCurrentPos(), step, gameMap.getMapSize());
			System.out.println("New Position => " + newPos);
			Block block = gameMap.getBlock(newPos);
			block.printBlockInfo();
			block.handleBlockEvent(player);
		}
	}

	private static Boolean isNotEnd() {
		return true;
	}
}
