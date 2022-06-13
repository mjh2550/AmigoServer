<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
    <title><tiles:getAsString name="title" /></title>

    <link rel="stylesheet" type="text/css" href="/css/style.css" />
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.css?ver=1" />
    <link rel="icon" type="ico" href="/image/favicon.ico" />
    <link rel="stylesheet" type="text/css" href="/css/easyui.css" />

    <script type="text/javascript" src="/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="/js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/js/common.js"></script>
    <style>
        .main {
            background: url('/image/login-screen-background.png');
            witdh:100%;
            position: absolute;
        }
    </style>
</head>
<body>
<div class="template main">
    <tiles:insertAttribute name="body" />
</div>
</body>
</html>