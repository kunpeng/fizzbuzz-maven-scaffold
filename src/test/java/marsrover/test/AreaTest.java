package marsrover.test;

import marsrover.main.Area;
import marsrover.main.Direction;
import marsrover.main.Point;
import org.hamcrest.core.IsEqual;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class AreaTest {
    @Test
    public void area_test(){
        Point A = new Point(10, 10, Direction.SOUTH);
        Point B = new Point(-10, 10, Direction.SOUTH);
        Point C = new Point(-10, -10, Direction.SOUTH);
        Point D = new Point(10, -10, Direction.SOUTH);

        Area area = new Area(A, B, C, D);

        String result = area.contains(new Point(2, 2, Direction.SOUTH));

        assertThat(result).isEqualTo("22S");
    }
}
