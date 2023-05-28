public class Rooster extends Animal{
    public Rooster(String especie, String name, String edad){
        super(name,especie, edad);
    }
    public String talk(){
        return "kikiriki";
    }

    public String toString() {
        System.out.println("nombre de la mascota:"+getName());
        System.out.println("tipo de especie: "+getEspecie());
        System.out.println("edad:"+getEdad());
        return "";
    }
}
