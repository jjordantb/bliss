public class Tile {

    private final int x, y, plane;

    public Tile(int x, int y, int plane) {
        this.x = x;
        this.y = y;
        this.plane = plane;
    }

    public Tile(int x, int y) {
        this(x, y, 0);
    }

    public int distanceTo(Tile tile) {
        return Math.abs(tile.x - this.x) - Math.abs(tile.y - this.y);
    }

    public int getPlane() {
        return plane;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Tile{" +
                "x=" + x +
                ", y=" + y +
                ", plane=" + plane +
                '}';
    }
}
