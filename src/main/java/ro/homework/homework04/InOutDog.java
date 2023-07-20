package ro.homework.homework04;

public class InOutDog {
    public static void main(String[] args) {
        PetHotel petHotel = new PetHotel();

        Dog dog1 = new Dog("Gino", "Terrier");
        Dog dog2 = new Dog("Rocky", "Labrador");
        Dog dog3 = new Dog("Spicky", "Husky");

        petHotel.checkIn(1, dog1);
        petHotel.checkIn(2, dog2);
        petHotel.checkIn(3, dog3);


        System.out.println("Dogs in room 1: " + petHotel.getDogsInRoom(1));
        System.out.println("Dogs in room 2: " + petHotel.getDogsInRoom(2));
        System.out.println("Dogs in room 3: " + petHotel.getDogsInRoom(3));

        petHotel.checkOut(1, dog1);
        System.out.println("Dogs in room 1 after check-out: " + petHotel.getDogsInRoom(1));
    }
}
