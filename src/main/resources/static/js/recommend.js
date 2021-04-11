$(document).ready(function() {
    $("#recommendButton").click(function() {
        $("#recommendResult").empty();

        let urlParams = new URLSearchParams(window.location.search);
        let username = urlParams.get("username");

        $.ajax({
            type : "GET",
            url : "/getRecommendedRestaurant",
            data : {
                username : username
            },
            success : function(result) {
                let text = "Result: " + result.restaurantName;
                $("#recommendResult").append(text);
            },
            error : function () {
                alert("Error!");
            }
        });
    });
});


