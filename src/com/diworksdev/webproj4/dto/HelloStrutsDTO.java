package com.diworksdev.webproj4.dto;

public class HelloStrutsDTO {
    private int userId;
    private String userName;
    private String password;
    private String result;

    // ユーザーIDのgetterメソッド
    public int getUserId() {
        return userId;
    }

    // ユーザーIDのsetterメソッド
    public void setUserId(int userId) {
        this.userId = userId;
    }

    // ユーザー名のgetterメソッド
    public String getUserName() {
        return userName;
    }

    // ユーザー名のsetterメソッド
    public void setUserName(String userName) {
        this.userName = userName;
    }

    // パスワードのgetterメソッド
    public String getPassword() {
        return password;
    }

    // パスワードのsetterメソッド
    public void setPassword(String password) {
        this.password = password;
    }

    // 結果のgetterメソッド
    public String getResult() {
        return result;
    }

    // 結果のsetterメソッド
    public void setResult(String result) {
        this.result = result;
    }
}
