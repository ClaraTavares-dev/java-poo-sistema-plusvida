package imovel;

    public class ImovelTeste {
          public static void main(String[]args){

              System.out.println("==========================================");
              System.out.println("     TESTE DE UNIDADE - RANKING");
              System.out.println("==========================================");


              // criando um arranjo imóveis de teste
              Imovel imovelTop    = new Imovel(1, "Rua Teste01", "Casa", 99990.00);
              Imovel imovelMedio  = new Imovel(2, "Rua Teste02", "Casa", 199999.99);
              Imovel imovelAbaixo = new Imovel(3, "Rua Teste03", "Casa", -160000.00);
              Imovel imovelNegativo = new Imovel(4, "Rua Teste04", "Casa", -100.00);

              // Teste 1: deve ser TOP
              String obtido1 = classificarOuErro(imovelTop);
              verificar("Teste 01", "Imóvel de R$ " + imovelTop.getValor(), "TOP", obtido1);

                // Teste 2: deve ser Médio
              String obtido2 = classificarOuErro(imovelMedio);
              verificar("Teste 02", "Imóvel de R$ " + imovelMedio.getValor(), "Médio", obtido2);

                // Teste 3: deve ser Abaixo
              String obtido3 = classificarOuErro(imovelAbaixo);
              verificar("Teste 03", "Imóvel de R$ " + imovelAbaixo.getValor(), "Abaixo", obtido3);

                // Teste 4: valor negativo deve dar erro
              String obtido4 = classificarOuErro(imovelNegativo);
              verificar("Teste 04", "Imóvel de R$ " + imovelNegativo.getValor(), "dados inválidos", obtido4);

          }

        //devolve a mensagem do erro
        static String classificarOuErro(Imovel imovel) {
            try {
                return imovel.classificarRanking();
            } catch (IllegalArgumentException erro) {
                return erro.getMessage();
            }
        }
        // Mostra o resultado do imóvel e só avisa se ele desobedecer a regra
        static void verificar(String numero, String nome, String esperado, String obtido) {

              System.out.println(numero + " - " + nome + " = " + obtido);

            if (obtido.equals("dados inválidos")) {
                System.out.println("   FALHOU - não cumpre a regra");
            } else if (!obtido.equals(esperado)) {
                System.out.println("   FALHOU - não cumpre a regra");
                System.out.println("   esperado: " + esperado);
                System.out.println("   obtido:   " + obtido);
            }
            System.out.println("------------------------------------------");
        }
    }

