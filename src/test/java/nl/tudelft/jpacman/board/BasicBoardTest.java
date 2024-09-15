package nl.tudelft.jpacman.board;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class BasicBoardTest {

    private final Square[][] grid = {
        { mock(Square.class)},
    };
    Board board = new Board(grid);

    @Test
    void testBoardWidth() {
        int Width = board.getWidth();
        assertThat(Width).isEqualTo(1);
    }

    @Test
    void testBoardHeight() {
        int Height = board.getHeight();
        assertThat(Height).isEqualTo(1);
    }

    private final Square[][] grid2 = {
        { mock(Square.class), null, null },
        { null, null, null },
    };
    Board board2 = new Board(grid2);
    @Test
    void testSquareAt() {
        Square square = board2.squareAt(1,1);
        assertThat(square).isEqualTo(mock(Square.class));
    }

}
