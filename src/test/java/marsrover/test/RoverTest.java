package marsrover.test;

import marsrover.main.Area;
import marsrover.main.Direction;
import marsrover.main.Point;
import marsrover.main.Rover;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.fest.assertions.api.Assertions.assertThat;

public class RoverTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void land_test(){
        Point A = new Point(10, 10, Direction.SOUTH);
        Point B = new Point(-10, 10, Direction.SOUTH);
        Point C = new Point(-10, -10, Direction.SOUTH);
        Point D = new Point(10, -10, Direction.SOUTH);

        Area area = new Area(A, B, C, D);

        Rover rover = new Rover();

        String result = rover.land(area, new Point(2,2,Direction.SOUTH));

        assertThat(result).isEqualTo("22S");
    }

    @Test
    public void go_forward(){
        Point A = new Point(10, 10, Direction.SOUTH);
        Point B = new Point(-10, 10, Direction.SOUTH);
        Point C = new Point(-10, -10, Direction.SOUTH);
        Point D = new Point(10, -10, Direction.SOUTH);

        Area area = new Area(A, B, C, D);

        Rover rover = new Rover();

        rover.land(area, new Point(2,2,Direction.SOUTH));

        rover.forward();

        String result = rover.getPostion();

        assertThat(result).isEqualTo("21S");

    }

    @Test
    public void turn_test(){
        Point A = new Point(10, 10, Direction.SOUTH);
        Point B = new Point(-10, 10, Direction.SOUTH);
        Point C = new Point(-10, -10, Direction.SOUTH);
        Point D = new Point(10, -10, Direction.SOUTH);

        Area area = new Area(A, B, C, D);

        Rover rover = new Rover();

        rover.land(area, new Point(2,2,Direction.SOUTH));

        rover.turn("L");

        String result = rover.getPostion();

        assertThat(result).isEqualTo("22W");
    }

    @Test
    public void batch_move_test(){
        Point A = new Point(10, 10, Direction.SOUTH);
        Point B = new Point(-10, 10, Direction.SOUTH);
        Point C = new Point(-10, -10, Direction.SOUTH);
        Point D = new Point(10, -10, Direction.SOUTH);

        Area area = new Area(A, B, C, D);

        Rover rover = new Rover();
        rover.land(area, new Point(2,2,Direction.NORTH));

        String order = "10,R;5,R";
        rover.execute(order);
        String result = rover.getPostion();

        assertThat(result).isEqualTo("712S");

    }

    @Test
    public void over_area_test(){
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("超出范围");

        Point A = new Point(10, 10, Direction.SOUTH);
        Point B = new Point(-10, 10, Direction.SOUTH);
        Point C = new Point(-10, -10, Direction.SOUTH);
        Point D = new Point(10, -10, Direction.SOUTH);

        Area area = new Area(A, B, C, D);

        Rover rover = new Rover();
        rover.land(area, new Point(20,20,Direction.NORTH));

        String result = rover.getPostion();
    }
}
