function handleAjax(url, callback, method, title, el){
    var http = new XMLHttpRequest();
    http.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
          callback(this.responseText, title, el);
        }
    };
    http.open(method, url );
    http.send()
}

function processProducts(data, title, el){
    var proEl = document.getElementById(el);
	var output = "<h1 class='product-title'>"+ title +"<h1>";

    var dataObj = JSON.parse(data)

	for(product of dataObj){
		
		output += "<div class='prod'>" +
						"<img class='img' src='"+product.image+"'>"+
						"<h3 class='title'>"+product.title+"</h3>"+
                        "<div class='cat'>"+product.category+"</div>"+
                        "<div class='cat'>"+product.description+"</div>"+
						"<div class='price'>$"+product.price+"</div>" +
			      "</div>";
	}
	output += "<div class='clear'></div>"

	proEl.innerHTML = output;
}

var btn = document.getElementById("log");

btn.addEventListener("click", function(){
    var api = "https://fakestoreapi.com/products/";
	handleAjax(api, processProducts, "GET", "PRODUCTS", "products");
})