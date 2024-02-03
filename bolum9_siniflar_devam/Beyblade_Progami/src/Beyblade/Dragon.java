package Beyblade;

public class Dragon extends Beyblade{

    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void kutsalCanavarOrtayaCıkar() {

        System.out.println(getBeybladeci()+" "+kutsalCanavar+" 'i ortaya cikariyor...");
        System.out.println(getBeybladeci()+" in saldirisi : Hayalet Kasirgasi");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();

        System.out.println("Kutsal Canavar adi : "+kutsalCanavar);
        System.out.println("Gizli yetenek : "+gizliYetenek);
    }
}
