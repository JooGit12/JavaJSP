function may172check() {
	var xInput = document.ff.xx;
	var yInput = document.ff.yy;
	
	if (isEmpty(xInput)	|| isNotNum(xInput) 
		|| isEmpty(yInput) || isNotNum(yInput)) {
		alert("?");
		xInput.value = "";		yInput.value = "";
		xInput.focus();
		return false;
	}
	
	return true;
}