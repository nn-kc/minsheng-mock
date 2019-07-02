$(function () {
    var id=$.cookie('userId');
    if(id==undefined||id=="0    "||id==null){
        // alert("请先登录");
        location.href="http://localhost:8081/login.do"
    }
    $('#btnLogout').click(function () {
        location.href="http://localhost:8081/login.do"
    })
})