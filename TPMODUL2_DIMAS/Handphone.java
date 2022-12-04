public class Handphone extends Perangkat {
    protected boolean fingerprint;

    public Handphone(String drive, int ram, float processor, boolean fingerprint) {
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    @Override
    public void informasi() {
        if (fingerprint == true) {
            System.out.println("Handphone ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram
                    + " gb dan processor secepat " + processor + " ghz. Selain itu handphone ini Memiliki Fingerprint");
        } else {
            System.out.println("Handphone ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram
                    + " gb dan processor secepat " + processor
                    + " ghz. Selain itu handphone ini tidak Memiliki Fingerprint");
        }
    }

    public void telfon(int no_hp) {
        System.out.println("Handphone berhasil menyambungkan telfon ke nomor " + no_hp);
    }

    public void kirimSMS(int no_hp) {
        System.out.println("Handphone berhasil mengirim SMS ke nomor " + no_hp);
    }

    public void kirimSMS(int no_hp1, int no_hp2) {
        System.out.println("Handphone berhasil mengirim SMS ke nomor " + no_hp1 + " dan ke nomor " + no_hp2);
    }
}
