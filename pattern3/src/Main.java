public class Main {
    public static void main(String[] args) {
        Flower rose = new Rose();
        System.out.println("Price of Rose: $" + rose.getPrice());
        rose.display();

        Strawberry strawberry = new Strawberry();
        System.out.println("Price of Strawberry: $" + strawberry.getPrice());
        strawberry.show();

        ChocolateCoveredFruit chocolateCoveredStrawberry = new StrawberryAdapter(strawberry);
        System.out.println("Price of Chocolate Covered Strawberry: $" + chocolateCoveredStrawberry.getPrice());
        chocolateCoveredStrawberry.display();
    }
}
