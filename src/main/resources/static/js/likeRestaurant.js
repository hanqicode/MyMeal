$(document).ready(function() {
    $("#likeRestaurantButton").click(function() {
        let urlParams = new URLSearchParams(window.location.search);
        let username = urlParams.get("username");
        let restaurantName = $("#restaurantName").val();

        $.ajax({
            type : "GET",
            url : "/likeRestaurant",
            data : {
                username : username,
                restaurant_name : restaurantName
            },
            success : function(result) {
                if (result) {
                    $("#restaurantName").val("");
                    alert("Saved!");
                } else {
                    alert("Restaurant is not registered!");
                }
            },
            error : function () {
                alert("Error!");
            }
        });
    });
});


