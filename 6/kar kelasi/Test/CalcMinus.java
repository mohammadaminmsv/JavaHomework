package Test;

public class CalcMinus extends Calculate{
    public CalcMinus() {
        this.x = x;
        this.y = y;
    }

    private int x;
    private int y;

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
        System.out.println(x-y);
    }
}
