<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>게시판 목록</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/board/style.css">
</head>
<body>
<div class="container">
    <h1>게시판 목록</h1>
    <table>
        <thead>
        <tr>
            <th>ID</th>
            <th>작성자</th>
            <th>제목</th>
            <th>내용</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="board" items="${boards}">
            <tr>
                <td>${board.id}</td>
                <td>${board.writer}</td>
                <td>${board.title}</td>
                <td>${board.content}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
