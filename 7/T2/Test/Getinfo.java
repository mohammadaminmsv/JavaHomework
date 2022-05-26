package Test;

public class Getinfo {

    private Getinfo() {
    }

    private static final Getinfo instance = new Getinfo();

    public static Getinfo getInstance() {
        return instance;
    }


    public Emplo EnterInfo() {
        return new Emplo(
                In.getInstance().getint("Enter Emplocode:"),
                In.getInstance().getString("Enter Emploname:"),
                In.getInstance().getint("Enter EmploId:"),
                In.getInstance().getString("Enter EmploFATname="),
                In.getInstance().getString("Enter Emplolevel="),
                In.getInstance().getint("Enter money:"),
                In.getInstance().getString("Enter Histo=")

        );
    }


    public String stste() {
        return In.getInstance().getString("\nFor Enter Information enter 1 " +
                "\n" +
                "For Delete Information enter 2 \n " +
                "for update Information Enter any thing else");


    }

    public Emplo Start() throws GetEXcp, Exception {
        try {
            switch (stste()) {
                case "1": {
                    Emplo emplo = EnterInfo();
                    if (EmploDAO.getInstance().findByEmployeeNumber(emplo.getEmplocode())
                            .orElse(null) == null) {
                        EmploDAO.getInstance().save(emplo);
                    } else throw new GetEXcp("Error: Employee_Number is already taken!");
                    Start();
                    break;
                }
                case "2": {
                    int Emplocode = In.getInstance().getint("Enter Emplocode:");
                    Emplo emplo = EmploDAO.getInstance().findByEmployeeNumber(Emplocode)
                            .orElse(null);
                    if (emplo != null) {
                        EmploDAO.getInstance().Delete(emplo);
                    } else throw new Exception("Error: Employee not found!");
                    Start();
                    break;
                }
                default: {
                    int Emplocode1 = In.getInstance().getint("Enter Emplocode:");
                    Emplo emplo1 = EmploDAO.getInstance().findByEmployeeNumber(Emplocode1)
                            .orElse(null);
                    if (emplo1 != null) {
                        System.out.println("\n" + emplo1.toString());
                        EmploDAO.getInstance().save(EnterInfo().setEmplocode(Emplocode1));
                    } else throw new Exception("Error: Employee not found!");
                    Start();
                    break;
                }
            }

        } catch (GetEXcp e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Database.getInstance().close();
        }


        return Start();
    }
}
