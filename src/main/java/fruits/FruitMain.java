package fruits;

public class FruitMain {
    public static void main(String[] args) {

        Fruit banana = new Fruit();
        banana.setName("banana");
        banana.setWeight(250.8);
        System.out.println("Fruit class Name: "+ banana.getName());
        System.out.println("Fruit class Weight: "+ banana.getWeight());

        Grape muscat = new Grape();
        muscat.setName("Muscat");
        muscat.setType("white type");
        muscat.setWeight(412.5);

        System.out.println("Grape class Name: "+ muscat.getName());
        System.out.println("Grape class Type: "+ muscat.getType());
        System.out.println("Grape class Weight: "+ muscat.getWeight());


        Apple golden = new Apple();
        golden.setName("golden apple");
        golden.setPieces(15);
        golden.setWeight(358.4);

        System.out.println("Apple class Name: "+ golden.getName());
        System.out.println("Apple class Pieces: "+ golden.getPieces());
        System.out.println("Apple class Weight: "+ golden.getWeight());

        GoldenDelicious goldenDelicious = new GoldenDelicious();
        goldenDelicious.setName("golden delicious");
        goldenDelicious.setPieces(10);
        goldenDelicious.setWeight(425.1);

        System.out.println("GoldenDelicious class Name: "+ goldenDelicious.getName());
        System.out.println("GoldenDelicious class Pieces: "+ goldenDelicious.getPieces());
        System.out.println("GoldenDelicious class Weight: "+ goldenDelicious.getWeight());
        System.out.println("GoldenDelicious class Colour: "+ goldenDelicious.getColour());

        Starking starking = new Starking();
        starking.setName("starking apple");
        starking.setPieces(8);
        starking.setWeight(245.3);

        System.out.println("Starking class Name: "+ starking.getName());
        System.out.println("Starking class Pieces: "+ starking.getPieces());
        System.out.println("Starking class Weight: "+ starking.getWeight());
        System.out.println("Starking class Colour: "+ starking.getColour());
    }
}
