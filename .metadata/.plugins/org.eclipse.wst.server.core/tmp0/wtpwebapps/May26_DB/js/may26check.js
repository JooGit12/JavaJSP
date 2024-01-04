function bbsWriteCheck() {
	var titleField = document.bbsWriteForm.title;
	var txtField = document.bbsWriteForm.txt;

	if (isEmpty(titleField) || isEmpty(txtField)) {
		alert("?");
		titleField.value = "";
		txtField.value = "";
		titleField.focus();
		return false;
	}
	return true;
}