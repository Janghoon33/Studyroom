create table boardCom(
	boardNum number(3) primary key,
	likeNum number(4)
)

create table comms(
	commentNum number(3) primary key,
	boardNum number(3),
	com varchar2(500),
	constraint fk_board foreign key(boardNum) references boardCom(boardNum)
)

CREATE SEQUENCE boardNum_seq
       INCREMENT BY 1
       START WITH 1
       NOCACHE;
       
CREATE SEQUENCE commNum_seq
       INCREMENT BY 1
       START WITH 1
       NOCACHE;
       
insert into BOARDCOM values(boardNum_seq.nextval, 42);
insert into comms values(commNum_seq.nextval, 1, '첫번째댓글');
insert into comms values(commNum_seq.nextval, 1, '두번째댓글');

select * from boardcom
select * from comms;
update boardCom set likeNum=likeNum+1 where boardNum=1;
