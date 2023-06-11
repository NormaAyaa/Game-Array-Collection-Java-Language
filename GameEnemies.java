
//Norma Zuhrotul Hayati//
//4611421089//

public class GameEnemies {
    private double width;
    private double height;
    private int positionX;
    private int positionY;

    public GameEnemies() {
        this.width = 0;
        this.height = 0;
        this.positionX = 0;
        this.positionY = 0;
    }

    public GameEnemies(double width, double height) {
        this.width = width;
        this.height = height;
        this.positionX = 0;
        this.positionY = 0;
    }

    public GameEnemies(double width, double height, int positionX, int positionY) {
        this.width = width;
        this.height = height;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public void setDimension(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setPosition(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public int getX() {
        return this.positionX;
    }

    public int getY() {
        return this.positionY;
    }

    public void Run() {
        System.out.println("Enemy is running");
    }
}