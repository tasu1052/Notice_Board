package com.example.board.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardDTO {
    private Long id; //아이디
    private String boardWriter; //작성자
    private String boardPass; //비밀번호
    private String boardTitle; //제목
    private String boardContent; //내용
    private int BoardHits; //조회수
    private String boardCreateAt; //작성시간
}
