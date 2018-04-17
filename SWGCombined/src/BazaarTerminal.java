import java.util.concurrent.ConcurrentHashMap;



public class BazaarTerminal extends Terminal {
	public final static long serialVersionUID = 1l;
	private ConcurrentHashMap<Long, TangibleItem> vItemsForSaleThisTerminal;
	private String sPacketName;
	
	public BazaarTerminal() {
		super();
	}
	
	protected TangibleItem getItemForSale(long objectID) {
		return vItemsForSaleThisTerminal.get(objectID);
	}
	
	protected TangibleItem removeItemForSale(long objectID) {
		return vItemsForSaleThisTerminal.remove(objectID);
	}
	
	protected void setItemForSale(TangibleItem t) {
		vItemsForSaleThisTerminal.put(t.getID(), t);
	}
	
	protected ConcurrentHashMap<Long, TangibleItem> getAllSaleItems() {
		return vItemsForSaleThisTerminal;
	}
	
}
