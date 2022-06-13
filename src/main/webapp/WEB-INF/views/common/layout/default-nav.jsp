<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript">
    var currHrMenuId = "${currMenu.hrMenuId}";
    $(document).ready(function() {
        $(".nav-left").click(function(e){
            $("#nav-wrap ul").css("color", "black");
            $("#nav-wrap div").hide(500);

            var target = $(this).children(":first");
            if(target.is(":visible")){
                target.hide(500);
                $(e.target).css("color", "black");
            }else{
                target.show(500);
                $(e.target).css("color", "black");
            }
        });


        $("ul.nav-left").each(function(i, item){
            if($(item).data().id == currHrMenuId){
                $(item).click();
            }
        });
        //$('div.panel-title:contains("Damda Connector")').text('').parent().css({cursor: 'pointer',background: 'url(/image/damda_logo_5th-02.jpg) no-repeat', 'background-size': '100% 100%'});
    });
    function leftMovePage(url) {
        /* if(url === '/business/gui') {
            window.open(url);
        } else {
            location.href = url;
        } */
        location.href = url;
    }
</script>
<style>
    .nav-left{color:black;cursor:pointer;}
    .nav-left:hover{color:black}
    .main_menu:link  { color: black; text-decoration:none }
    .main_menu:visited  { color: black; text-decoration:none }
    .main_menu:hover  { font-weight: bold; text-decoration:none;}
</style>

<div id="nav-wrap" data-options="region:'west'" title="Damda Connector">
    <c:forEach var="item" items="${menu.menuList1}" varStatus="status">
        <ul class="nav-left" data-id="${item.id}">
            <c:choose>
                <c:when test="${not empty item.link}">
                    <a class="main_menu" href="${item.link}">${item.name}</a>
                </c:when>
                <c:otherwise>${item.name}</c:otherwise>
            </c:choose>
            <div style="display:none;">
                <c:forEach var="item2" items="${menu.menuList2}" varStatus="status">
                    <c:if test="${item.id eq item2.hrMenuId}">
                        <c:if test="${item2.name eq currMenu.name}">
                            <li style="width:100%; background:#00a6ec;" data-id="${item2.id}"><a style="color:#4066c5; padding-left:5%;"class="main_menu" href="javascript:leftMovePage('${item2.link}')">- ${item2.name}</a></li>
                        </c:if>
                        <c:if test="${item2.name ne currMenu.name}">
                            <li style="width:100%;" data-id="${item2.id}"><a style="padding-left:5%;"class="main_menu" href="javascript:leftMovePage('${item2.link}')">- ${item2.name}</a></li>
                        </c:if>
                    </c:if>
                </c:forEach>
            </div>
        </ul>
    </c:forEach>
</div>