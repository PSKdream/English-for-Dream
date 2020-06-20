package Database;

import java.sql.Statement;

public class Insert extends Database {
    public Insert(){
        super();
    }
    public Insert(String url){
        super(url);
    }
    public void insertData(String vocab, String meaning) {
        Statement stmt = null;
        try {
            c.setAutoCommit(false);
            stmt = c.createStatement();
            String sql = "INSERT INTO DATA(vocab,meaning)"
                    + "VALUES ('" + vocab + "','" + meaning + "')";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.hashCode());
            if (e.hashCode() == 214126413) {
                System.out.println("คำศัพท์ซ้ำ");
            }
        }
        System.out.println("Records created successfully");
    }
}
