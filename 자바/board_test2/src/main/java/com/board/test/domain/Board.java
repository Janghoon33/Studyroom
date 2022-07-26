package com.board.test.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Entity // 서버 실행시 Object Relation Mapping이 됨
@Data
@Table(name="tbl_board")
public class Board {
	
	@Id // PK를 해당 변수로 하겠다는 뜻
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 해당 데이터베이스 번호 증가 전략을 따라가겠다
	 // 글 번호
	private int b_num;
	
	@NonNull
	private String b_title;
	
	// 내용
	@NonNull
	private String b_content;
		
	// 작성자
	@NonNull
	private String b_writer;
		
	// 작성 날짜
	@NonNull
	private String b_date;
		

	
}
