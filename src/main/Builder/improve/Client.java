package Builder.improve;

public class Client {
    public static void main(String[] args) {

        /**盖普通房*/
        CommonHouse commonHouse = new CommonHouse();
        /**准备房子的指挥者*/
        HouseDiector houseDiector = new HouseDiector(commonHouse);

        /*完成，返回产品*/
        House house = houseDiector.constructHouse();

        System.out.println("-------------------");

        /**盖高楼*/
        HighBUilding highBUilding = new HighBUilding();
        /**重置建造者*/
        houseDiector.setHouseBuilder(highBUilding);
        /**完成，返回产品*/
        houseDiector.constructHouse();

        System.out.println("--------------------");
        /**盖其他房子*/
        OtherHouse otherHouse = new OtherHouse();
        HouseDiector houseDiector1 = new HouseDiector(otherHouse);

        House house1 = houseDiector1.constructHouse();
    }
}
