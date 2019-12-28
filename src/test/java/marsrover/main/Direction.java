package marsrover.main;

public enum Direction {
    EAST("E","东"),
    SOUTH("S","南"),
    WEST("W","西"),
    NORTH("N","北");

    Direction(String direct,String des){
        this.direct = direct;
        this.des = des;
    }

    private String direct;
    private String des;

    public String getDirect(){
        return direct;
    }
}
