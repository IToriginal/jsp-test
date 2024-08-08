package example.jsp_test.board.service;

import example.jsp_test.board.dto.BoardDTO;
import java.util.List;

public interface BoardService {
    List<BoardDTO> getAllBoards();
}
