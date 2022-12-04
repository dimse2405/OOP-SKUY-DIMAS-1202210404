public class Laptop extends Perangkat {
    protected boolean webcam;

    public Laptop(String drive, int ram, float processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    @Override
    public void informasi() {
        if (webcam == true) {
            System.out.println("Laptop ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram
                    + " gb dan processor secepat " + processor + " ghz. Selain itu Laptop ini Memiliki webcam");
        } else {
            System.out.println("Laptop ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram
                    + " gb dan processor secepat " + processor + " ghz. Selain itu Laptop ini tidak Memiliki webcam");
        }
    }

    public void bukagame(String Namagame) {
        System.out.println("Laptop sedang membuka game " + Namagame);
    }

    public void kirimEmail(String Email) {
        System.out.println("Laptop berhasil mengirim Email ke " + Email);
    }

    public void kirimEmail(String Email1, String Email2) {
        System.out.println("Laptop berhasil mengirim Email ke  " + Email1 + " dan ke " + Email2);
    }
}
