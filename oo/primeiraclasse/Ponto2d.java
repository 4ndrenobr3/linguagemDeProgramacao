package oo.primeiraclasse;

public class Ponto2d {
    //Atributos
    private int x;
    private int y;

    //Método construtor
    public Ponto2d(int a, int b){
        x = a;
        y = b;
    }

    //Método distancia
    public double distancia(Ponto2d p){
        double distX = p.x - x;
        double distY = p.y - y;

        return Math.sqrt((distX * distX) + (distY * distY));
    }
}