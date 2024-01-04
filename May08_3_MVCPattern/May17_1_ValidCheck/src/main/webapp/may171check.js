function check() {
	var idField = document.f.idd;
	var pwField = document.f.pw;	
	var pwChkField = document.f.pwChk;
	var ageField = document.f.age;
	var photoField = document.f.photo;
	
	if (isEmpty(idField)  || lessThan(idField, 5)  || containsHS(idField)) {
		alert("ID똑바로");		idField.value = "";		idField.focus();
		return false;
	}
	if (isEmpty(pwField) || lessThan(pwField, 5) || notEquals(pwField, pwChkField)
		|| notContains(pwField, "1234567890") || notContains(pwField, "abcd")) {
		alert("PW똑바로");	pwField.value = "";	pwChkField.value = ""; pwField.focus();
		return false;
	}
	
	if (isEmpty(ageField) || isNotNum(ageField)) {
		alert("나이?");	ageField.value = ""; ageField.focus();
		return false;
	}
	
	if (isEmpty(photoField) 
		|| 
		(
			isNotType(photoField, "png") && 
			isNotType(photoField, "jpg") && 
			isNotType(photoField, "gif")
		)
	) {
		alert("프사?");	photoField.value = "";
		return false;
	}
	return true;
}




