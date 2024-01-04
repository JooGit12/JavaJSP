create table may08_gift(
	g_name varchar2(10 char) primary key,
	g_price number(5) not null
);

insert into may08_gift values('테스트', 100);

select * from may08_gift;

update may08_gift
set g_price = g_price + 10
where g_name = '테스트'

delete from may08_gift
where g_name like '%테%'






