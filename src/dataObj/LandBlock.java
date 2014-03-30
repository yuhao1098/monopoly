package dataObj;

public class LandBlock extends Block {
	private Integer price;
	private Integer toll;
	private Integer ownerId = null;
	
	public LandBlock(String name, Integer price, Integer toll) {
		super(BlockTypeEnum.Land, name);
		this.price = price;
		this.toll = toll;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getToll() {
		return toll;
	}

	public void setToll(Integer toll) {
		this.toll = toll;
	}

	@Override
	public void handleBlockEvent(Player player) {
		if (ownerId == null) {
			// ask if u want to buy this land
		} else if (ownerId != player.getPlayerId()){
			// deduct player money
			player.setCash(player.getCash() - toll);
		}
	}

}
