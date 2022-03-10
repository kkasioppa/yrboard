<%@ page import="com.yerin.pilot.model.Country" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: kkasioppa
  Date: 2022-03-10
  Time: 오후 1:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
//    ArrayList<Country> result = (ArrayList<Country>)request.getAttribute("country");
//
//    for(int i = 0; i < result.size(); i++) {
//        out.write(result.get(i).getCountry());
//        out.write("<br>");
//    }
//
//    int iSize = result.size();

    List<Country> result = (List<Country>) request.getAttribute("country");
    for(int i = 0; i < result.size(); i++) {
//        out.write(result.get(i).getCountry());
//        out.write("<br>");
    }
%>

<select name="selCountry">
    <option value="1">korea</option>
    <option value="2">usa</option>
    <option value="2">nepal</option>
</select>


</body>
</html>
