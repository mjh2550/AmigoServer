<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title><tiles:getAsString name="title" /></title>

    <link rel="stylesheet" type="text/css" href="/css/easyui.css" />
    <link rel="stylesheet" type="text/css" href="/css/icon.css" />
    <link rel="stylesheet" type="text/css" href="/css/jquery-ui.css" />
    <link rel="stylesheet" type="text/css" href="/css/jquery.timepicker.min.css" />
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.css?ver=1" />
    <link rel="stylesheet" type="text/css" href="/css/style.css" />
    <link rel="stylesheet" type="text/css" href="/css/hiveagent.css" />
    <link rel="icon" type="ico" href="/image/favicon.ico" />
    <!-- <link rel="stylesheet" type="text/css" href="/css/docs.min.css" /> -->
    <style>
        .badge1 {
            position:relative;
        }
        .badge1[data-badge]:after {
            content:attr(data-badge);
            position:absolute;
            top:0px;
            right:13px;
            font-size:.7em;
            background:red;
            color:white;
            width:18px;height:18px;
            text-align:center;
            line-height:18px;
            border-radius:50%;
            box-shadow:0 0 1px #333;
        }
        .badge2 {
            position:relative;
        }
        .badge2[data-badge]:after {
            content:attr(data-badge);
            position:absolute;
            top:0px;
            right:13px;
            font-size:.7em;
            background:red;
            color:white;
            width:18px;height:18px;
            text-align:center;
            line-height:18px;
            border-radius:50%;
            box-shadow:0 0 1px #333;
        }
    </style>

    <script type="text/javascript" src="/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="/js/jquery-ui.min.js"></script>
    <script type="text/javascript" src="/js/bootstrap.bundle.min.js"></script>
    <script type="text/javascript" src="/js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/js/datagrid-detailview.js"></script>
    <script type="text/javascript" src="/js/jquery.timepicker.min.js"></script>
    <!-- jquery form -->
    <script type="text/javascript" src="/js/jquery.form.js"></script>

    <!-- common script -->
    <script type="text/javascript" src="/js/common.js"></script>

</head>
<body>
<div id="loadingArea">
    <span id="loadingImage"></span>
</div>
<div class="template main">
    <div class="easyui-layout" style="width:100%;height:100%;">
        <tiles:insertAttribute name="menu"/>
        <div id="container_wrap" data-options="region:'center'" style="width:100%;height:100%;">
            <tiles:insertAttribute name="header"/>
            <tiles:insertAttribute name="body"/>
        </div>
    </div>
</div>
</body>
</html>