package util;

public class Util {
	public static Integer getStep() {
		return (int)(Math.random() * 6 + 1);
	} 
	
	public static Integer getNewPos(Integer pos, Integer step, Integer mapSize) {
		Integer newPos = pos + step;
		return newPos >= mapSize ? newPos -= mapSize : newPos; 
	}
}
