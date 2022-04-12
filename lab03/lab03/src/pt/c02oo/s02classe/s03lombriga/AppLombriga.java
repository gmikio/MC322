package pt.c02oo.s02classe.s03lombriga;

public class AppLombriga {

   public static void main(String[] args) {
      Toolkit tk = Toolkit.start();
      
      
      String lombrigas[] = tk.recuperaLombrigas();
      
      
      for (int l = 0; l < lombrigas.length; l++) {
         System.out.println(lombrigas[l]);
  		 Animacao animacao = new Animacao(lombrigas[l]);
  	     tk.gravaPasso("=====");  // Para cada animacao, deve-se gravar um "=====" desses
	     tk.gravaPasso(animacao.Apresenta());

  	     for (int i = animacao.comandos.length(); i > 0; i--) {
  	    	 animacao.Passo();
  	    	 tk.gravaPasso(animacao.Apresenta());
  	     }
      }
     	     
      tk.stop();      
   }

}
