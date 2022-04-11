package pt.c02oo.s02classe.s03lombriga;

public class Animacao {
    int aquarium_size;
    int worm_size;
    int worm_head_position;
    AquarioLombriga lombriga_no_aquario;
    String  comandos;
	
	public Animacao (String animacao) {
		aquarium_size = Integer.parseInt(animacao.substring(0, 2));
		worm_size = Integer.parseInt(animacao.substring(2, 4));
		worm_head_position = Integer.parseInt(animacao.substring(4, 6));
    	lombriga_no_aquario = new AquarioLombriga(aquarium_size, worm_size, worm_head_position);
		
		comandos = animacao.substring(6);
		
	}
	
	String Apresenta() {
		return lombriga_no_aquario.Apresenta();
	}
	
	void Passo() {
		switch (comandos.charAt(0)) {
		case 'C':
			lombriga_no_aquario.Crescer();
			break;
		case 'M':
			lombriga_no_aquario.Mover();
			break;
		case 'V':
			lombriga_no_aquario.Virar();
			break;		
		}
		
		comandos = comandos.substring(1);
	}
	
    public static void main(String[] args) {
    	
    	Animacao teste_animacao = new Animacao("080403MCMVM");
    	
    	
    	
    }
	
}
