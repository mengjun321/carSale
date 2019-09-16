<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/11
  Time: 18:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<div class="profile clearfix">

    <div class="profile_pic">
        <img src="../images/img.jpg" alt="..." class="img-circle profile_img">
    </div>
    <div class="profile_info">
        <span>欢迎您,</span>
        <h2>${emp.empName} ！</h2>
    </div>
    <div>&nbsp;&nbsp;&nbsp;&nbsp;${emp.companyId}</div>
    <%--.companyName--%>

</div>