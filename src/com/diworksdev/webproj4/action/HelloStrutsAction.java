package com.diworksdev.webproj4.action;

import java.util.ArrayList;
import java.util.List;

import com.diworksdev.webproj4.dao.HelloStrutsDAO;
import com.diworksdev.webproj4.dto.HelloStrutsDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HelloStrutsAction extends ActionSupport {
    private List<HelloStrutsDTO> HelloStrutsDTOList = new ArrayList<HelloStrutsDTO>();

    // executeメソッドはStrutsのActionクラスの標準的なメソッドで、アクションが実行されると呼び出されます。
    public String execute() {
        String ret = ERROR; // デフォルトはエラーとして設定

        // DAOクラスからユーザー情報を取得する
        HelloStrutsDAO dao = new HelloStrutsDAO();
        HelloStrutsDTOList = dao.select();

        // ユーザー情報が取得できた場合は成功として設定
        if (HelloStrutsDTOList.size() > 0) {
            ret = SUCCESS;
        } else {
            ret = ERROR;
        }

        return ret; // SUCCESSまたはERRORを返す
    }

    // リストのgetterとsetter
    public List<HelloStrutsDTO> getHelloStrutsDTOList() {
        return HelloStrutsDTOList;
    }

    public void setHelloStrutsDTOList(List<HelloStrutsDTO> helloStrutsDTOList) {
        HelloStrutsDTOList = helloStrutsDTOList;
    }
}
