package it.faiella.threadcondiviso;

public class Contatore {
   private int valore;
   private int valore_max;

public Contatore(){
    this.valore= 0;
    this.valore_max=10;

}
 public boolean incrementa(String nomeThread){
    if (valore<valore_max) {
        valore++;
        System.out.println(nomeThread+"ha incrementato il valore di 1 ora è "+valore);

        return true;
    }

return false;
 }

}
