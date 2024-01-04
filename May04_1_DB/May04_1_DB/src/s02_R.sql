-- 데이터 읽기 : R
select 필드명, 필드명 as 별칭, 연산자, 통계함수, ...
from 테이블명, 테이블명, ...
where 조건식
group by 필드명, 필드명, ...
having 조건식
order by 필드명 [desc], 필드명, ...;
------------------------------------------------------
-- 실전에서 
--		전체조회라는건 있을수가 없고(10TB를 언제 다 받아오나)
--		필요하지도 않음 -> 페이지 나눠서 10개만 필요하지
------------------------------------------------------
-- rownum
--		select할때마다 부여되는 가상필드
--		*랑은 같이 못씀
--		order by보다 먼저
--		1번부터 조회해야
------------------------------------------------------
-- 전체 과자 이름, 가격, g당 가격
-- 을 가격순 -> 이름순
select s_name, s_price, s_price / s_weight
from may04_snack
order by s_price, s_name;

-- 평균가보다 싼 과자를 파는 회사이름, 위치, 직원수
-- 를 직원 많은 순
select *
from may04_company
where c_name in (
	select s_c_name
	from may04_snack
	where s_price < (
		select avg(s_price)
		from may04_snack
	)
)
order by c_emp desc;

-- 직원수 가장 많은 회사의 
-- 회사이름, 직원수, 과자이름, 가격
-- 을 회사이름 -> 과자이름
select c_name, c_emp, s_name, s_price
from may04_company, may04_snack
where c_name = s_c_name and c_emp = (
	select max(c_emp)
	from may04_company
)
order by c_name, s_name;

-- 사장이름, 생일
-- 생일 날짜순으로 정렬
select c_name, c_birth
from may03_ceo
order by c_birth;

-- 과자이름, 가격
-- 이름순
-- 4 ~ 6번만 
-- select s_no, s_name, s_price
-- from may03_snack
-- where s_no >= 4 and s_no <= 6
-- order by s_name;
-------------------------------------------------------------
select *
from (
	select rownum as rn, s_no, s_name, s_price, s_weight, s_c_name
	from (
		select *
		from may04_snack
		order by s_name
	)
)
where rn >= 4 and rn <= 6;

-- 평균가보다 비싼 과자
-- 회사이름, 위치, 과자이름, 가격
-- 회사이름순 -> 과자이름순
-- 2 ~ 4번까지
select *
from (
	select rownum as rn, c_name, c_addr, s_name, s_price 
	from (
		select c_name, c_addr, s_name, s_price
		from may04_company, may04_snack
		where c_name = s_c_name and s_price > (
			select avg(s_price)
			from may04_snack
		)
		order by c_name, s_name
	)
)
where rn >= 2 and rn <= 4;

-- 회사별 평균가
select s_c_name, avg(s_price)
from may04_snack
group by s_c_name;

-- 지역별 최고가
select c_addr, max(s_price)
from may04_company, may04_snack
where c_name = s_c_name
group by c_addr;

-- 사장님별 -> 매장별 메뉴 평균가
select c_name, r_name, avg(m_price)
from may03_ceo, may03_run, may03_restaurant, may03_menu
where c_no = r_c_no
	and r_r_no = may03_restaurant.r_no
	and r_r_no = m_r_no
group by c_name, r_name
order by c_name, r_name;

-- 회사별 과자 평균가
-- 근데 평균가 구할때 4000원 안되는과자는 빼고 구하는걸로
-- 통계 낼 때 데이터를 필터링해서
select s_c_name, avg(s_price)
from may04_snack
where s_price >= 4000
group by s_c_name;

-- 회사별 과자 평균가
-- 그렇게 구해서 평균가가 4000원 안되는거는 안 볼래
-- 통계 내놓고 그 결과를 필터링
select s_c_name, avg(s_price)
from may04_snack
group by s_c_name
having avg(s_price) >= 4000;

-- 사장이름별 -> 식당별 메뉴 갯수
-- 평균가보다 비싼거 빼고 갯수 세는걸로
-- 세어서, 갯수가 2개 안되는거는 안나오게
-- 사장이름별 -> 식당별 정렬해서
select c_name, r_name, count(*)
from may03_ceo, may03_run, may03_restaurant, may03_menu
where c_no = r_c_no
	and r_r_no = may03_restaurant.r_no
	and r_r_no = m_r_no
	and m_price <= (
		select avg(m_price)
		from may03_menu
	)
group by c_name, r_name
having count(*) >= 2
order by c_name, r_name;










