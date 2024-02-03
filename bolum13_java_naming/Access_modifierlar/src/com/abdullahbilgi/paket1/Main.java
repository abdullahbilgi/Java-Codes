package com.abdullahbilgi.paket1;

import com.abdullahbilgi.paket2.*;

public class Main {



        /*

        Classlar için;
             🧨public: tüm heryerden erişim sağlanır.

             🧨default:erişim belirleyici kullanmamak anlamına gelir.
                    bir class erişim belirleyici kullanmazsa bu class a sadece aynı paketin içindeki class lar erişebilir

         🧨protected ve private class lar için kullanılmaz

        Method ve Özellik Düzeyinde Erişim Belirleyiciler;

              🧨public: tüm her yerden erişilebilir

              🧨default: sadece kendi paketindeki class lar erişilebilir

              🧨protected: aynı paketin diğer class ları tarafından erişim verilir.paketin dışındaki
              class lar ise sadece ve sadece bu alanın bulunnduğu bir alt class ıysa(kalıtım) erişebilir

              🧨private: sadece kendi class ı erişebilir





      */

    public static void main(String[] args) {

        Araba araba = new Araba();//kullanabilmek için paket2 yi import etmeliyiz





    }
}
