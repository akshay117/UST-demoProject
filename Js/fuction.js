function fn(a,b){
	return a+b 
}
console.log(cartTotalValue);

function cartTotalValue(){   //ARGUMENTS
	console.log(arguments);
	var total = 0;
	for(n of arguments){
		total+=n;
	}
	return total;
}

//ARROW fUNCTIONS

function fold(){
	console.log("old function")
}

var fnew = () => {
	console.log("NEW function")
}

var fnew1 = (name) => "NEW1 " + name + " function" //Another Way


const tools = ["js","java","spring"];
console.log(tools);
tools.push("API")

tools.forEach(tool => console.log(tool)); //ITERATING "TOOLS "array with Arrow function and for each loop.
	


