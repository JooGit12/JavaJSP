function check() {
	var noInput = document.bbForm.no;
	if (isEmpty(noInput) || isNotNum(noInput) || lessThan(noInput, 3)
		|| noInput.value.indexOf("-") != -1
		|| noInput.value.indexOf(".") != -1 
		|| noInput.value[0] == noInput.value[1]
		|| noInput.value[1] == noInput.value[2]
		|| noInput.value[2] == noInput.value[0]) {
		alert("?");
		noInput.value = "";
		noInput.focus();
		return false;
	}
	return true;
}