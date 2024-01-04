-- 원래 DBA가 SQLPlus로 할 작업인데

-- 우리 입장에서는 
-- 어차피 Java기반으로 뭐 만들거고, SQLPlus가 불편하고
-- => EclipseIDE로 하자

-- 한솥도시락종로관철동점, 2000/01/01에 생긴, 종로12길 10, 빅치킨마요, 4300원
-- 샤오바오우육면, 2002/02/02에 생긴, 삼일대로17길 15, 우육면, 9500원

create table may09_restaurant(
	r_name varchar2(20 char) primary key,
	r_start date not null,
	r_addr varchar2(20 char) not null
);

insert into may09_restaurant 
values('한솥종로관철동점', to_date('20000101', 'YYYYMMDD'), '종로12길 10');

create table may09_menu(
	m_no number(3) primary key,
	m_name varchar2(10 char) not null,
	m_price number(5) not null,
	m_r_name varchar2(20 char) not null,
	constraint may09_restaurant_menu
		foreign key(m_r_name) 
		references may09_restaurant(r_name) 
		on delete cascade
);

create sequence may09_menu_seq;

insert into may09_menu values(may09_menu_seq.nextval, '양념치킨', 20000, '자담치킨서울종로점');

select * from may09_restaurant;

select * 
from may09_menu 
order by m_r_name, m_name;

-- 여태했던 작업 DB서버에 실제 반영
commit
-- 여태했던거 취소
rollback
-- EclipseIDE가 자동commit, 가끔 안되는 버그


select count(*)
from may09_menu;

-- 6번부터 10번까지
select *
from (
	select rownum as rn, m_no, m_name, m_price, m_r_name
	from (
		select *
		from may09_menu 
		order by m_r_name, m_name
	)
)
where rn >= 6 and rn <= 10

select *
from (
	select rownum as rn, r_name, r_start, r_addr
	from (
		select * 
		from may09_restaurant
		order by r_name
	)
)
where rn >= 3 and rn <= 5












