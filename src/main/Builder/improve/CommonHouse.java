package Builder.improve;

public class CommonHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println(" 普通房子打地基5米");
    }

    @Override
    public void buildWall() {
        System.out.println(" 普通房子砌墙10cm");
    }

    @Override
    public void roofed() {
        System.out.println(" 普通房子封顶3米");

    }
}
