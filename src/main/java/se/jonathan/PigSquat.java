package se.jonathan;

public class PigSquat {

    public static boolean healthCheck(Boolean healthy) {
        if (healthy == false){
            throw new RuntimeException("You have to be healthy in order to do this workout.");
        }
        return true;
    }

    public static void barbell(String barbellWeight) {
        int weight = Integer.parseInt(barbellWeight);
        if((weight == 15) || (weight == 20)){
            System.out.println("You picked the " + weight + " kg barbell.");
        }
        else{
            throw new RuntimeException("The barbell weight has to be either 15 kg or 20 kg.");
        }
    }

    public static int increment(String weightIncrement) {
        int increment = Integer.parseInt(weightIncrement);
        if(increment > 10){
            throw new RuntimeException("Do not go beyond 10 kg for weight increment.");
        }
        else if(increment == 0){
            throw new RuntimeException("You can't enter an increment value lower than 1.");
        }
        else {
            System.out.println("You picked a " + increment + " kg increment each set.");
        }
        return increment;
    }

//TODO
}
