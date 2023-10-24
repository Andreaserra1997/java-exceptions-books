package org.lessons.java.books;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di libri nel catalogo: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Book[] catalog = new Book[n];

        for (int i = 0; i < n; i++) {
            try {
                System.out.println("Inserisci i dati del libro #" + (i + 1) + ":");
                System.out.print("Titolo: ");
                String title = scanner.nextLine();
                System.out.print("Numero di pagine: ");
                int numPages = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Autore: ");
                String author = scanner.nextLine();
                System.out.print("Editore: ");
                String publisher = scanner.nextLine();

                catalog[i] = new Book(title, numPages, author, publisher);
                System.out.println("Libro aggiunto al catalogo.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                i--;
            }
        }

        System.out.println("Libri:");
        for (Book book : catalog) {
            System.out.println("Titolo: " + book.getTitle());
            System.out.println("Pagine: " + book.getNumPages());
            System.out.println("Autore: " + book.getAuthor());
            System.out.println("Editore: " + book.getPublisher());
            System.out.println();
        }
        scanner.close();
    }
}
