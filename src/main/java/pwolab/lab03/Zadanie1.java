package pwolab.lab03; 

public class Zadanie1 {

 public static final int FROM=0, TO=100;
 public static final String FILE_NAME = "fibseq100.txt";
 public static final String FILE_NAME1 = "lucseq100.txt";
 
 public static void main(String[] args) {

 System.out.println("Fibonacci wersja 2");
 System.out.println("Lucas wersja 2");

 boolean ok = SequenceTools.writeToFile(
 new FibonacciGenerator(),FROM, TO, FILE_NAME);
 boolean ok1 = SequenceTools.writeToFile1(
 new LucasGenerator(),FROM, TO, FILE_NAME1);
 
if (ok) System.out.println("Wynik zapisany do plikow: "
 + FILE_NAME + FILE_NAME1);

 else System.out.println("Błąd");
 }
 }
