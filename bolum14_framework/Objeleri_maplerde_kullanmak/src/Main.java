import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Main {

     static class Player{

        private String isim;
        private int id;

        public Player(String isim, int id) {
            this.isim = isim;
            this.id = id;
        }

        @Override
        public String toString() {
            return "|||| Id: "+id + "Isım : "+isim +" |||";
        }

         @Override                                                  //equals and hashCode aynı objeyi üretmeyi engelliyo
         public boolean equals(Object o) {
             if (this == o) return true;
             if (o == null || getClass() != o.getClass()) return false;
             Player player = (Player) o;
             return id == player.id && Objects.equals(isim, player.isim);
         }

         @Override
         public int hashCode() {
             return Objects.hash(isim, id);
         }
     }




    public static void main(String[] args) {


        Set<Player> hashset = new HashSet<>();

        Player player1 = new Player("Mustafa",1);
        Player player2 = new Player("Mehmet",10);
        Player player3 = new Player("Emre",6);
        Player player4 = new Player("Mustafa",1);

        hashset.add(player1);
        hashset.add(player2);
        hashset.add(player3);
        hashset.add(player4);

        for (Player p:hashset) {
            System.out.println(p);
        }



























    }
}
