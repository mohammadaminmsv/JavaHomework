package Test;

public class CalcPlus extends Calculate{

    private int x;
    private int y;

    public CalcPlus() {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void opp(int x, int y) {
        System.out.println(x+y);
    }
}
