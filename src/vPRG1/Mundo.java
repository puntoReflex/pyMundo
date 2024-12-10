package vPRG1;

class Mundo {
    public static void main(String[] args) {
        int[][] mapa = {
                { 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 9, 9, 9, 0, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 },
                { 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 3, 3, 3, 3, 3, 3, 3, 3 },
                { 7, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 7, 3, 3, 3, 3 },
                { 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 2, 2, 3, 3 },
                { 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 7, 7, 2, 2, 3 },
                { 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 8, 7, 7, 2, 3 },
                { 5, 5, 5, 5, 5, 0, 2, 0, 5, 5, 5, 5, 5, 0, 0, 0, 2, 0, 0, 0, 0, 5, 7, 2, 2 },
                { 5, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 5, 0, 0, 0, 2, 0, 0, 0, 0, 8, 7, 7, 2 },
                { 5, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 5, 0, 0, 0, 2, 0, 0, 0, 0, 0, 5, 7, 7 },
                { 5, 0, 1, 1, 1, 0, 2, 0, 1, 1, 1, 0, 5, 8, 8, 8, 2, 8, 8, 8, 8, 5, 5, 7, 7 },
                { 5, 0, 1, 1, 1, 1, 2, 1, 1, 1, 1, 0, 5, 8, 6, 6, 2, 6, 6, 6, 5, 5, 5, 7, 7 },
                { 5, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 5, 6, 6, 6, 2, 6, 5, 5, 5, 5, 5, 7, 7 },
                { 5, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 5, 6, 6, 6, 2, 5, 5, 5, 8, 8, 8, 5, 7 },
                { 5, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 5, 6, 6, 5, 2, 5, 6, 6, 6, 8, 8, 5, 7 },
                { 5, 0, 1, 1, 9, 1, 1, 1, 9, 1, 1, 0, 5, 6, 5, 5, 2, 6, 6, 8, 8, 8, 8, 8, 7 },
                { 5, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 5, 5, 5, 6, 2, 6, 6, 6, 8, 1, 1, 1, 1 },
                { 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 4, 4, 6, 2, 2, 2, 2, 2, 9, 0, 0, 0 },
                { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 4, 6, 6, 8, 8, 8, 8, 1, 0, 0, 0 },
                { 7, 7, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 6, 6, 8, 8, 8, 8, 1, 0, 5, 0 }
        };
        printMap(mapa);
    }

    static void printMap(int[][] mapa) {
        for (int fila = 0; fila < mapa.length; fila++) {
            for (int columna = 0; columna < mapa[fila].length; columna++) {
                System.out.print(mapa[fila][columna]);
            }
            System.out.println();
        }
    }
}
