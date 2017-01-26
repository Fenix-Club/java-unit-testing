package logic.map;

import logic.item.Item;
import logic.map.ground.GroundType;

import java.util.Random;

/**
 * Created by npotocka on 05.01.17.
 */
public class GameLevel {
    int n; //dimensions
    public LevelTile[][] map;

    public GameLevel(int n, String type){
        this.n = n;
        this.map = new LevelTile[n][n];
        switch (type){
            case "random":
                this.GroundGenerator(n);
                break;
            case "file":
                System.out.println("TO BE DONE, randomly generating");
                this.GroundGenerator(n);
                break;

        }

    }

    public GameLevel(int n){
        this.n = n;
        this.map = new LevelTile[n][n];
        for(int i = 0; i < n; i++){
            for(int j =0; j < n; j++){
                this.map[i][j] = new LevelTile(GroundType.SOIL);
            }
        }
    }

    public int getN() {
        return n;
    }


    private void GroundGenerator(int n){
        Random rnd = new Random();
        for(int i = 0; i < n; i++){
            for(int j =0; j < this.n; j++){
                int grdTypeNumber = rnd.nextInt(3);
                switch (grdTypeNumber){
                    case 0:
                        this.map[i][j] = new LevelTile(GroundType.SOIL);
                        break;
                    case 1:
                        this.map[i][j] = new LevelTile(GroundType.TREE);;
                        break;
                    case 2:
                        this.map[i][j] = new LevelTile(GroundType.WALL);
                        break;
                }
            }
        }
    }
    //Item connected methods
    public void layItem(int i,int j, Item object)
    {
        map[i][j].placeItem(object);
    }
    public void removeItem(int i,int j)
    {
        map[i][j].removeItem();
    }
    public Item getLayingItem(int i, int j)
    {
        return map[i][j].getLayingItem();
    }
    public String getLayingItemName(int i, int j)
    {
        return map[i][j].getLayingItemFullName();
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < this.n; j++) {
                builder.append(this.map[i][j].toString());
                builder.append(" ");
            }
            builder.append("\n");
            for (int j = 0; j < this.n; j++) {
                builder.append(this.map[i][j].getLayingItemName());
                builder.append(" ");
            }
            builder.append("\n");
        }
        builder.append("\n");
        return builder.toString();
    }
}
