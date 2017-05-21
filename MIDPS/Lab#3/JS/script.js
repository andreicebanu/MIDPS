window.onscroll = changePos;

function changePos(){
	var header = document.getElementById("bar");
	
	if (window.pageYOffset > 70) {
		header.style.position = "absolute";
		header.style.top = pageYOffset + "px";
	} else {
		header.style.position = "";
		header.style.top = "";
	}
}