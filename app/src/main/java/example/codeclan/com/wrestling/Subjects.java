package example.codeclan.com.wrestling;

import java.sql.ResultSet;

import db.SqlRunner;

/**
 * Created by user on 26/06/2017.
 */

public class Subjects {

    private String name;
    private String text;
    private int counselor_id;
    private int id;

    public Subjects(String name, String text, int counselor_id) {
        this.name = name;
        this.text = text;
        this.counselor_id = counselor_id;
    }


    public static void getCounselorDetails(String subject){
        String sql = String.format("SELECT counselors.*, subjects.description FROM counselors JOIN subjects ON counselors.id = subjects.counselor_id WHERE subjects.name = '%s';", subject);
        ResultSet rs = SqlRunner.executeQuery(sql);
        try {
            while (rs.next()) {
                String first_name = rs.getString("first_name");
                String nick_name = rs.getString("nick_name");
                String last_name = rs.getString("last_name");
                String telephone = rs.getString("telephone");
                String email = rs.getString("email");
                String member_since = rs.getString("member_since");
                String description = rs.getString("description");
                System.out.println("Name: " + first_name + " '" + nick_name + "' " + last_name);
                System.out.println("Telephone: " + telephone);
                System.out.println("Email: " + email);
                System.out.println("Member Since: " + member_since);
                System.out.println();
                System.out.println("Subject Description: " + description);
                System.out.println();
                System.out.println("--------------------------------------------");
            }
        }catch(Exception ex){
            System.exit(0);
        }finally{
            SqlRunner.closeConnection();
        }
    }

    public static void deleteAll() {
        String sql = "DELETE FROM subjects;";
        SqlRunner.executeUpdate(sql);
        SqlRunner.closeConnection();
    }
}


