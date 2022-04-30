package discordbot.utils.dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import discordbot.TaikoVo.TaikoDiscordBotVO;

public class Dbcp {

    public ArrayList<TaikoDiscordBotVO> getSong(String songName) {

        ArrayList<TaikoDiscordBotVO> result = new ArrayList<TaikoDiscordBotVO>();
        TaikoDiscordBotVO vo = new TaikoDiscordBotVO();

        // String SQL = "select song_name as songName , song_genre as songGenre ,
        // difficult as difficult from sys.taiko_discordbot td where REPLACE(song_name,
        // ' ', '') LIKE '%"
        // + songName + "%'";
        String SQL = "select song_name as songName , song_genre as songGenre , difficult as difficult from sys.taiko_discordbot where REPLACE(song_name, ' ', '') LIKE '%"
                + songName + "%'";

        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sys?serverTimezone=UTC",
                    "root",
                    "123qwe");

            // PreparedStatement ps = conn.prepareStatement(SQL);
            // ps.setString(1, songName);
            // System.out.println("songName==================================>" + songName);
            // System.out.println("SQL=======================================>" + SQL);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {

                vo.setSongName(rs.getString(1));
                vo.setSongGenre(rs.getString(2));
                vo.setDifficult(rs.getString(3));

            }
            result.add(vo);

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;

    }

    public int getSongCount(String genre) {

        String SQL = " select count(*) from sys.taiko_discordbot td where song_genre = '" + genre + " '";

        int result = 0;

        if (genre.equals("all")) {
            SQL = "select count(*) from sys.taiko_discordbot td";
        }

        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sys?serverTimezone=UTC",
                    "root",
                    "123qwe");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                result = Integer.parseInt(rs.getString(1));
            }

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;

    }

    public void updateTaikoSongs() {

    }

    public void insert(HashMap<String, Object> paramMap) {

        String SQL = "INSERT INTO sys.taiko_discordbot(song_name,song_genre,difficult) VALUES(?,?,?)";

        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sys?serverTimezone=UTC",
                    "root",
                    "123qwe");

            PreparedStatement pstmt = conn.prepareStatement(SQL);

            pstmt.setString(1, paramMap.get("songs").toString());
            pstmt.setString(2, paramMap.get("songGenre").toString());
            pstmt.setString(3, paramMap.get("difficulty").toString());
            int check = pstmt.executeUpdate();
            System.out.println(check);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
