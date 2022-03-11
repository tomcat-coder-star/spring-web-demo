<html>
<body>
<h2>Hello World!</h2>
<button onclick="clickBtn()">获取用户</button>
</body>
<script>
    function clickBtn(){
        console.log()
        //创建异步对象
        var xhr = new XMLHttpRequest();
        //设置请求的类型及url
        xhr.open('post', '/getUser' );
        //post请求一定要添加请求头才行不然会报错
        xhr.setRequestHeader("Content-type","application/json");
        //发送请求
        xhr.send();
        xhr.onreadystatechange = function () {
            // 这步为判断服务器是否正确响应
            if (xhr.readyState == 4 && xhr.status == 200) {
                console.log(xhr.responseText);
            }
        };
    }

</script>
</html>
