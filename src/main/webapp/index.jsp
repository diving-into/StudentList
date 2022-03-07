<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: 繁花fancy
  Date: 2022/3/5
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>查询界面</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="js/jquery-3.6.0.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <style>
        #title {
            height: 100px;
            width: 1000px;
            margin: 60px auto;
            color: rgb(205, 156, 50);
            background-color: #e8eb2649;
            text-align: center;
            border-radius: 10px;
        }

        #list {
            height: 50px;
            width: 300px;
            margin: 60px auto;
        }
        #btn {
            height: 50px;
            width: 100px;
            position: absolute;
            left:1120px;
            top:280px;
        }
        #table {
            width : 1200px;
            margin : 0px auto;
        }
    </style>
    <script>
        $(function(){
            $("#btn").click(function (){
                $.ajax({
                    url:"/MyWeb/show.action",
                    type:"GET",
                    dataTyp:"json",
                    data:{"sbatch":$("select").val()},
                    success:function(students){
                         $("#table").load("http://localhost:8080/MyWeb/index.jsp #table");
                    }
                })

            })

        })
    </script>
</head>

<body>
    <div id="title" class="container">
        <h1>查询班级学生列表</h1>
    </div>
    <hr>
    <select id="list" class="form-control">
        <option selected="selected">请选择班级</option>
        <option>20软件J01</option>
        <option>20软件BD01</option>
        <option>20软件BD02</option>
        <option>20软件BD03</option>
    </select>
   <button id="btn" class="btn btn-danger" >查询</button>
   <table id="table" class="table table-bordered table-striped">
       <tr>
           <th>学号</th>
           <th>姓名</th>
           <th>密码</th>
           <th>性别</th>
           <th>班级</th>
       </tr>
       <%

       %>
       <c:forEach items="${students}" var="stu">
        <tr>
           <td>${stu.sid}</td>
           <td>${stu.sname}</td>
           <td>${stu.spassword}</td>
           <td>${stu.sgender}</td>
           <td>${stu.sbatch}</td>
        </tr>
       </c:forEach>
   </table>
</body>

</html>