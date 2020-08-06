$(function () {
    bindEvent();
    $(function () {
        $("#ajax").on("click",function(){
            var user = {
                username:"zhuojianhai",
                password:"123456",
                date:"",
                age:30
            };

            $.ajax({
                // 编写json格式，设置属性和值
                url:"hello/testajax",
                contentType:"application/json;charset=UTF-8",
                data:JSON.stringify(user),
                dataType:"json",
                type:"post",
                success:function(data){
                    // data服务器端响应的json的数据，进行解析
                    alert("响应结果为:"+JSON.stringify(data));
                    // alert(data.username);
                    // alert(data.password);
                    // alert(data.age);
                },
                error:function (errr) {
                    console.log(errr.toLocaleString())
                }
            });
        });
    });
});

function bindEvent(){
    $("#testmethod").on("click",function(){

        load("18","zhuojianhai");
    });
    $("#testmethod1").on("click",function(){

        load("18","zhuojianhai","jiangsu");
    });
}
function load(age,name){
    console.log("load1",age,name);
}

function load(age,name,address){
    console.log("load2",age,name,address);
}