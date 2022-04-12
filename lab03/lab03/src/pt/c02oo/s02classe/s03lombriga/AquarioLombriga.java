package pt.c02oo.s02classe.s03lombriga;

public class AquarioLombriga {
    int aquarium_size;
    int worm_size;
    int worm_head_position;
    String orientation;
    String worm_in_aquarium;
    
    AquarioLombriga (int aquarium_size, int worm_size, int worm_head_position){
        this.aquarium_size = (aquarium_size - worm_size > 15) ? 15 : aquarium_size;
        this.worm_size = (worm_size > aquarium_size) ? aquarium_size : worm_size;
        this.worm_head_position = (worm_head_position + (this.worm_size -1) > this.aquarium_size) ? 1 : worm_head_position; // "worm_size - 1" pois a cabeça tambem faz parte do tamanho da lombriga
        orientation = "left";
    }
    
    void Crescer (){
    	if (orientation == "left"){
	    	if (worm_head_position + (worm_size - 1) < aquarium_size) { 
	    		worm_size++;
	    	}
    	} else if (orientation == "right") {
	    	if (worm_head_position - worm_size > 0) {
	    		worm_size++;
	    	}
    	}
    }
    
    void Mover(){
    	if (orientation == "left"){
    		if (worm_head_position > 1) {
    			worm_head_position--;
    		} else Virar();
    		
    	} else if (orientation == "right") {
    		if (worm_head_position < aquarium_size) { 
    			worm_head_position++;
    		} else Virar();
    	}
    	
    }
    
    void Virar(){
    	if (orientation == "left"){
    		worm_head_position += worm_size - 1; 
    		orientation = "right";
    	} else if (orientation == "right"){
    		worm_head_position = worm_head_position - worm_size + 1; // "worm_size + 1" pois a cabeça tambem faz parte do tamanho da lombriga
    		orientation = "left";
    	}
    }
    
    String Apresenta(){
    	if (orientation == "left"){
            worm_in_aquarium = "";
            for (int i = 1; i < worm_head_position; i++) worm_in_aquarium += "#";
            worm_in_aquarium += "O";
            for (int j = 1; j < worm_size; j++) worm_in_aquarium += "@";
            for (int k = worm_head_position + worm_size - 1; k < aquarium_size; k++) worm_in_aquarium += "#";
            
    	} else if (orientation == "right"){
            worm_in_aquarium = "";
            for (int i = aquarium_size; i > worm_head_position; i--) worm_in_aquarium = "#" + worm_in_aquarium;
            worm_in_aquarium = "O" + worm_in_aquarium;
            for (int j = 1; j < worm_size; j++) worm_in_aquarium = "@" + worm_in_aquarium;
            for (int k = worm_head_position - worm_size; k > 0; k--) worm_in_aquarium = "#" + worm_in_aquarium;
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