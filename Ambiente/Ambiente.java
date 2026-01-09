public class Ambiente {

    public static void main(String[] args) {
        String ambiente = args[0];
        if (ambiente.equals("Dev")) {
            System.out.print("Executando ambiente Dev");
        } else if (ambiente.equals("Teste")) {
            System.out.print("Executando ambiente Teste");
        } else {
            System.out.print("Não foi possível logar no ambiente");
        }
    }
}