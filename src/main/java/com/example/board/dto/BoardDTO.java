package com.example.board.dto;


import com.example.board.entity.BoardEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
@ToString
public class BoardDTO {
    private Long id; //아이디
    private String boardWriter; //작성자
    private String boardPass; //비밀번호
    private String updatePass;//수정된 비밀번호
    private String boardTitle; //제목
    private String boardContents; //내용
    private int BoardHits; //조회수
    private String boardCreateAt; //작성시간

    private String dataFormat(LocalDateTime date){
        if(date == null){
            return null;
        }
        return date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    }
    public static BoardDTO toBoardDTO(BoardEntity boardEntity){
        BoardDTO boardDTO = new BoardDTO();
        boardDTO.setId(boardEntity.getId());
        boardDTO.setBoardWriter(boardEntity.getBoardWriter());
        boardDTO.setBoardPass(boardEntity.getBoardPass());
        boardDTO.setBoardTitle(boardEntity.getBoardTitle());
        boardDTO.setBoardContents(boardEntity.getBoardContents());
        boardDTO.setBoardHits(boardEntity.getBoardHits());
        boardDTO.setBoardCreateAt(boardDTO.dataFormat(boardEntity.getCreatedAt()));
        return boardDTO;
    }
}
