package marsrover.main;

public class Rover {
    private Area area;
    private Point point ;
    public String land(Area area, Point point) {
        this.area = area;
        this.point = point;

        if(point.getX() > area.A.getX() || point.getX() < area.B.getX() || point.getY() > area.C.getY() || point.getY() < area.B.getY()){
            throw new IllegalArgumentException("超出范围");
        }

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

    public void turn(String drec) {
        if(drec.equals("L")) {
            switch(point.getDirection()) {
                case SOUTH:
                    point.setDirection(Direction.EAST);
                    break;
                case EAST:
                    point.setDirection(Direction.NORTH);
                    break;
                case NORTH:
                    point.setDirection(Direction.WEST);
                    break;
                case WEST:
                    point.setDirection(Direction.SOUTH);
                    break;
            }
        }
        if(drec.equals("R")){
            switch(point.getDirection()){
                case SOUTH:
                    point.setDirection(Direction.WEST);
                    break;
                case EAST:
                    point.setDirection(Direction.SOUTH);
                    break;
                case NORTH:
                    point.setDirection(Direction.EAST);
                    break;
                case WEST:
                    point.setDirection(Direction.NORTH);
                    break;
            }
        }
    }

    public void execute(String order) {
        String[] orders = order.split(";");
        for(String o : orders){
            String[] details = o.split(",");
            int num = Integer.valueOf(details[0]);
            for(int i = 0; i < num; i++){
                forward();
            }
            String dre = details[1];
            turn(dre);
        }
    }
}
