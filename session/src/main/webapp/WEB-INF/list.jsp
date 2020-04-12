<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
<script>
    //设置默认值
    window.onload = function (){
        for(var i = 0;i<document.getElementById("selSex").options.length;i++){
            var option = document.getElementById("selSex").options[i];
            if(option.value == "${sex}"){
                option.selected = true;
            }
        }
    }

    function search(){
        var userName = document.getElementById("txtUserName").value;
        var sex = "";
        for(var i = 0;i<document.getElementById("selSex").options.length;i++){
            if(document.getElementById("selSex").options[i].selected){
                sex = document.getElementById("selSex").options[i].value;
            }
        }
        location.href='userList?userName='+userName+"&sex="+sex;
    }
</script>
<table>
    <tr>
        <th>用户ID</th>
        <th>用户名</th>
        <th>用户密码</th>
        <th>用户年龄</th>
        <th>用户性别</th>
        <th>操作</th>
    </tr>
    <%
        if (request.getAttribute("userList") != null) {
    %>
    <%for (User u : (List<User>) request.getAttribute("userList")) {%>
    <tr>
        <td><%=u.getUserId()%>
        </td>
        <td><%=u.getUserName()%>
        </td>
        <td><%=u.getPassWord()%>
        </td>
        <td><%=u.getAge()%>
        </td>
        <td><%=u.getSex()%>
        </td>
        <td>
            <a href="updateUser?userId=<%=u.getUserId()%>">修改</a>
            <a href="deleteUser?userId=<%=u.getUserId()%>">删除</a>
        </td>
    </tr>
    <%}%>
    <%}%>
</table>
</body>
</html>