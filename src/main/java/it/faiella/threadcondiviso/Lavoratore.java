package it.faiella.threadcondiviso;

public class Lavoratore implements Runnable {

Contatore c ;
String nome ;


public Lavoratore(Contatore c , String nome ){
    this.c=c;
    this.nome=nome;
}

public void run(){
while (c.incrementa(nome)) {
    

try {
    Thread.sleep((long) (Math.random() * 400 +100));
} catch (InterruptedException e) {
 System.out.println(e.getMessage());
}

    
}

}

}
