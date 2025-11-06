public class Cachorro{

    //atributos
    public String nome;
    public String raca;
    public int idade;
    
    /*Construtor = método que inicializa objetos desta classe.
     * Defiinição: método especial que inicializa objetos desta classe
     * Sempre tem o mesmo nome da classe
     * Não tem retorno
     * Pode-se ter mais de um construtor na mesma classe
    */
    

    public Cachorro(String n, String r, int i){
        this.nome = n;
        this.raca = r;
        this.idade = i;
    }

    //método latir que não retorna nada:
    
    public void latir(){
        System.out.println(x:"Au au");
    }
    public String latir2(){
        return "Au au";
    }

    public void imprimir(){

    System.out.println("nome:"+nome +"raça: "+raca +" idade: "+idade);
    }
}
