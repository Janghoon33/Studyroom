create table board
(
	idx int not null auto_increment,
	title varchar(100) not null,
	writer varchar(100) not null,
	content varchar(2000) not null,
	indate datetime default now(),
	count int default 0,
	
	primary key(idx)
);

insert into board(title, writer, content)
values( '스프링 게시판', '안현진', '즐거운 게시판 만들기' );

create tbl_book
(
	num int not null auto_increment,
	title varchar(50) not null,
	author varchar(30) not null,
	company varchar(50) not null,
	isbn varchar(30) not null,
	count int default 1,
	
	primary key(num)
);



