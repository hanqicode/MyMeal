$(document).ready(function () {
    let urlParams = new URLSearchParams(window.location.search);
    let username = urlParams.get("username");
    $("#greeting").append(username);
});