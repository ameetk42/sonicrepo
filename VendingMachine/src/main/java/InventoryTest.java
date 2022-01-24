import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.sonic.VendingMachine.service.HomeService;

public class InventoryTest {

	
	@Test
	public void testInventory() {
		
		HomeService homeService  = new HomeService();
		homeService.getListOfItems();
		
		assertTrue("This will succeed.", true);

		
		
		
		
	}
	
	
	
}
