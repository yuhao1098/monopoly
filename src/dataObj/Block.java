package dataObj;

public abstract class Block {
	private BlockTypeEnum type;
	private String name;
	
	public Block() {
		
	}
	
	public Block(BlockTypeEnum type, String name) {
		this.type = type;
		this.name = name;
	}
	
	public abstract void handleBlockEvent(Player player);
	
	public BlockTypeEnum getType() {
		return type;
	}
	public void setType(BlockTypeEnum type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void printBlockInfo() {
		System.out.println("Block Type => " + type.name() + ", Name => " + name);
	}
}
