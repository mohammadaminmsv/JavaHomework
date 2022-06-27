package Test.model.Admin;


import Test.GetAndDatabase.Database;

import java.sql.SQLException;

public class AdminDetail {
    private AdminDetail(){};
    private final static AdminDetail instance = new AdminDetail();
    public static AdminDetail getInstance() {
        return instance;
    }

    public void EnterAdminInfo(Admin admin, int admincode, String lastname) throws SQLException {
        admin.setAdmincode(admin.getAdmincode()+admincode);
        admin.setLastname(admin.getLastname()+lastname);
        AdminDAO.getInstance().save(admin);
        Database.getInstance().commit();
    }

}

