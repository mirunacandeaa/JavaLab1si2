package Lab1si2MAP;

public class MenuController {
    private Menu model;
    private MenuView view;

    public MenuController(Menu model, MenuView view){
        this.model = model;
        this.view = view;
    }

    public void setDrink(String drink){
        model.setDrink(drink);
    }

    public String getDrink(){
        return model.getDrink();
    }

    public void setMainDish(String mainDish){
        model.setMainDish(mainDish);
    }

    public String getMainDish(){
        return model.getMainDish();
    }

    public void setDessert(String dessert){
        model.setDessert(dessert);
    }

    public String getDessert(){
        return model.getDessert();
    }
    public void updateView(){
        view.printCourseDetails(model.getDrink(), model.getMainDish(), model.getDessert());
    }

}
