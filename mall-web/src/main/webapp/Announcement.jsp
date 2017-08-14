<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>显示所有公告</title>
</head>
<body>
<div>
 <div class="th w20">公告编号</div>
 <div class="th w20">公告名称</div>
 <div class="th w20">公告内容</div>
</div>
<c:forEach var="announcement" items="${li}">
  <div class="td w20">
      ${announcement.announcementId}
  </div>
  <div class="td w20">
      ${announcement.announcementName}
  </div>
  <div class="td w20">
      ${announcement.announcementContent}
  </div>
</c:forEach>
</body>
</html>
