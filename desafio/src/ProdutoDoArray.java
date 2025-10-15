public class ProdutoDoArray{

    public static void main(String[] args){
        int[] numeros = {1, 2, 3, 4, 5};
        int[] resultado = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            int produto = 1;
            for (int j = 0; j < numeros.length; j++) {
                if (i != j) {
                    produto *= numeros[j];
                }
            }
            resultado[i] = produto;
        }
        System.out.println("Novo array com produtos:");
        for (int i = 0; i < resultado.length; i++) {
            System.out.println("Array[" + i + "] = " + resultado[i]);
        }
    }
}
