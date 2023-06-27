package JFoPractice6;

public class ArteASCIIProgramatica {
     public static void main(String[] args) {
        createRectangle(5, 3);
        System.out.println();
        createTriangle(4);
    }

    public static void createRectangle(int largura, int altura) {
        if (largura < 1 || altura < 1) {
            System.out.println("As dimensões do retângulo devem ser maiores ou iguais a 1.");
            return;
        }

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void createTriangle(int tamanhoPerna) {
        if (tamanhoPerna < 1) {
            System.out.println("O tamanho da perna do triângulo deve ser maior ou igual a 1.");
            return;
        }

        for (int i = 0; i < tamanhoPerna; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
}
}