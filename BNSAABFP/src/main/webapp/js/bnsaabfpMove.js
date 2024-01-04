function bye() {
	var really = prompt("진짜 탈퇴할거면 ㅌㅌ라고 입력하시오.");
	if (really == "ㅌㅌ") {
		location.href = "ByeController";
	}
}

function snsPageChange(p) {
	location.href = "SNSPageController?p=" + p;
}

function snsMsgDelete(no) {
	var really = confirm("진짜?");
	if (really) {
		location.href = "SNSDeleteController?no=" + no;
	}
}

function snsMsgUpdate(no, txt, p) {
	txt = prompt("수정할 내용", txt);
	if (txt != null && txt.length > 0 && txt.length < 450) {
		location.href = "SNSUpdateController?no=" + no + "&txt=" + txt + "&p=" + p;
	}
}

function snsReplyDelete(no, p) {
	var really = confirm("진짜?");
	if (really) {
		location.href = "SNSReplyDeleteController?no=" + no + "&p=" + p;
	}
}











