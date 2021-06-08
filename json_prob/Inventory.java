package json_prob;

import java.util.List;

import com.bridgelabz.oops.model.Stock;

public class Inventory {
	public static void main(String[] args) {
		JsonUtil utiljson = new JsonUtil();
		List<Stock> listStock = utiljson.convertJsonObj("C:\\Users\\Asus-i3\\shweta_bridgelabz\\json_prob\\src\\main\\java\\com\\bridgelabz\\oops\\model\\Inventory_json.json");
		
		System.out.println("Total items in inventory =");
		InventoryManager manage = new InventoryManager();
	
		manage.readInventory(listStock);
		manage.getTotalRiceWeight();
		manage.getTotalPulsesWeight();
		manage.getTotalWheatWeight();
		manage.getPriceOfRice();
		manage.getPriceOfPulses();
		manage.getPriceOfWheat();
		
	}
	

}
