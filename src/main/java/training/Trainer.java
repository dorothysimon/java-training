package training;

public class Trainer {
    private String name;
    int yearOfBirth;

    public Trainer(String name, int yearOfBirth){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getYearOfBirth(){
        return yearOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getNameAndYearOfBirth(){
        return name+ " "+yearOfBirth;
    }
    public int getAge(int year){
        return year-yearOfBirth;
    }
    public void changeName(String newName){
        name = newName;
    }

}
