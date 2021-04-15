package es.codeurjc.rest.items;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ItemsControllerTest {

	@Test
	public void postItemTest() throws Exception {

		// GIVEN

		ItemsRepository itemsRepository = new ItemsRepository();

		Item item = new Item();
		String itemDescription = "Tomate";
		boolean itemCheked = false;
		item.setDescription(itemDescription);
		item.setChecked(itemCheked);

		System.out.println("Given");

		// WHEN

		Item postedItem = itemsRepository.postItem(item);
		
		System.out.println("When");

		// THEN

		assertThat(postedItem.getDescription()).isEqualTo(itemDescription);
	
		System.out.println("Then");
	}

}
