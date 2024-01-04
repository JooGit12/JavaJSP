create table bnsaabfp_member(
	m_id varchar2(10 char) primary key,
	m_pw varchar2(10 char) not null,
	m_name varchar2(10 char) not null,
	m_birthday date not null,
	m_addr varchar2(100 char) not null,
	m_photo varchar2(150 char) not null
);
-----------------------------------------------
create table bnsaabfp_sns(
	s_no number(5) primary key, 		-- 글번호
	s_owner varchar2(10 char) not null, -- 글쓴이 id
	s_txt varchar2(500 char) not null,  -- 글내용
	s_date date not null,				-- 글쓴날짜
	s_color char(7) not null,
	constraint sns_writer
		foreign key(s_owner) references bnsaabfp_member(m_id)
		on delete cascade
);
create sequence bnsaabfp_sns_seq;
-----------------------------------------------
create table bnsaabfp_sns_reply(
	sr_no number(6) primary key,		 -- 댓글번호[seq]
	sr_owner varchar2(10 char) not null, -- 댓글쓴이 id[session/input]
	sr_txt varchar2(150 char) not null,  -- 댓글내용[input]
	sr_date date not null,				 -- 댓글쓴날짜[sysdate]
	sr_s_no number(5) not null,			 -- 소속글번호[input(readonly/hidden)]
	constraint sns_reply2
		foreign key(sr_s_no) references bnsaabfp_sns(s_no)
		on delete cascade
	--, constraint sns_reply_owner2
	--		foreign key(sr_owner) references bnsaabfp_member(m_id)
	--		on delete cascade
);
create sequence bnsaabfp_sns_reply_seq;

drop sequence bnsaabfp_sns_seq;
drop sequence bnsaabfp_sns_reply_seq;
drop table bnsaabfp_member cascade constraint purge;
drop table bnsaabfp_sns cascade constraint purge;
drop table bnsaabfp_sns_reply cascade constraint purge;

-- 댓글 없는 글은 글 자체도 안나오고
-- 게시판 모양에도 안맞음[같은 글이 여러번]
select * 
from bnsaabfp_sns, bnsaabfp_sns_reply
where s_no = sr_s_no;

-- 그...
select *
from bnsaabfp_sns_reply
where sr_s_no = (

);

-- 58번글의 댓글들 가져와서
-- ArrayList<댓글>

-- 클래식 게시판
select *
from bnsaabfp_sns_reply
where sr_s_no = 58;

-- constraint 제약조건명
--		foreign key(필드명) references 테이블명(필드명)
--		on delete cascade

select * 
from (
	select rownum as rn, m_photo, s_no, s_owner, s_date, s_txt, s_color
	from (
		select m_photo, s_no, s_owner, s_date, s_txt, s_color
		from bnsaabfp_member, bnsaabfp_sns
		where m_id = s_owner
		order by s_date desc
	)
)
where rn >= 3 and rn <= 5

select * 
from (
	select rownum as rn, m_photo, s_no, s_owner, s_date, s_txt, s_color
	from (
		select m_photo, s_no, s_owner, s_date, s_txt, s_color
		from bnsaabfp_member, bnsaabfp_sns
		where m_id = s_owner and s_txt like '%ㅋ%' or s_owner like '%ㅋ%'
		order by s_date desc
	)
)
where rn >= 3 and rn <= 5


-- 1. 
select * from bnsaabfp_member;
-- -> DAO에서 반복문+조건문

-- 2.[위험]
select * from bnsaabfp_member
where m_id='test' and m_pw='a1';
-- -> DAO에서는 그냥 성공처리

-- 3. 
select * from bnsaabfp_member
where m_id='test';
-- -> DAO에서 pw검사


select count(*)
from bnsaabfp_sns
where s_txt like '%ㅋ%' or s_owner like '%ㅋ%';

select * from bnsaabfp_sns_reply;









