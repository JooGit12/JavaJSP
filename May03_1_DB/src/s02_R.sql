-- 데이터 읽기 : R
select 필드명, 필드명 as 별칭, 연산자, 통계함수, ...
from 테이블명
where 조건식;
------------------------------------------------------
-- 통계함수
-- 		sum(필드명), avg(필드명), max(ㅍ), min(ㅍ), count(ㅍ)
------------------------------------------------------
-- 문자열 포함검색
-- 		필드명 like '패턴'
--					'%ㅋ' : ㅋ로 끝
--					'ㅋ%' : ㅋ로 시작
--					'%ㅋ%': ㅋ 포함
------------------------------------------------------
-- 전체 학생의 이름, 나이만
select s_name, s_age
from may03_student;

-- 전체 과자 이름, 유통기한만(필드명 바꿔서)
select s_name, s_exp as exp_date
from may03_snack;

-- 전체 학생의 이름, 평균
select s_name, (s_kor + s_eng + s_mat) / 3 as s_avg
from may03_student;

-- 전체 과자 이름, 가격, 부가세, g당 가격
select s_name, s_price, s_price * 0.1 as vat, s_price / s_weight as ppg
from may03_snack;

-- 전체 학생 평균 나이
select avg(s_age)
from may03_student;

-- 과자최고가, 과자최소가, 과자평균가, 과자 총 몇종류
select max(s_price), min(s_price), avg(s_price), count(*)
from may03_snack;

-- 학생 총 평균점수
select avg((s_kor + s_eng + s_mat) / 3)
from may03_student;

-- 나이가 30살 이상인
-- 학생 이름, 나이
select s_name, s_age
from may03_student
where s_age >= 30;

-- 무게가 500미만인 과자 이름, 가격, 무게
select s_name, s_price, s_weight
from may03_snack
where s_weight < 500;

-- 초코파이 가격
select s_price
from may03_snack
where s_name = '초코파이';

-- 이름에 초코들어있는거 평균가
select avg(s_price)
from may03_snack
where s_name like '%초코%';

-- 김씨 학생 몇명
select count(*)
from may03_student
where s_name like '김%';

-- 내일 먹으면 안되는 과자이름, 유통기한

-- to_date('...', '패턴') : 글자 -> 날짜
-- to_char(..., '패턴')   : 날짜 -> 글자

-- concat('...', '...') : 글자 붙이기

-- sysdate : 2023/05/03 14:56
-- to_char(sysdate, 'YYYYMMDD') : '20230503'
-- concat( , '235959') : '20230503235959'
-- to_date( , 'YYYYMMDDHH24MISS') : 2023/05/03 23:59:59
select s_name, s_exp
from may03_snack
where s_exp <= to_date(
					concat(
						to_char(sysdate, 'YYYYMMDD'), 
						'235959'
					), 
				'YYYYMMDDHH24MISS');

insert into may03_snack 
values(may03_snack_seq.nextval, 
'노래방새우깡', 10000, 999.9, 
to_date('20230503 1700', 'YYYYMMDD HH24MI'));

-- and, or
-- 국어점수가 50점 미만이거나
-- 영어점수가 50점 미만인 학생이름, 국, 영, 수
select s_name, s_kor, s_eng, s_mat
from may03_student
where s_kor < 50 or s_eng < 50;

-- 20대 학생이름, 나이
select s_name, s_age
from may03_student
where s_age >= 20 and s_age < 30;

-- 유통기한이 오늘 9시 ~ 오늘 저녁 9시 사이에 끝나는
-- 과자 이름, 유통기한
select s_name, s_exp
from may03_snack
where 
	s_exp >= to_date(concat(to_char(sysdate, 'YYYYMMDD'), '0900'), 'YYYYMMDDHH24MI')
	and 
	s_exp <= to_date(concat(to_char(sysdate, 'YYYYMMDD'), '2100'), 'YYYYMMDDHH24MI');

-- subquery	
-- 제일 싼 과자 이름
select s_name
from may03_snack
where s_price = (
	select min(s_price)
	from may03_snack
);

-- 평균보다 싼 과자 이름, 가격
select s_name, s_price
from may03_snack
where s_price < (
	select avg(s_price)
	from may03_snack
);

-- 최연장자 학생 이름, 나이
select s_name, s_age
from may03_student
where s_age = (
	select max(s_age)
	from may03_student
);

-- 유통기한 가장 널널한 과자 이름, 유통기한
select s_name, s_exp
from may03_snack
where s_exp = (
	select max(s_exp)
	from may03_snack
);
