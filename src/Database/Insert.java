package Database;

import java.sql.Statement;
import java.util.ArrayList;

public class Insert extends DatabaseFunction {
    public Insert(){
        super();
    }
    public Insert(String url){
        super(url);
    }
    public void insertData(String vocab, String meaning) {
        Statement stmt = null;
        try {
            super.c.setAutoCommit(false);
            stmt = super.c.createStatement();
            String sql = "INSERT INTO DATA(vocab,meaning)"
                    + "VALUES ('" + vocab + "','" + meaning + "')";
            stmt.executeUpdate(sql);

            stmt.close();
            super.c.commit();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.hashCode());
            if (e.hashCode() == 214126413) {
                System.out.println("คำศัพท์ซ้ำ");
            }
        }
        System.out.println("Records created successfully");
    }


}
