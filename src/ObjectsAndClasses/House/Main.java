package ObjectsAndClasses.House;

public class Main {
    public static void main(String[] args) {
        House myHouse = new House();
        myHouse.area1 = 20;
        myHouse.area2 = 30;
        myHouse.area3 = 40.4;
        myHouse.storey = 2;

        System.out.println("Name of the owner is " + myHouse.nameOfOwner + ".");
        System.out.println("Areas of rooms are "+ myHouse.area1 + "square meter, " + myHouse.area2 + "square meter, " + myHouse.area3 + "square meter.");
        System.out.println("The house is " + myHouse.storey + " storey.");
    }
}