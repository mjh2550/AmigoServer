<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
    #header-btn01{
        width:80px;
        margin-top:0.8%;
        font-weight:bold;
        text-decoration:none;
        display:inline;
        float:right;
        background:#fff;
        color:black;
        text-align:center;
        margin-top:8px;
    }
</style>
<script>
    $(document).ready(function() {
        $("#pwdSaveBtn").click(function(e){
            if ($("#chg_password").val() == "") {
                $.messager.show({title:'안내 메세지', msg:'패스워드를 입력하세요'});
                return false;
            }else if ($("#chg_password_check").val() == "") {
                $.messager.show({title:'안내 메세지', msg:'확인 패스워드를 입력하세요'});
                return false;
            }else if(passwordValidation($("#chg_password").val())=='false'){
                $.messager.show({title:'안내 메세지', msg:'비밀 번호 양식에 어긋났습니다. \n 8자이상, 대소문자, 특수문자가 포함되어야 합니다.'});
                return false;
            }
            if ($("#chg_password").val() != $("#chg_password_check").val()) {
                $.messager.show({title:'안내 메세지', msg:'변경할 패스워드가 일치하지 않습니다.'});
                return false;
            }
            var data = $("#chgPwdForm").serializeObject();

            $.ajax({
                url: "/configuration/user/changePassword",
                contentType : "application/json",
                data : JSON.stringify(data),
                type : "POST",
                success : function(result) {
                    if (result == "success") {
                        $.messager.show({
                            title:'안내 메세지',
                            msg:'패스워드 변경을 성공했습니다.'
                        });
                    }
                    else {
                        $.messager.show({
                            title:'안내 메세지',
                            msg:result
                        });
                    }
                }
            });
            $('#changePasswordModal').dialog('close');
        });
    });
    function passwordValidation(password) {
        var res;
        if (password.match(/[a-z]/g) && password.match(
            /[A-Z]/g) && password.match(
            /[0-9]/g) && password.match(
            /[^a-zA-Z\d]/g) && password.length >= 8)
            return "true";
        else
            return "false";
    }
    function pwdChange(){
        //console.log("id = "+${userInfo.username});
        //var username = ${userInfo.username};
        //$('#userId').val(username);
        $('#changePasswordModal').dialog('open');
    }
</script>

<div>
    <div class="header-menu">
        <p>
            <a id="header-home">Home</a>
            <a id="header-user">${userInfo.username}</a>
            <!-- <a id="header-btn" href="javascript:pwdChange()">패스워드 변경</a> -->
            <a id="header-btn02" class="" href="/logout">Logout</a>
        </p>
    </div>
    <div class="nav-title-Wrap">
        <h3 id="nav-title" style="color:#fff;">${currMenu.name}</h3>
        <div id="nav-menu" style="color:#fff; padding-left:10px;">
        </div>
    </div>
</div>