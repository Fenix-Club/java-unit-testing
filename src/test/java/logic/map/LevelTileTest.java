package logic.map;

import logic.item.Item;
import logic.map.ground.GroundType;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;

public class LevelTileTest {

    @Test
    public void getLayingItemName_whenItemNotNull_shouldReturnCorrectValue() {
        LevelTile testTile = new LevelTile(GroundType.SOIL);
        String testItemName = "Test item";
        Item mockItem = mock(Item.class);
        when(mockItem.getShortItemName()).thenReturn(testItemName);

        testTile.placeItem(mockItem);

        assertEquals(testTile.getLayingItemName(), testItemName);
        verify(mockItem, times(1)).getShortItemName();
    }
}
