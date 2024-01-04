-- RDBMS(Relational DBMS)계열
-- 		OracleDB, MySQL, MariaDB, ...
--		테이블을 나눠서 디자인해놓고
--		테이블간의 관계를 중심으로 풀어나가는
-- NoSQL계열
--		MongoDB, Elasticsearch, ...
-------------------------------------------------
-- DB디자인
-- 1) 한 데이터에는 하나의 정보만
-- 2) 주제별로 테이블을 나누기
-- 3) 테이블 옵션(PK, NN)
-- 4) 테이블간의 관계 파악
-- => 사장님 : 매장 = m : n
-- => 매장 : 메뉴 = 1 : n

-- 식당프랜차이즈
-- 홍길동, 1999-01-01생, 수원에 사는데 : 사장님
-- 김밥천국, 종로점, 종각역, 10테이블 : 매장
-- 야채김밥, 5000원 : 메뉴
-- ...
-------------------------------------
create table may03_ceo(
	c_no number(2) primary key,
	c_name varchar2(10 char) not null,
	c_birth date not null,
	c_home varchar2(10 char) not null
);

insert into may03_ceo values(may03_restaurant_seq.nextval, '고길동', to_date('19950101', 'YYYYMMDD'), '인천');
------------------------------------------------------------------------------------------
create table may03_restaurant(
	r_no number(2) primary key,
	r_name varchar2(10 char) not null,
	r_jijum varchar2(10 char) not null,
	r_addr varchar2(10 char) not null,
	r_table number(2) not null
);

insert into may03_restaurant values(may03_restaurant_seq.nextval, '우동천국', '수원', '수원', 30);
------------------------------------------------------------------------------------------
create table may03_run(
	r_no number(2) primary key,
	r_c_no number(2) not null,
	r_r_no number(2) not null
);
insert into may03_run values(may03_restaurant_seq.nextval, 4, 9);
------------------------------------------------------------------------------------------
create table may03_menu(
	m_no number(2) primary key,
	m_name varchar2(10 char) not null,
	m_price number(5) not null,
	m_r_no number(2) not null
);
insert into may03_menu values(may03_restaurant_seq.nextval, '우동', 5500, 9);
------------------------------------------------------------------------------------------
create sequence may03_restaurant_seq;

select * from may03_ceo;	select * from may03_restaurant;		select * from may03_run;	select * from may03_menu;











