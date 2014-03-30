package dataObj;

public class EventBlock extends Block {
	Event event;
	
	public EventBlock(String name, Event event) {
		super(BlockTypeEnum.Event, name);
		this.event = event;
	}
	
	@Override
	public void handleBlockEvent(Player player) {
		event.handleEventWithPlayer(player);
	}
}
