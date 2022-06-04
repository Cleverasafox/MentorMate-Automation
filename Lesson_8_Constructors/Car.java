package Lesson_8_Constructors;

public class Car {
    String name =null;
    String color =null;
    int releaseYear= -1;
    int horsePower = -1;
    boolean secondHand = false;


//    Create a car by provided name / color / release year / horsepower / second-hand.

    public Car (String name,String color,int releaseYear,int horsePower,boolean secondHand){
        this.name= name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHand = secondHand;


    }



    //Create a car by provided name / color / second-hand.
    public  Car (String name, String color,boolean secondHand){
        this.name = name;
        this.color = color;
        this.secondHand = secondHand;
    }


    //Create a car by provided name / color / release year / horsepower.
    public  Car (String name,String color,int releaseYear,int horsePower){
        this.name =name;
        this.color=color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
    }

//Create a car by provided name / release year / horsepower / second-hand.

    public Car(String name,int releaseYear,int horsePower,boolean secondHand){

        this.name = name;
        this.releaseYear =releaseYear;
        this.horsePower =horsePower;
        this.secondHand = secondHand;
    }


//Create a car by provided nothing. Default case

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", releaseYear=" + releaseYear +
                ", horsePower=" + horsePower +
                ", secondHand=" + secondHand +
                '}';
    }
}
