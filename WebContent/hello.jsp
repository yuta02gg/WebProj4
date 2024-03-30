<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="./css/style.css">
    <title>HelloStruts</title>
</head>
<body>
    <h1>HelloStruts2!</h1>
    <br>
    <table>
        <tbody>
            <tr>
                <th>USERID</th>
                <th>USERNAME</th>
                <th>PASSWORD</th>
                <th>RESULT</th>
            </tr>
            <s:iterator value="helloStrutsDTOList"> <!-- helloStrutsDTOListの要素を繰り返し処理 -->
                <tr>
                    <td><s:property value="userId"/></td> <!-- userIdの値を表示 -->
                    <td><s:property value="userName"/></td> <!-- userNameの値を表示 -->
                    <td><s:property value="password"/></td> <!-- passwordの値を表示 -->
                    <td><s:property value="result"/></td> <!-- resultの値を表示 -->
                </tr>
            </s:iterator>
        </tbody>
    </table>
</body>
</html>
