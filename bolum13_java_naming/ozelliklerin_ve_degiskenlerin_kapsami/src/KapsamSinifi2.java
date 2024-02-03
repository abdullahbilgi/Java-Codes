public class KapsamSinifi2 {
    private int privateDegisken = 30;

    public KapsamSinifi2(){

    }

    public void dahiliSinifKontrol(){

        Dahilisinif d = new Dahilisinif();

        System.out.println("Kontrol ediliyor... "+d.a);
    }

    public class Dahilisinif{

        private int privateDegisken = 20;//en lokal değişken kullanılır

        private int a = 3;

        public void onileCarp(){

           // int privateDegisken = 10;//en en lokal olan kullanılır

            for (int i = 0; i < 6; i++) {
                System.out.println(i+" * "+privateDegisken+" = "+(i*privateDegisken));
                //iki private değişken varken hangisine erişceğimizi bulmak istersek
                //KapsamSinifi2.this.privateDegisken yaparsak 30'a erişiriz
                //this.privateDegisken yaparsak 20'ye erişiriz
            }
        }
    }



}
