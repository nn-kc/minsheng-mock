$('.btn').click(function () {
    console.log()
    console.log()
    $.ajax({
        url:"http://localhost:8081/userLogin.do",
        data:{
            "username":$('#username').val(),
            "password":$('#password').val()
        },
        success:function (data) {
            if(data.code=="20000"){
                alert("账号或密码错误")
            }else{
                $.cookie('userId',data.map.success[0].id,{ expires: 7 });
                $.cookie('customeroneId',data.map.success[0].customeroneId,{ expires: 7 });
                location.href="http://localhost:8081/userindex.do"
            }
        }
    })
})