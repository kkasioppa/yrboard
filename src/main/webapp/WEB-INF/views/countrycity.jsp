<%@ page import="com.yerin.pilot.model.Country" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.yerin.pilot.model.City" %><%--
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

    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script>
        function countryChanged() {
            var selectedCountry = document.getElementById("selCountry");
            var selectedValue = selectedCountry.options[selectedCountry.selectedIndex].value;
            var selectedText = selectedCountry.options[selectedCountry.selectedIndex].text;

            console.log('선택된 나라는 ' + selectedText + '이고, value 값은 ' + selectedValue + '입니다.');
        }

        function buttonClicked() {
            var selectedCountry = document.getElementById("selCountry");
            var selectedValue = selectedCountry.options[selectedCountry.selectedIndex].value;

            $.ajax({
                type:"POST",
                url:"/citylist",
                data: {
                    countryId: selectedValue
                },
                success:(data) => {
                    console.log(data);
                }
            });
        }

        function init() {
            var selectedCountry = document.getElementById("selCountry");
            selectedCountry.selectedIndex = <%=request.getAttribute("countryId")%> - 1;
        }
    </script>
</head>
<body onload="init();">

<%
    List<Country> result = (List<Country>) request.getAttribute("country");
%>
<form action="/countrycity" method="get">
<select id="selCountry" name="countryId" onchange="countryChanged()">
    <%
        for(int i = 0; i < result.size(); i++) {
            out.write("<option value=" + result.get(i).getCountryId() + ">" + result.get(i).getCountry() + "</option>");
        }
    %>
</select>
<button>도시조회</button>
    <%=request.getAttribute("countryId")%>

    <table border="1">
        <tr>
            <th>city id</th>
            <th>city</th>
            <th>last update</th>
        </tr>
    <%
        List<City> result2 = (List<City>) request.getAttribute("city");
        // loop를 돌면서.. 읽어온 city 정보를 tr/td로 그려줘야 함
        for(int i = 0; i <result2.size(); i++) {
    %>
        <tr>
            <td><%=result2.get(i).getCityId()%></td>
            <td><%=result2.get(i).getCity()%></td>
            <td><%=result2.get(i).getLastUpdate()%></td>
        </tr>
    <%
        }
    %>
    </table>
</form>
<br><br>
</body>
</html>
