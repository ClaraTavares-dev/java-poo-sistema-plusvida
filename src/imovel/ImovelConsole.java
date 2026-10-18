package imovel;

public class ImovelConsole {
    public static void main(String[] args) {

        Imovel[] imoveis = new Imovel[4];

        imoveis[0] = new Imovel(14, "Rua do Imperador, 350 - Santo Antônio", "Casa", 4000000);
        imoveis[1] = new Imovel(15, "Rua da Aurora, 450 - Boa Vista", "Apartamento",200000);
        imoveis[2] = new Imovel(16, "Avenida Boa Viagem, 30 - Boa Viagem", "Casa", 500000);
        imoveis[3] = new Imovel(17, "Rua do Apolo, 230 - Recife Antigo", "Sala Comercial", 90000);

        for (int i = 0; i < imoveis.length; i++) {
            imoveis[i].calcularDesconto();
            exibirImovel(imoveis[i], "IMÓVEL " + (i + 1));
        }
    }

    public static void exibirImovel(Imovel imovel, String titulo) {
        System.out.println("==============================");
        System.out.println(" "  + titulo);
        System.out.println("==============================");
        System.out.println("Imóvel ID:...................: " + imovel.getIdImovel() );
        System.out.println("Endereço.....................: " + imovel.getEndereco());
        System.out.println("Tipo.........................: " + imovel.getTipo() );
        System.out.printf("Valor original:..............: R$ %.1f%n", imovel.getValorOriginal());
        System.out.printf("Valor com desconto:..........: R$ %.1f%n", imovel.getValor());
        System.out.println("RANKING......................: " + imovel.classificarRanking());

    }
}