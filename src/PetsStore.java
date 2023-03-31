public class PetsStore {
    public static void main(String[] args) {
        Cat mascotas = new Cat("gato","gato", "3 años");

       mascotas.toString();
        System.out.println(mascotas.sonido());

        System.out.println("............................................................");

       Dog mascota2= new Dog("tobi","perro","2 años");

        mascota2.toString();
        System.out.println(mascota2.sonido());


    }
}
