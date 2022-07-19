package com.board.test.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor
@Entity
@Data
@Table(name="tbl_board")
public class Board {
	@Id
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
		
	// 첨부 파일
	private String b_file;

	
}
