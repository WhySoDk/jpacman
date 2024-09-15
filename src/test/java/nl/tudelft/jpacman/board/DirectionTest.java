package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * A very simple (and not particularly useful)
 * test class to have a starting point where to put tests.
 *
 * @author Arie van Deursen
 */
public class DirectionTest {
    /**
     * Do we get the correct delta when moving north?
     */
    @Test
    void testNorth() {
        Direction north = Direction.valueOf("NORTH");
        assertThat(north.getDeltaY()).isEqualTo(-1);
    }
    @Test
    void testSouth() {
        Direction South = Direction.valueOf("SOUTH");
        assertThat(South.getDeltaY()).isEqualTo(1);
    }
    @Test
    void testEast() {
        Direction East = Direction.valueOf("EAST");
        assertThat(East.getDeltaX()).isEqualTo(1);
    }
    @Test
    void testWest() {
        Direction West = Direction.valueOf("WEST");
        assertThat(West.getDeltaX()).isEqualTo(-1);
    }
}
