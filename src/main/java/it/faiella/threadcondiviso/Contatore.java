package it.faiella.threadcondiviso;

public class Contatore {
   private int valore=0;
   private int valore_max=10;

public Contatore(int valore , int valore_max ){
    this.valore= valore;
    this.valore_max=valore_max;

}
 public boolean incrementa(String nomeThread){
    if (valore<valore_max) {
        valore++;
        System.out.println(nomeThread+"ha incrementato il valore di 1");

        return true;
    }

return false;
 }

}
