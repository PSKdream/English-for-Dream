package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public abstract class DatabaseFunction  {

    protected String url;
    protected Connection c = null;
    
    public DatabaseFunction(){
        System.out.println("Error url is null.");
    }
    public DatabaseFunction(String url){
        this.url = url; 
    }
    
}
