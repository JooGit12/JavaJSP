-- C : insert
-- R : select
------------------------------------------
-- U : update
update 테이블명
set 필드명=값, 필드명=값, ...
where 조건식;
------------------------------------------
-- 새콤달콤시리즈 300원으로
update may04_snack
set s_price = 300
where s_name like '%새콤달콤%';

-- 직원수 제일 적은 회사에서 만든 과자를 0원(상수값)으로
update may04_snack
set s_price = 0
where s_c_name in (
	select c_name
	from may04_company
	where c_emp = (
		select min(c_emp)
		from may04_company
	)
);
-- 직원수 제일 많은 회사에서 만든 과자 양을 10%늘리기
update may04_snack
set s_price = s_price * 1.1
where s_c_name in (
	select c_name
	from may04_company
	where c_emp = (
		select max(c_emp)
		from may04_company
	)
);

-- 제일 비싼 과자 500원 할인
update may04_snack
set s_price = s_price - 500
where s_price = (
	select max(s_price)
	from may04_snack
);
--------------------------------------------
-- D : delete
delete from 테이블명
where 조건식;

-- 0원짜리 삭제
delete from may04_snack
where s_price = 0;

-- 직원수 제일 적은 회사 폐업
delete from may04_company
where c_emp = (
	select max(c_emp)
	from may04_company
);

select * from may04_company;
select * from may04_snack;