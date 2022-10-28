public class Main {
    public static void main(String[] args) {
       if(args[0].equalsIgnoreCase("faktorijel")){
           int rezultat = Matematika.Faktorijel(Integer.valueOf(args[1]));
           System.out.println("Faktorijel unesenog broja iznosi: " + rezultat);
       } else if(args[0].equalsIgnoreCase("sinus")){
           double rezultat = Matematika.Sinus(Double.valueOf(args[1]));
           System.out.println("Sinus unesenog ugla (u stepenima) iznosi: " + rezultat);
       }
    }
}
