package training;

public class TrainerMain {
    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        trainer.setName("John Doe");
        trainer.setYearOfBirth(1980);
        System.out.println(trainer.getName());
        System.out.println(trainer.getYearOfBirth());

        Trainer anotherTrainer = new Trainer();
        anotherTrainer.setName("Jack Doe");
        System.out.println(anotherTrainer.getName());

        System.out.println("With methods:");

        System.out.println(trainer.getName());
        System.out.println("Age of "+trainer.getName() + " is " + trainer.getAge(2024));

        System.out.println(anotherTrainer.getNameAndYearOfBirth());
        anotherTrainer.setYearOfBirth(1990);
        System.out.println(anotherTrainer.getNameAndYearOfBirth());

        anotherTrainer.changeName("Jason Doe");
        System.out.println(anotherTrainer.getName());

        anotherTrainer.setName("Jack Doe");
        System.out.println(anotherTrainer.getName());

    }
}
