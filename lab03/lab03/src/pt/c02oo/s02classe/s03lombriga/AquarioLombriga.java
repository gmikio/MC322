package pt.c02oo.s02classe.s03lombriga;

public class AquarioLombriga {
    int aquarium_size;
    int worm_size;
    int worm_head_position;
    String orientation;
    String worm_in_aquarium;
    
    AquarioLombriga (int aquarium_size, int worm_size, int worm_head_position){
        this.aquarium_size = (aquarium_size > 15) ? 15 : aquarium_size;
        this.worm_size = (worm_size > aquarium_size - 2) ? aquarium_size - 2 : worm_size;
        this.worm_head_position = (worm_head_position + this.worm_size >= this.aquarium_size) ? 1 : worm_head_position;
        orientation = "left";
    }
    
    void Crescer (){
    	if (orientation == "left"){
	    	if (worm_head_position + worm_size < aquarium_size - 1) { // "-1" devido a estarmos lidando com a "posição no vetor"; aquarium_size -1 = maior posição no vetor possível para a lombriga poder crescer
	    		worm_size++;
	    	}
    	} else { // if orientation == "right"
	    	if (worm_head_position - worm_size < aquarium_size) {
	    		worm_size++;
	    	}
    	}
    }
    
    void Mover(){
    	if (orientation == "left"){
    		if (worm_head_position > 1) {
    			worm_head_position--;
    		} else Virar();
    		
    	} else { // if orientation == "right"
    		if (worm_head_position < aquarium_size - 2) { // aquarium_size - 2 é a última "posição no vetor" possível para a cabeça da lombriga, ou seja, a borda do aquario
    			worm_head_position++;
    		} else Virar();
    	}
    	
    }
    
    void Virar(){
    	if (orientation == "left"){
//        	System.out.println("worm_head_position = " + worm_head_position);
    		worm_head_position += worm_size - 1;
//        	System.out.println("worm_head_position = " + worm_head_position);
    		orientation = "right";
    	} else { // if orientation == "right"
    		worm_head_position = worm_head_position - worm_size + 1;
    		orientation = "left";
    	}
    }
    
    String Apresenta(){
        // ToDO: Implementar a representacao em String do worm_in_aquarium

    	if (orientation == "left"){
            worm_in_aquarium = "";
            for (int i = 0; i < worm_head_position; i++) worm_in_aquarium += "#";
            worm_in_aquarium += "O";
            for (int j = 1; j < worm_size; j++) worm_in_aquarium += "@";
            for (int k = worm_head_position + worm_size; k < aquarium_size; k++) worm_in_aquarium += "#";
            
    	} else { // if orientation == "right"
            worm_in_aquarium = "";
            for (int i = aquarium_size - 1; i > worm_head_position; i--) worm_in_aquarium = "#" + worm_in_aquarium;
            worm_in_aquarium = "O" + worm_in_aquarium;
            for (int j = 1; j < worm_size; j++) worm_in_aquarium = "@" + worm_in_aquarium;
            for (int k = worm_head_position - worm_size; k >= 0; k--) worm_in_aquarium = "#" + worm_in_aquarium;
    	}        
        
        return worm_in_aquarium;
    }
    
    
    public static void main(String[] args) {
    	
    	AquarioLombriga lombriga_no_aquario = new AquarioLombriga(10, 4, 2);
//    	lombriga_no_aquario.Crescer();
//    	lombriga_no_aquario.Crescer();
//    	lombriga_no_aquario.Crescer();
//    	lombriga_no_aquario.Crescer();
//
//    	lombriga_no_aquario.Mover();
//    	lombriga_no_aquario.Virar();
//    	
// 		System.out.println(lombriga_no_aquario.worm_size);
    	
    	System.out.println(lombriga_no_aquario.Apresenta());
    }

    
}