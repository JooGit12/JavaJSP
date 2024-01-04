--1. 설치(서버로 쓸 자리에서---------------------)
--- 시작 - cmd - ipconfig로 IPv4주소 확인
--	195.168.9.43
--- 방화벽 끄고
--- DB파일 저장될 폴더 확보(경로 기억해두고)
--	C:\Kwon\DB
--- Oracle 11g R2 XE 다운받아서 설치
--- 내PC - 관리 - 서비스 - Oracle어쩌고... 실행중인지 확인
----------------------------------------------------
--2. 원격접속되는 관리자 계정 만들기(서버로 쓸 자리에서--------)
--   시작 - cmd
--	sqlplus   /   as   sysdba
--
--2.1. 관리자 계정 만들기
--	create   user   관리자ID   identified   by   관리자PW;
--
--2.2. 원격접속해서 쓸 수 있도록 권한부여
--	grant   connect,   resource,   dba   to   관리자ID;
------------------------------------------------------------------------
--3. 사용자 계정 만들기(내 자리에서--------------------------------)
--3.1. OracleDB서버에 접속하려면 instantClient라는 프로그램이 필요
--   Basic Package
--   SQL*Plus Package
--   JDBC Supplement Package
--   => 를 받아서 한군데 합쳐지게 압축해제
--
--3.2. 접속하기
--   instantClient폴더에서 cmd
--   sqlplus   관리자아이디/관리자비번@주소:포트/디비명
--
--3.3. 사용자 계정 만들기
--   create   user   아이디   identified   by   비번;
--
--3.4. role(권한세트) 설정
--   grant   connect,   resource   to   아이디;
--
--3.5. 테이블스페이스 만들기
--   create   tablespace   테이블스페이스명   datafile   '경로/파일명.dbf'   size   500m;
--   create   tablespace   kwonTS   datafile   'C:/Kwon/DB/kwonTS.dbf'   size   500m;
--
--3.6.  테이블스페이스를 계정에게 배정
--   alter   user   아이디   default   tablespace   테이블스페이스명;
--------------------------------------
--아이디 : 			|  sdedu
--비번 : 			|  sdedu
--서버주소 : 		|  sdgn-djvemfu.tplinkdns.com
--포트번호 : 1521	|  19195
--SID : xe			|  xe
---------------------------------------
--4. OracleDB에 접속
--   instantClient폴더에서 cmd
--   sqlplus   아이디/비번@주소:포트/SID

-- 1) 관리자 쪽 기능은 안됨
-- 2) SQL은 가능, SQLPlus라는 프로그램의 명령어는 불가능

-- 여러 줄 실행 : 블록지정 -> alt + x
create table student2(
	name char,
	age number
);

-- 한 줄 실행 : 커서 대충 갖다 놓고 -> alt + s
select * from student2;

desc student2











