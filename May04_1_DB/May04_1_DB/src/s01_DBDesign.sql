-- 과자
-- 수원에 있는 오리온 직원 100명
-- 초코파이 5000원 500.5g
create table may04_company(
	c_name varchar2(10 char) primary key,
	c_addr varchar2(10 char) not null,
	c_emp number(3) not null
);

insert into may04_company values('농심', '포천', 190);

create table may04_snack(
	s_no number(3) primary key,
	s_name varchar2(10 char) not null,
	s_price number(4) not null,
	s_weight number(4, 1) not null,
	s_c_name varchar2(10 char) not null
);

create sequence may04_seq;

insert into may04_snack values(may04_seq.nextval, '초코파이녹차', 5700, 450.5, '오리온');

select * from may04_company;
select * from may04_snack;

