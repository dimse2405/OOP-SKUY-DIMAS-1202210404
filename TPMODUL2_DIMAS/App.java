public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Model perangkat");
        Handphone handphone = new Handphone("Asus", 6, 3, false);
        handphone.informasi();
        handphone.telfon(628122934);
        handphone.kirimSMS(628122934);
        handphone.kirimSMS(628122934, 628157832);
        System.out.println(" ");

        Laptop laptop = new Laptop("Seagate", 16, 4, true);
        laptop.informasi();
        laptop.bukagame("Minecraft");
        laptop.kirimEmail("dimsesaurus@gmail.com");
        laptop.kirimEmail("dimsesaurus@gmail.com", "anakganteng@gmail.com");
        System.out.println(" ");
    }
}
