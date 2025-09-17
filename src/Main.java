//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Coffee coffee = new BlackCoffee();
        System.out.println(coffee.getDescription() + " : $" + coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " : $" + coffee.getCost());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " : $" + coffee.getCost());

        Coffee complexCoffee = new SugarDecorator(new MilkDecorator(new BlackCoffee()));
        System.out.println("Сложный кофе: " + complexCoffee.getDescription() +  " $"+ complexCoffee.getCost());
    }
}