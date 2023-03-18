public class Imobiliaria {
    String telefone;
    String nome;
    String cidade;

    Apartamento []apartamentos=new Apartamento[30];

    public Imobiliaria(String telefone, String nome, String cidade) {
        this.telefone = telefone;
        this.nome = nome;
        this.cidade = cidade;
    }

    void mostraInfos(){
        System.out.println("Tel: "+this.telefone);
        System.out.println("Nome: "+this.nome);
        System.out.println("Cidade: "+this.cidade);
    }

    void addApartamento(Apartamento novoApartamento){
        for (int i = 0; i < apartamentos.length; i++) {
            if(apartamentos[i]==null){
                apartamentos[i]=novoApartamento;
                break;
            }

        }
    }

    void ajustaAluguel(){
        for (int i = 0; i < apartamentos.length; i++) {
            if(apartamentos[i]!=null){
                apartamentos[i].aluguel= apartamentos[i].aluguel*5/100+apartamentos[i].aluguel;
            }
        }
    }

    void mediaArea()
    {
        double area = 0;
        int cont = 0;
        int media;
        double m;
        for (int i = 0; i < apartamentos.length; i++) {
            if(apartamentos[i]!=null){
                if(apartamentos[i].numQuartos <= 2){
                    area += apartamentos[i].area;
                    cont++;
                }
                m = area/cont;
                media = (int) m;
            }
        }

    }
}