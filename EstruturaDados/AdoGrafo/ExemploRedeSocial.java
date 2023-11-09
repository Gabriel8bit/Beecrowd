package AdoGrafo;

public class ExemploRedeSocial {
    public static void main(String[] args) {
        RedeSocial redeSocial = new RedeSocial();

        Pessoa gabriel = new Pessoa("Gabriel");
        Pessoa julia = new Pessoa("Julia");
        Pessoa marcos = new Pessoa("Marcos");
        Pessoa ana = new Pessoa("Ana");
        Pessoa carla = new Pessoa("Carla");
        Pessoa pedro = new Pessoa("Pedro");

        redeSocial.adicionarPessoa(gabriel);
        redeSocial.adicionarPessoa(julia);
        redeSocial.adicionarPessoa(marcos);
        redeSocial.adicionarPessoa(ana);
        redeSocial.adicionarPessoa(carla);
        redeSocial.adicionarPessoa(pedro);

        // Amizades em Comum
        redeSocial.adicionarRelacionamento(gabriel, julia);
        redeSocial.adicionarRelacionamento(gabriel, marcos);
        redeSocial.adicionarRelacionamento(gabriel, ana);
        redeSocial.adicionarRelacionamento(gabriel, carla);

        redeSocial.adicionarRelacionamento(carla, pedro);
        redeSocial.adicionarRelacionamento(carla, ana);

        redeSocial.adicionarRelacionamento(ana, gabriel);
        redeSocial.adicionarRelacionamento(ana, pedro);
        redeSocial.adicionarRelacionamento(ana, julia);
        redeSocial.adicionarRelacionamento(ana, carla);

        redeSocial.adicionarRelacionamento(julia, gabriel);
        redeSocial.adicionarRelacionamento(julia, ana);

        redeSocial.adicionarRelacionamento(pedro, carla);
        redeSocial.adicionarRelacionamento(pedro, ana);
        redeSocial.adicionarRelacionamento(pedro, marcos);

        redeSocial.adicionarRelacionamento(marcos, gabriel);
        redeSocial.adicionarRelacionamento(marcos, pedro);

        redeSocial.mostrarAmigosEmComum();
    }
}
