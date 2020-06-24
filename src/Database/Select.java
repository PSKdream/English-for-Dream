package Database;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Select extends DatabaseFunction  {
    public Select(){
        super();
    }
    public Select(String url){
        super(url);
    }
    public ArrayList getTable() {
        ArrayList< ArrayList<Object>> data = new ArrayList();
        Statement stmt = null;
        try {
            super.c.setAutoCommit(false);
            stmt = super.c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM DATA;");
            while (rs.next()) {
                ArrayList<Object> dataReturn = new ArrayList();
                int id = rs.getInt("ID");
                String name = rs.getString("vocab");
                String meaning = rs.getString("meaning");

                dataReturn.add(id);
                dataReturn.add(name);
                dataReturn.add(meaning);
                data.add(dataReturn);
            }

            rs.close();
            stmt.close();
            // super.c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println(data);
        System.out.println("Operation done successfully");
        return data;
    }
    public ArrayList getColumn(String columnName) {
        ArrayList<Object> data = new ArrayList();
        Statement stmt = null;
        try {
            super.c.setAutoCommit(false);

            stmt = super.c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT " + columnName + " FROM DATA;");
            while (rs.next()) {
                ArrayList<Object> dataReturn = new ArrayList();
                String name = rs.getString(1);
                data.add(name);
            }
            rs.close();
            stmt.close();
            //super.c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            if (e.hashCode() == 1880587981) {
                System.out.println("ไม่มี column นี้ใน db");
            }
            System.exit(0);
        }
        System.out.println(data);
        System.out.println("Operation done successfully");
        return data;
    }
    public ArrayList getRow(String columnName,String value) {
        ArrayList< ArrayList<Object>>  data = new ArrayList();
        Statement stmt = null;
        try {
            super.c.setAutoCommit(false);

            stmt = super.c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM DATA WHERE "+columnName+" = '"+value+"'");
            while (rs.next()) {
                ArrayList<Object> dataReturn = new ArrayList();
                int id = rs.getInt("ID");
                String name = rs.getString("vocab");
                String meaning = rs.getString("meaning");

                dataReturn.add(id);
                dataReturn.add(name);
                dataReturn.add(meaning);
                data.add(dataReturn);
            }
            rs.close();
            stmt.close();
            //c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            if (e.hashCode() == 1880587981) {
                System.out.println("ไม่มี column นี้ใน db");
            }
            System.exit(0);
        }
        System.out.println(data);
        System.out.println("Operation done successfully");
        return data;
    }


    
}
