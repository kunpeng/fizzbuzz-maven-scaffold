package marsrover.main;

public class Point {
    private Integer x;
    private Integer y;
    private Direction direction;

    public Integer getX(){
        return x;
    }

    public Integer getY(){
        return y;
    }

    public Direction getDirection(){
        return direction;
    }

    public void setX(Integer x){
        this.x = x;
    }

    public void setY(Integer y){
        this.y = y;
    }

    public void setDirection(Direction d){
        this.direction = d;
    }

    public Point(Integer x, Integer y, Direction direction){
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
}
