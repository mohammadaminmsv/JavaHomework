package Test;

public class Student<FIRST,SECOND,THIRD> implements Cloneable{
    public FIRST x;
    public SECOND y;
    public THIRD z;

    public FIRST getX() {
        return x;
    }

    public void setX(FIRST x) {
        this.x = x;
    }

    public SECOND getY() {
        return y;
    }

    public void setY(SECOND y) {
        this.y = y;
    }

    public THIRD getZ() {
        return z;
    }

    public void setZ(THIRD z) {
        this.z = z;
    }
    public Object Clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public void Show(){
        System.out.println("name= "+getX()+"\t last name= "+getY()+"\t password= "+getZ());

    }
}
