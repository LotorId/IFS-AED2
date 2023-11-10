package atividades.imagemOtimizada;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Image {

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    private int size;
    private ArrayList<Pixel> pixels = new ArrayList<>();

    public Image(int size) {
        this.size = size;
    }

    public void generateImage() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int number = random.nextInt(5);
                if (number == 1) {
                    pixels.add(new Pixel(j, i));
                }
            }
        }
    }

    public void insertImage() {
        /*
        * 2x2 : 0110
        * 3x3 : 000010000
        * 5x5 : 00000000000001111000000100100000011110000000000000
        * 10x10 : 0000000000000000000000110011000100110010001000010000010010000000110000000000000000111111000000000000
        * 15x15 : 000000000000000000000000000000000000000000000000000000000000000000000000000000000010000000000000111000000000001111100000000011111110000000111111111000000000000000000000000000000000000000000000000000000000000000000000000000000
        * 15x15 : 000000000000000000000000000000000000000000000000111000111000001000101000100010000010000010001000000000100000110000011000000001101100000000000010000000000000000000000001111111111100000000000000000000000000000000000000000000000
        * */

        int counter = 0;

        System.out.println("Insira a string da imagem: ");
        String image = scanner.next();
        String[] vetorImage = image.split("");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int number = Integer.parseInt(vetorImage[counter]);
                if (number == 1) {
                    pixels.add(new Pixel(i, j));
                }
                counter++;
            }
        }
    }
    public void printImage() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                boolean find = false;
                for (Pixel pixel : pixels) {
                    if (pixel.getColumn() == i && pixel.getLine() == j) {
                        find = true;
                        break;
                    }
                }
                if (find) {
                    System.out.print("\u001B[41m \u001B[40m");
                } else {
                    System.out.print("\u001B[40m \u001B[40m");
                }
            }

            System.out.println();
        }
    }
}
