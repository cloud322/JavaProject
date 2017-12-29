create table sungjuk
(
sjno int primary key,
name nvarchar2(6) not null,
kor number(3),
eng number(3),
mat number(3),
tot number(3),
avrg number(4,1),	--4자리 소수점 이하 1자리
grd nvarchar2(6),
regdate timestamp default sysdate
);						--성적 테이블 생성

create sequence sjno; --시퀀스 일련번호 생성

insert into sungjuk (sjno,name,kor,eng,mat,tot,avrg,grd)
values(sjno.nextval,'지현',90,90,90,270,90,'A');

--성적데이터추가
select sjno,name,kor,eng,mat from sungjuk order by sjno desc;
--성적데이터 전체조회

select*from sungjuk			--alt x---
where sjno =1;
--상세성적 데이터 조회
