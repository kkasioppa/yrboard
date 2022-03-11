<%--
  Created by IntelliJ IDEA.
  User: gomiyell
  Date: 2022-03-11
  Time: 오전 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script>
        function buttonClicked() {
            console.log("클릭됐어요");
            $.ajax({
                type:"GET",
                url:"/aaa" ,
                success:(data) => {
                    console.log(data);
                }
            });
        }
    </script>
</head>

<body>
    <form action="/aaa" method="get">
        <input type="text" name="text">
        <button >버튼</button>
        <br><br>
        <%=request.getAttribute("text")%>
    </form>
</body>
</html>
