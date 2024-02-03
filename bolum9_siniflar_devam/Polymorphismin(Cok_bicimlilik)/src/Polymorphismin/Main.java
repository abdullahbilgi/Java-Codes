package Polymorphismin;

class Hayvan{

    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String konus(){
        return "Hayvan konusuyor...";
    }
}

class Kedi extends Hayvan{

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" Miyavliyor...";
    }
}

class Kopek extends Hayvan{
    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" Havliyor...";
    }
}

class At extends Hayvan{
    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" Kisniyor...";
    }
}

public class Main {

    public static void konustur(Hayvan hayvan){//1.
        System.out.println(hayvan.konus());
    }

    public static void main(String[] args){

        Hayvan hayvan1 = new Kedi("Tekir");
        Hayvan hayvan2 = new Kopek("Karabas");
        Hayvan hayvan3 = new At("Sahbatur");

        System.out.println(hayvan1.konus());
        System.out.println(hayvan2.konus());
        System.out.println(hayvan3.konus());

       /* konustur(new Kedi("Tekir"));//1.
        konustur(new Kopek("Karabas"));//1.
        konustur(new At("Sahbatur"));//1.*/

    }
}
