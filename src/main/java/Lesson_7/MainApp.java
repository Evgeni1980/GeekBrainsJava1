package Lesson_7;

public class MainApp {
    public static void main(String[] args) {

        Cat[] catArray = new Cat[4];
        catArray[0] = new Cat("Мурзик");
        catArray[1] = new Cat("Барсик");
        catArray[2] = new Cat("Васька");
        catArray[3] = new Cat("Прошка");

        Plate plate = new Plate(50);

        for (int i = 0; i < catArray.length; i++) {
            if(catArray[i].getSatiety() == false && plate.getFood() > catArray[i].getAppetite()){
                catArray[i].eat(plate);
//                plate.info();
            }

                // Реализация метода, добавления еды и кормления голодного кота.

//            if(plate.getFood() < catArray[i].getAppetite() && catArray[i].getSatiety() == false){
//                plate.putFood(catArray[i]);
//                plate.info();
//                catArray[i].eat(plate);
//            }
            catArray[i].info();
        }
    }
}
