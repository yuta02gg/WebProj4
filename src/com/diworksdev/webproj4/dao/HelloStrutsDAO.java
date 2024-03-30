package com.diworksdev.webproj4.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.diworksdev.webproj4.dto.HelloStrutsDTO;
import com.diworksdev.webproj4.util.DBConnector;

public class HelloStrutsDAO {
    // ユーザー情報を格納するリスト
    List<HelloStrutsDTO> helloStrutsDTOList = new ArrayList<HelloStrutsDTO>();

    // ユーザー情報をデータベースから取得するメソッド
    public List<HelloStrutsDTO> select() {
        // DBConnectorクラスを使用してデータベースに接続
        DBConnector db = new DBConnector();
        Connection con = db.getConnection();

        // SQL文の準備
        String sql = "select * from users";
        try {
            // SQL文を実行し、結果を取得
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            // 結果をDTOに格納し、リストに追加
            while(rs.next()) {
                HelloStrutsDTO dto = new HelloStrutsDTO();
                dto.setUserId(rs.getInt("user_id"));
                dto.setUserName(rs.getString("user_name"));
                dto.setPassword(rs.getString("password"));
                dto.setResult("MySQLと接続できます。");
                helloStrutsDTOList.add(dto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 接続をクローズ
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return helloStrutsDTOList;
    }
}
