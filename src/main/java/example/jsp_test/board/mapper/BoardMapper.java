package example.jsp_test.board.mapper;

import example.jsp_test.board.entity.Board;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {

    List<Board> findAll();

}
