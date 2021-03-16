package Builder.improve;

public class HighBUilding extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println(" 高楼打地基30米");
    }

    @Override
    public void buildWall() {
        System.out.println(" 高楼砌墙40cm");

    }

    @Override
    public void roofed() {
        System.out.println(" 高楼的透明屋顶");

    }
}
