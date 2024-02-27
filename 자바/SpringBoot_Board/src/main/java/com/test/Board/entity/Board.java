package com.test.Board.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity // DB의 Table을 의미
@Data
public class Board {

    @Id // pk를 의미
    @GeneratedValue(strategy = GenerationType.IDENTITY) // mariaDB, MYSQL에서 사용하는 자동생성
    private Integer id;

    private String title;

    private String content;

    private String filename;

    private String filepath;
}
