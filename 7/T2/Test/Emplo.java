package Test;

public class Emplo {
    private int Emplocode;
    private String Emploname;
    private int EmploId;
    private String EmploFATname;
    private String Emplolevel;
    private int money;
    private String Histo;

    public Emplo(int emplocode, String emplonamel, int emploId, String emploFATname, String emplolevel, int money, String histo) {
        Emplocode = emplocode;
        Emploname = emplonamel;
        EmploId = emploId;
        EmploFATname = emploFATname;
        Emplolevel = emplolevel;
        this.money = money;
        Histo = histo;
    }

    public Emplo() {

    }

    @Override
    public String toString() {
        return "Emplo{" +
                "Emplocode=" + Emplocode +
                ", Emplonamel='" + Emploname + '\'' +
                ", EmploId=" + EmploId +
                ", EmploFATname='" + EmploFATname + '\'' +
                ", Emplolevel='" + Emplolevel + '\'' +
                ", money=" + money +
                ", Histo='" + Histo + '\'' +
                '}';
    }

    public int getEmplocode() {
        return Emplocode;
    }

    public void setEmplocode(int emplocode) {
        Emplocode = emplocode;
    }

    public String getEmploname() {
        return Emploname;
    }

    public void setEmploname(String emploname) {
        Emploname = emploname;
    }

    public int getEmploId() {
        return EmploId;
    }

    public void setEmploId(int emploId) {
        EmploId = emploId;
    }

    public String getEmploFATname() {
        return EmploFATname;
    }

    public void setEmploFATname(String emploFATname) {
        EmploFATname = emploFATname;
    }

    public String getEmplolevel() {
        return Emplolevel;
    }

    public void setEmplolevel(String emplolevel) {
        Emplolevel = emplolevel;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getHisto() {
        return Histo;
    }

    public void setHisto(String histo) {
        Histo = histo;
    }
}
