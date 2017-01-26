package logic.map;

import logic.item.Item;
import logic.map.ground.GroundType;

/**
 * Created by npotocka on 05.01.17.
 * Modified by Jan Nowiński on 12.01.2017: added possibility to store items on ground
 */

public class LevelTile {
    private GroundType ground;
    private Item item = null;

    public LevelTile(GroundType ground){
        this.ground = ground;
    }

    public GroundType getGround() {
        return ground;
    }

    public void setGround(GroundType ground) {
        this.ground = ground;
    }

    //Items connected methods
    public void placeItem(Item item_placed) {this.item = item_placed;}
    public void removeItem(){this.item = null;}
    public Item getLayingItem() {return item;}
    public String getLayingItemName()
    {
        if(item == null)
        {
            return "    ";
        }
        else
        {
            return item.getShortItemName();
        }
    }
    public String getLayingItemFullName(){return this.item.toString();}

    @Override
    public String toString() {
        return ground.toString();
    }
}
