package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dram-
 */
public class Delete {

    private Connection c = null;

    Delete(Connection c) {
        this.c = c;
    }

    public void delete(String vocab) {
        String sql = "DELETE FROM DATA WHERE vocab = '"+vocab+"'";
        try  {
            PreparedStatement pstmt = c.prepareStatement(sql);
           // pstmt.setString(0, vocab);
            pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
