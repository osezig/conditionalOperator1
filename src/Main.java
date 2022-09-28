public class Main {
    public static void main(String[] args) {
        int capacity = 102;
        int seatsCount = 60;
        int stayCount = capacity - seatsCount; // стоячие места
        int seatsUsed = 59;
        int stayUsed = 42;
        if(seatsUsed < seatsCount);
        System.out.println("Есть еще " + (seatsCount - seatsUsed) + " сидячих мест ");
        if(stayUsed < stayCount);
        System.out.println("Есть еще " + (stayCount - stayUsed) + " стоячих мест ");


        }
}