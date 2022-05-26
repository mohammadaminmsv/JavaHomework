package Test;

import java.sql.SQLException;

public class Controller {
    private Controller(){}

    private static final Controller instance = new Controller();

    public static Controller getInstance() {
        return instance;
    }


    public Student getStudent() {
        return new Student(

                In.getInstance().getint("Enter CodeOfSTU::"),
                In.getInstance().getint("Enter year:"),
                In.getInstance().getint("Enter score:")

                );
    }
    public String Message(){

        return In.getInstance().getString("For add Information enter 1,\n" +
                "for delete Information enter 2,\n" +
                "for update Information enter something else");
    }

    public void Start() throws SQLException {
        try {
            switch (Message()){
                case "1":{
                    Student stud = getStudent();
                    StudentDAO.getInstance().save(stud);
                    Start();

                    break;
                }
                case "2":{
                    String name = In.getInstance().getString("Enter name:");
                    Student stud1 =StudentDAO.getInstance().FindbyName(name)
                            .orElse(null);
                    if (stud1 != null){

                        StudentDAO.getInstance().delete(stud1);
                    }
                    else throw new Exception("Error: student not found!");
                    Start();
                    break;
                }
                default:{
                    String name = In.getInstance().getString("Enter name:");
                    Student stud1 = StudentDAO.getInstance().FindbyName(name)
                            .orElse(null);
                    if (stud1 != null){
                        System.out.println("\n"+ stud1.toString());
                        StudentDAO.getInstance().save(getStudent().setName(name));
                    }
                    else throw new Exception("Error: name not found!");
                    Start();
                    break;
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Database.getInstance().close();
        }

    }


    }


