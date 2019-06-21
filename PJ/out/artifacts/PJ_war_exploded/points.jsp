<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page import="domain.*" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/7/28
  Time: 22:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String error = ((String)session.getAttribute("error") == null) ? "" : (String)session.getAttribute("error");
    domain.user user= new user();
    user =(domain.user)session.getAttribute("user");
    String choose = (String)session.getAttribute("choose");
    course course = (course)session.getAttribute("course");
    List<unit> unitList = (List<unit>)session.getAttribute("unit");
    Map<Integer, List<knowledge>> knowledges = (Map<Integer, List<knowledge>>) session.getAttribute("knowledge");
    int cellID = Integer.parseInt(request.getParameter("cellID"));
    int unitID = Integer.parseInt(request.getParameter("unitID"));
    List<knowledge> knowledgeList = knowledges.get(unitID) ;
    knowledge knowledge = new knowledge();
    for (knowledge k:knowledgeList
         ) {
        if(k.getCellID() == cellID){
            knowledge=k;
        }
    }
    if(session.getAttribute("user") != null){
        user = (domain.user)session.getAttribute("user");
    }

%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>课程详情</title>
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <link href="//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/all.css">
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<%
    if(!error.isEmpty()){
%>
<script>
    alert("<%=error%>");
</script>
<%
        session.removeAttribute("error");
    }
%>
<header>
    <div id="sign">
        <%if(session.getAttribute("user") == null){%>
        <a href="#" class="col-lg-2" data-toggle="modal" data-target="#registerModal"><h1>注册</h1></a>
        <a href="#" class="col-lg-2" data-toggle="modal" data-target="#loginModal"><h1>登录</h1></a>
        <%}else {%>
        <a href="/myspace?state=1" class="col-lg-2" ><h1><%=user.getUsername()%></h1></a>
        <a href="/out" class="col-lg-2"><h1>登出</h1></a>
        <%}%>
    </div>
    <form action="sbn" method="post">
        <div class="container">
            <div class="row">
                <a href="/home" class="col-lg-2"><h1>首页</h1></a>
                <p class="col-lg-5"></p>
            </div>
            <div class="row">
                <ul id="nav" class="col-lg-10">
                    <li><a href="/course?courseID=<%=course.getCourseID()%>" style="color: aqua">详情</a></li>
                    <%if(session.getAttribute("user") != null && (choose.equals("false")||user.getUID() == course.getUID())){%>
                    <li><a href="/resource?courseID=<%=course.getCourseID()%>">资源</a></li>
                    <li><a href="/homework?courseID=<%=course.getCourseID()%>">作业</a></li>
                    <%}else{%>
                    <li><a href="#" aria-disabled="true" style="color: gray">资源</a></li>
                    <li><a href="#" aria-disabled="true" style="color: gray">作业</a></li>
                    <%}%>
                </ul>
            </div>
        </div>
    </form>

    <!-- Modal -->
    <div class="modal fade" id="loginModal" tabindex="-1" role="dialog" aria-labelledby="loginModalCenterTitle" aria-hidden="true">
        <div class="modal-dialog modal-dialog-centered" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="loginModalLongTitle">登录</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">

                    <form>
                        <div class="form-group row">
                            <label for="username" class="col-sm-2 col-form-label">用户名</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="username" placeholder="User Name">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="password" class="col-sm-2 col-form-label">密码</label>
                            <div class="col-sm-10">
                                <input type="password" class="form-control" id="password" placeholder="Password">
                            </div>
                        </div>
                    </form>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
                    <button id="login_in" type="button" class="btn btn-primary">登录</button>
                </div>
            </div>
        </div>
    </div>
    <div class="modal fade" id="registerModal" tabindex="-1" role="dialog" aria-labelledby="registerModalCenterTitle" aria-hidden="true">
        <div class="modal-dialog modal-dialog-centered" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="registerModalLongTitle">注册</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">

                    <form>
                        <div class="form-group row">
                            <label for="username" class="col-sm-3 col-form-label">用户名</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="reg-username" placeholder="请输入用户名">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="password" class="col-sm-3 col-form-label">密码</label>
                            <div class="col-sm-9">
                                <input type="password" class="form-control" id="reg-password" placeholder="请输入密码，密码至少为6位且不全为数字">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="password" class="col-sm-3 col-form-label">确认密码</label>
                            <div class="col-sm-9">
                                <input type="password" class="form-control" id="check-password" placeholder="请重新输入密码">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="password" class="col-sm-3 col-form-label">邮箱</label>
                            <div class="col-sm-9">
                                <input type="email" class="form-control" id="reg-email" placeholder="请输入邮箱">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="password" class="col-sm-3 col-form-label">验证邮箱</label>
                            <button id="get-verify" type="button" class="btn btn-primary">获得验证码</button>
                            <div class="col-sm-9">
                                <input type="email" class="form-control" id="reg-verify" placeholder="请输入验证码">
                            </div>
                        </div>
                    </form>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
                    <button id="register" type="button" class="btn btn-primary">注册</button>
                </div>
            </div>
        </div>
    </div>
