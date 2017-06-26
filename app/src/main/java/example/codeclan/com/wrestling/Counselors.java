package example.codeclan.com.wrestling;

import java.util.Date;

import db.SqlRunner;

/**
 * Created by user on 26/06/2017.
 */

public class Counselors {

   private String first_name;
    private String nick_name;
    private String last_name;
    private String telephone;
    private String email;
    private String member_since;

    public Counselors(String first_name, String nick_name, String last_name, String telephone, String email, String member_since){
        this.first_name = first_name;
        this.nick_name = nick_name;
        this.last_name = last_name;
        this.telephone = telephone;
        this.email = email;
        this.member_since = member_since;
    }

    public static void deleteAll() {
        String sql = "DELETE FROM counselors;";
        SqlRunner.executeUpdate(sql);
        SqlRunner.closeConnection();
    }

}
