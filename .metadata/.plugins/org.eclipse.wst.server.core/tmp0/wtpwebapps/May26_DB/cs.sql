create table may26_bbs(
	b_no number(3) primary key,
	b_title varchar2(100 char) not null,
	b_txt varchar2(300 char) not null,
	b_date date not null
);

create sequence may26_bbs_seq;

insert into may26_bbs 
values(may26_bbs_seq.nextval, '테스트', '테스트트트', sysdate);

select *
from (
	select rownum as rn, b_no, b_title, b_date
	from (
		select b_no, b_title, b_date 
		from may26_bbs
		order by b_date desc
	)
)
where rn >= 2 and rn <= 5;








