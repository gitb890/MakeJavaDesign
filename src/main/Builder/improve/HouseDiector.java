package Builder.improve;

/**指挥者，动态指定制作流程，返回产品*/
public class HouseDiector {

    HouseBuilder houseBuilder = null;

    /**构造器传入houseBuilder*/
    public HouseDiector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    /**通过setter 传入houseBuilder*/
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**如何处理建造房子的流程，交给指挥者*/
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
