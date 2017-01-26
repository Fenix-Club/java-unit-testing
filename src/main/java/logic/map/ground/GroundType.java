package logic.map.ground;

/**
 * Created by npotocka on 05.01.17.
 */

public enum GroundType {
    SOIL("Soil", 's'),
    TREE("Tree", 't'),
    WALL("Wall", 't');

    private String type;
    private char mapDisplay;

    private GroundType(String type, char mapDisplay) {
        this.type = type;
        this.mapDisplay = mapDisplay;
    }

    public char getMapDisplay() {
        return this.mapDisplay;
    }

    @Override
    public String toString() {
        return this.type;
    }
}