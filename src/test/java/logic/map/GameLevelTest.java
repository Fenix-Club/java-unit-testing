package logic.map;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameLevelTest {

    @Test
    public void getN_afterCreatingMap_shouldReturnCorrectDimensions() {
        int testDimensionValue = 2;
        GameLevel testLevel = new GameLevel(testDimensionValue);

        assertEquals(testLevel.getN(), testDimensionValue);
    }
}
