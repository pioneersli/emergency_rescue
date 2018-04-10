/**
 * Created by xionghy on 2018/4/10.
 */

$(function () {
    var ws = new WebSocket('ws://localhost:8080/websocket');

    ws.onopen = function (evt) {
        console.log("websocket 连接...");
        ws.send("hello,server");
    };

    ws.onmessage = function (evt) {
        console.log("接收数据："+evt.data);
    }

    ws.onclose = function (evt) {
        console.log("websocket 关闭连接！")
    }


});