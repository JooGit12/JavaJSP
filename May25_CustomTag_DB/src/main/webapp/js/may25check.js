function jstlcCheck() {
	var nInput = document.jstlcForm.n;

	if (isEmpty(nInput) || isNotNum(nInput)) {
		alert("?");
		return false;
	} 
	return true;
}