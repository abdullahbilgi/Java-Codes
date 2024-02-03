package Beyblade;

public class Draciel extends Beyblade{

    private String kutsalCanavar;

    public Draciel(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void kutsalCanavarOrtayaCıkar() {
        System.out.println(getBeybladeci()+" "+kutsalCanavar+" 'i ortaya cikariyor...");
        System.out.println(getBeybladeci()+" in savunmasi : Kale Savunmasi");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();

        System.out.println("Kutsal Canavar adi : "+kutsalCanavar);
    }
}
