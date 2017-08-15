<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加公告</title>
  <style>
    .t{
      margin-left: 30px;
    }
  </style>
</head>
<body>
<form action="/addAnnouncement" method="post">
  公告编号：<input type="text" name="announcementId" ><br><br>
  公告名：<input type="text" name="announcementName"><br><br>
  请输入发布公告的内容：<br><textarea name="announcementContent" rows="10" cols="30" class="t"></textarea> <br><br>
  <input type="submit" name="submit" value="提交">
</form>
</body>
</html>
