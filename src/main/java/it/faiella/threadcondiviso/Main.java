package it.faiella.threadcondiviso;

public class Main {
    public static void main(String[] args) {
    Contatore cont = new Contatore();

    Lavoratore l1 = new Lavoratore(cont, "Lav1");
     Lavoratore l2 = new Lavoratore(cont, "Lav2");

    Thread thread1 = new Thread(l1);
    Thread thread2 = new Thread(l2);

    thread1.start();
    thread2.start();
    try {
        thread1.join();
        thread2.join();
    } catch (Exception e) {
       System.out.println(e.getMessage());
    }
System.out.println("fine");
    }
}