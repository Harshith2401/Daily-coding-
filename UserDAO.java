package User_DAOHandler;

import DB_Util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

    // Insert User
    public int insertUser(String username, String uEmail, Long phoneno) {
        String sql = "INSERT INTO users (username, uEmail, phoneno) VALUES (?, ?, ?)";//?are called as place holders
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, username);
            pstmt.setString(2, uEmail);
            pstmt.setLong(3, phoneno);
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            e.getMessage();
        }
        return 0;
    }

    // Delete User
    public int deleteUser(int userID) {
        String sql = "DELETE FROM Users WHERE userID = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, userID);
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    // Update User
    public int updateUser( int userID,String username, String uEmail, Long phoneno) {
        String sql = "UPDATE users SET username=?, uEmail=?, phoneno=? WHERE userID=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, username);
            pstmt.setString(2, uEmail);
            pstmt.setLong(3, phoneno);
            pstmt.setInt(4, userID);
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}