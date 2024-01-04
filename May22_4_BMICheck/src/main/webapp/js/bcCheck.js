function bcCheck() {
	var nameField = document.bcForm.n;		var heightField = document.bcForm.h;
	var weightField = document.bcForm.w;	var photoField = document.bcForm.p;
	
	if (isEmpty(nameField)) {
		alert("이름?");		return false;
	}
	if (isEmpty(heightField) || isNotNum(heightField) || heightField.value > 3) {
		alert("키?"); 		return false;
	}
	if (isEmpty(weightField) || isNotNum(weightField)) {
		alert("몸무게?"); 	return false;
	}
	if (isEmpty(photoField)
		|| (isNotType(photoField, "png") && isNotType(photoField, "jpg"))) {
		alert("사진?"); 	return false;
	}
	
	return true;
}