</header>
<div class="container" style="padding: 10px;">

    <h3><span class="badge badge-secondary"><%=course.getCourseName()%></span></h3>
    <div class="row" style="margin-top: 10px;">
        <div class="col-8">
            <div>
                <div class="card">
                    <div class="card-header">
                        <h5 class="mb-0">
                            <%=knowledge.getCellName()%>
                        </h5>
                    </div>
                    <div class="collapse show" aria-labelledby="heading2" data-parent="#accordion">
                        <div class="card-body">
                            <ul class="list-group list-group-flush">


                                <li class="list-group-item list-group-item-action">
                                    <p>知识点概述</p>
                                    <%if(knowledge.getDiscription()!=null){%>
                                    <p><%=knowledge.getDiscription()%></p>
                                        <%}
                                        else {
                                        %>
                                    <p>该内容不存在</p>
                                    <%
                                    }%>
                                </li>
                                <li class="list-group-item list-group-item-action">
                                    <p>资源学习</p>
                                    <%if(knowledge.getPath() == null) {
                                        out.print("<P>该内容不存在</P>");
                                    }else {
                                        String fileExtName = knowledge.getPath().substring(knowledge.getPath().lastIndexOf(".")+1);
                                        String path = "/knowledge/" + knowledge.getPath();
                                        if(fileExtName.equals("pdf")){
                                            %><iframe width="640" height="480" src="<%=path%>"></iframe><%
                                        }else{%>
                                    <video width="640" height="480" controls="controls">
                                        <source src="<%=path%>">
                                    </video>
                                    <%
                                        }
                                        %>

                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="col-1">
        </div>

        <div class="col-3">
            <div id="accordion">


                <!--对章节循环-->

                <% for (unit e:unitList
                    ) {%>
                <div class="card">
                    <div class="card-header" id="heading37">
                        <h5 class="mb-0">
                            <%=e.getUnitName()%>
                        </h5>
                    </div>
                    <div class="collapse show" aria-labelledby="heading1" data-parent="#accordion">
                        <div class="card-body">
                            <ul class="list-group list-group-flush">
                                <!-- 对章节知识点循环 -->
                                <%
                                    for (Map.Entry<Integer, List<knowledge>> entry: knowledges.entrySet()) {
                                        if(entry.getKey() == e.getUnitID()){
                                            for(knowledge k : entry.getValue()){%>
                                <li class="list-group-item list-group-item-action">
                                    <a href="/knowledge?cellID=<%=k.getCellID()%>&unitID=<%=e.getUnitID()%>"><%=k.getCellName()%></a>
                                    <%}%>
                                </li>
                                <%}}%>
                            </ul>
                        </div>
                    </div>
                </div>

                <%} }%>

            </div>
        </div>
    </div>

</div>
<script src="js/MD5.js"></script>
<script src="js/register.js"></script>
<script src="js/login.js"></script>
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.bootcss.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
