package n3exercici1;

import java.util.ArrayList;

public class GestioButaques {
	
	
	private ArrayList<Butaca> butaques;
	
	
	public GestioButaques() {
		this.butaques = new ArrayList<Butaca>();
	}
	
	public ArrayList<Butaca> getButaques() {
		return this.butaques;
	}
	
	public void afegirButaca(Butaca b) throws ExcepcioButacaOcupada {
		int butacaTrobada = -1, fila = 0, seient = 0;
		fila = b.getFila();
		seient = b.getSeient();
		butacaTrobada = cercarButaca(fila, seient);
		
		if(butacaTrobada != -1) {
			throw new ExcepcioButacaOcupada("Aquesta butaca està ocupada.");
		}
		
		this.butaques.add(b);
	}
	
	public void eliminarButaca(int fila, int seient) throws ExcepcioButacaLliure {
		int butacaTrobada = -1;
		butacaTrobada = cercarButaca(fila, seient);
		
		if(butacaTrobada == -1) {
			throw new ExcepcioButacaLliure("Aquesta butaca està lliure.");
		} 
		
		this.butaques.remove(butacaTrobada);
	}
	
	public int cercarButaca(int fila, int seient) {
		int i = 0, butacaTrobada = -1;
		
		while((i < this.butaques.size()) && (butacaTrobada == -1)) {
			if((this.butaques.get(i).getFila() == fila) && (this.butaques.get(i).getSeient() == seient)) {
				butacaTrobada = i;
			} else {
				butacaTrobada = -1;
			}
			i++;
		}
		return butacaTrobada;
	}



}
