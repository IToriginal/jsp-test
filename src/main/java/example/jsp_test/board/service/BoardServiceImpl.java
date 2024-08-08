package example.jsp_test.board.service;

import example.jsp_test.board.dto.BoardDTO;
import example.jsp_test.board.entity.Board;
import example.jsp_test.board.mapper.BoardMapper;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardMapper boardMapper;

    @Override
    public List<BoardDTO> getAllBoards() {
        return boardMapper.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private BoardDTO convertToDTO(Board board) {
        return BoardDTO.builder()
                .id(board.getId())
                .writer(board.getWriter())
                .title(board.getTitle())
                .content(board.getContent())
                .build();
    }

}
