package marsrover.main;

public class Rover {
    private Area area;
    private Point point ;
    public String land(Area area, Point point) {
        this.area = area;
        this.point = point;
        return ""+point.getX()+point.getY()+point.getDirection().getDirect();
    }

    public void forward() {
        switch(point.getDirection()){
            case SOUTH:
                point.setY(point.getY() -1);
                break;
            case NORTH:
                point.setY(point.getY()+1);
                break;
            case EAST:
                point.setX(point.getX()+1);
                break;
            case WEST:
                point.setX(point.getX()-1);
                break;
        }
    }

    public String getPostion() {

        return "" + point.getX() + point.getY()+point.getDirection().getDirect();
    }

    public void turn(String direction) {
//        switch(direction){
////            case "left":
////                point.getDirection().
////        }
    }
}
