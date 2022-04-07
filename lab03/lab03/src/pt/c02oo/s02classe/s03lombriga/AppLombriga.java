package pt.c02oo.s02classe.s03lombriga;

public class AppLombriga {

   public static void main(String[] args) {
      Toolkit tk = Toolkit.start();
      
      String lombrigas[] = tk.recuperaLombrigas();
      
      /* Escrever o código que chama as classes e instancia os objetos aqui */
      
      for (int l = 0; l < lombrigas.length; l++)
         System.out.println(lombrigas[l]);
      
      tk.gravaPasso("=====");  // Para cada animação, deve-se gravar um "=====" desses
      tk.gravaPasso("##O@@@##");
      tk.gravaPasso("#O@@@###");
      tk.gravaPasso("#O@@@@##");
      tk.gravaPasso("O@@@@###");
      tk.gravaPasso("@@@@O###");
      tk.gravaPasso("#@@@@O##");
      
      tk.stop();
   }

}
