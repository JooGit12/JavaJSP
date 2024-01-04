-- 테이블 만들기
create table 테이블명 (
	열제목 자료형 [옵션],
	필드명 자료형 [옵션],
	...
);
------------------------------------------------------
-- 테이블 수정 - 실전에는 없는 작업
--		SQL이 알고싶으면 찾아보면 있기는 한데
---------------------------------------------
-- 테이블 삭제
drop table 테이블명 cascade constraint purge;
drop table may03_student cascade constraint purge;
---------------------------------------------
-- 옵션
--		not null : 데이터를 안넣지 못하게
--		primary key : not null + 중복데이터 못넣게
--			어떤 데이터의 대표값
--			나중에 검색할때 정확한 데이터를 찾을 수 있음
--			-> 어떤 테이블에는 PK가 꼭 있도록
------------------------------------------------
-- 데이터 만들기 : C
insert into 테이블명(필드명, 필드명, ...)
values(값, 값, ...);

insert into 테이블명 values(값, 값, ...);
------------------------------------------------
-- 날짜/시간
--	sysdate : 현재시간날짜
--	특정시간날짜
--		1) Java/Python에서 Date객체
--		2) to_date('날짜', '패턴') : 글자 -> 날짜

-- YYYY
-- MM : 월
-- DD
-- AM/PM
-- HH : 12시간제
-- HH24 : 24시간제
-- MI : 분
-- SS
-----------------------------------------------------
-- 그래서 뭐...
insert into may02_snack(s_price, s_name)
values(500, '새콤달콤');

-- 값이 0이면 계산이 되는데
-- 값이 없으면 계산 불가능
-- ...
insert into may02_snack(s_name)
values('빼빼로');

insert into may02_snack values('새우깡', 4000);
-------------------------------------------------
create table may03_coffee(
	c_name varchar2(10 char) primary key,
	c_price number(5) not null
);

insert into may03_coffee(c_name) values('아메리카노'); -- x

insert into may03_coffee values('아메리카노', 4000);
insert into may03_coffee values('아메리카노', 5000); -- x
insert into may03_coffee values('라떼', 5000);
insert into may03_coffee values('녹차라떼', 5000);

-- 5000원짜리가 뭐? -> 라떼/녹차라떼/...
-- 아메리카노 얼마? -> 4000

select * from may03_coffee;
-- 이름/나이/국/영/수 중에 PK로 쓸만한게 없어서
-- 번호 필드를 추가해서 PK로
-- -> 번호는 자동으로 올라갔으면...(Java때 팩토리패턴)
-- MySQL/MariaDB에는 autoincrement옵션이 있는데
-------------------------------------------
-- 시퀀스 만들기
create sequence 시퀀스명;

-- 시퀀스 삭제
drop sequence 시퀀스명

-- 시퀀스 사용(insert때)
시퀀스명.nextval

-- insert실패해도 올라감
-- 여러 테이블이 같이 사용할 수 있음
-- 내가 3번인데, 2번학생 전학가면 내가 2번이 되나?
-- -> 12345아님(행번호가 아님)
--------------------------------------------
create table may03_student(
	s_no number(2) primary key,
	s_name varchar2(10 char) not null,
	s_age number(3) not null,
	s_kor number(3) not null,
	s_eng number(3) not null,
	s_mat number(3) not null
);

insert into may03_student 
values(may03_student_seq.nextval, '홍길동', 20, 100, 90, 90);

insert into may03_student 
values(may03_student_seq.nextval, '홍길동', 23, 10, 0, 90);

insert into may03_student 
values(may03_student_seq.nextval, '김길동', 23, 0, 100, 9);

insert into may03_student 
values(may03_student_seq.nextval, '김길동', 2312312312132, 0, 100, 9);

insert into may03_student 
values(may03_student_seq.nextval, '최길동', 22, 0, 10, 9);
insert into may03_student 
values(may03_student_seq.nextval, '구길동', 33, 32, 65, 55);

select * from may03_student;
---------------------------------------------------------------
create table may03_snack(
	s_no number(2) primary key,
	s_name varchar2(10 char) not null,
	s_price number(5) not null,
	s_weight number(4, 1) not null,
	s_exp date not null
);
create sequence may03_snack_seq;

insert into may03_snack 
values(may03_snack_seq.nextval, 
'초코파이', 6000, 500.1, sysdate);

insert into may03_snack 
values(may03_snack_seq.nextval, 
'초코파이', 5500, 550.1, 
to_date('20230601', 'YYYYMMDD'));

insert into may03_snack 
values(may03_snack_seq.nextval, 
'초코칩', 5500, 550.1, 
to_date('20230601 1300', 'YYYYMMDD HH24MI'));

insert into may03_snack 
values(may03_snack_seq.nextval, 
'포스틱', 4300, 350.1, 
to_date('20230501 오후 0100', 'YYYYMMDD PM HHMI'));

select * from may03_snack;