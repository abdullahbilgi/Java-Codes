package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static class Player implements Comparable<Player> {

        private String isim;
        private int id;

        public Player(String isim, int id) {
            this.isim = isim;
            this.id = id;
        }

        @Override
        public String toString() {
            return "|||| Id: " + id + "Isım : " + isim + " |||";
        }

        @Override
        public int compareTo(Player player) {
            if(this.id < player.id) return -1;
            else if(this.id > player.id) return 1;
            else return 0;
        }
    }

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Java");
        arrayList.add("C++");
        arrayList.add("Python");
        arrayList.add("Php");
        arrayList.add("Go");

        Collections.sort(arrayList);

        for (String s:arrayList) {
            System.out.println(s);
        }

        System.out.println("****************************************");

        List<Player> players = new ArrayList<>();

        players.add(new Player("Murat",5));
        players.add(new Player("Emre",1));
        players.add(new Player("Oguz",10));
        players.add(new Player("Yusuf",4));

        Collections.sort(players);// class combariable iplement etmeden sıralamıyor

        for (Player s:players) {
            System.out.println(s);
        }



    }
}
