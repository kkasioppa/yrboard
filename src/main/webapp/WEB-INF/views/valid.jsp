<%--
  Created by IntelliJ IDEA.
  User: kkasioppa
  Date: 2022-03-08
  Time: 오후 12:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        /*.login {*/
        /*    width: 500px;*/
        /*    margin: 200px auto auto auto;*/
        /*    text-align: center;*/
        /*}*/
        td {
            padding-right: 20px;
        }
    </style>

    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script>
        function handleValidClicked() {
            console.log("클릭됐어요");

            $.ajax({
                type:"GET",
                url:"/dovalidate?user=" +  $('#user').val(),
                success:(data) => {
                    console.log(data);
                    //$('#result').html(data);
                    $('#result').val(data);
                }
            });
        }
    </script>
</head>
<body>
<table border="0">
    <tr>
        <td>아이디</td>
        <td><input id="user"></td>
    </tr>
<%--    <tr>--%>
<%--        <td>비밀번호</td>--%>
<%--        <td><input text="password"></td>--%>
<%--    </tr>--%>

    <tr>
        <td>그놈아는...</td>
        <td><input id="result"></td>
    </tr>
    <tr>
        <td></td>
        <td><button onclick="handleValidClicked()">인성무엇?</button></td>
    </tr>
</table>
</body>
</html>
