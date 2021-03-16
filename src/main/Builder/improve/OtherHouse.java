package Builder.improve;

public class OtherHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println(" 其他房子打地基4米");
    }

    @Override
    public void buildWall() {
        System.out.println(" 其他房子砌墙20cm");
    }

    @Override
    public void roofed() {
        System.out.println(" 其他房子封顶3米");
    }
}
