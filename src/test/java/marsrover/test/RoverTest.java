package marsrover.test;

import marsrover.main.Area;
import marsrover.main.Direction;
import marsrover.main.Point;
import marsrover.main.Rover;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class RoverTest {
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

        rover.turn("right");

        String result = rover.getPostion();

        assertThat(result).isEqualTo("22W");
    }
}
