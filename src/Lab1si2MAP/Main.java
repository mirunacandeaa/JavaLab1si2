package Lab1si2MAP;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //fetch student record based on his roll no from the database
        Menu model = retriveMenuFromDatabase();

        //Create a view : to write course details on console
        MenuView view = new MenuView();

        MenuController controller = new MenuController(model, view);

        controller.updateView();

        controller.setDessert("Cheesecake");
        System.out.println("\nAfter updating, Menu Details are as follows");

        controller.updateView();
    }

    private static Menu retriveMenuFromDatabase() {
        Menu menu = new Menu();
        menu.setDrink("Hugo");
        menu.setMainDish("Pizza");
        menu.setDessert("Lava cake");
        return menu;
    }
}


