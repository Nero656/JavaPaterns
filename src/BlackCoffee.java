public class BlackCoffee implements Coffee{
    @Override
    public String getDescription(){
        return "Черный кофе";
    }

    @Override
    public double getCost(){
        return 2.0;
    }
}
