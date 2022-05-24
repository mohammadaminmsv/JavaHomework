package Test;

public class Student<F,S,T> {
    public F x;
    public S y;
    public T z;

    public F getX() {
        return x;
    }

    public void setX(F x) {
        this.x = x;
    }

    public S getY() {
        return y;
    }

    public void setY(S y) {
        this.y = y;
    }

    public T getZ() {
        return z;
    }

    public void setZ(T z) {
        this.z = z;
    }
    public void Show(){
        System.out.println("name="+getX()+"    father name="+getY()+"     Id=");
    }
}
