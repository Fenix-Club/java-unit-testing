package logic.map;

import logic.item.Item;
import logic.map.ground.GroundType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class GameLevelTest {

    @Test
    public void getN_afterCreatingMap_shouldReturnCorrectDimensions() {
        int testDimensionValue = 2;

        GameLevel testLevel = new GameLevel(testDimensionValue);

        assertEquals(testLevel.getN(), testDimensionValue);
    }

    @Test
    public void getLayingTimeName_afterCreatingMap_shouldReturnNull(){
        int testDimensionValue = 3;
        GameLevel testLevel = new GameLevel(testDimensionValue);
        int testIDimension = 1;
        int testJDimension = 0;

        String testLayingItemName = testLevel.getLayingItemName(testIDimension, testJDimension);
        assertEquals(testLayingItemName, null);

    }

    @Test
    public void getLayingItemName_afterLayingItem_shouldReturnCorrectValue(){
        int testDimension = 3;
        GameLevel testLevel = new GameLevel(testDimension);
        String testItemName = "Test item";
        Item mockItem = mock(Item.class);
        when(mockItem.toString()).thenReturn(testItemName);
        int testIDimension = 1;
        int testJDimension = 0;


        testLevel.layItem(testIDimension, testJDimension, mockItem);

        assertEquals(testLevel.getLayingItemName(testIDimension,testJDimension),
                testItemName);

    }


}
