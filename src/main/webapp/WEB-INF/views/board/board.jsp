<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<meta charset="UTF-8">
<title>Board List</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/base.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">

<html lang="en" >
<head>
    <!--리소스-->
    <th:block th:replace="layout/main_header :: mainHead"/>

    <!--네비 바-->
    <th:block th:replace="nav/topNav :: top_nav" />

    <script type="text/javascript" src="/res/custom/js/board.js"></script>

    <title>board</title>
</head>

<body>
<div class="container">

    <table class="table table-bordered">
        <thead>
        <input type="text" id="searchWord" ></input>
        <button id="go" onclick="goList(1)" >가자 시bar</button>
        <tr>
            <td >번호</td>
            <td >제목</td>
            <td >작성자</td>
            <td >조회수</td>
            <td >날짜</td>
            <td >공지여부</td>
        </tr>
        </thead>
        <tbody id="resultList">
        <tr th:each="VO : ${boardList}">
            <td th:text="${VO.board_idx}"></td>
            <td th:text="${VO.board_title}"></td>
            <td th:text="${VO.insert_user}"></td>
            <td th:text="${VO.read_count}"></td>
            <td th:text="${VO.insert_time}"></td>
            <td th:text="${VO.notice_flag}"></td>
        </tr>
        </tbody>
        <tfoot>

        </tfoot>
    </table>
</div>


</body>
</html>