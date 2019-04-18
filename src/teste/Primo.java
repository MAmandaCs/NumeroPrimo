package teste;

public class Primo {

	private int num;

	public Primo(){
		
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public boolean verifica(int num) {
		
		if(num == 0 || num == 1 || num == 0){
			return false;
		}
		
		if(num < 0){
			for(int i = -2; i > num; i--){
				if(num % i == 0){
					return false;
				}
			}
		}
		
		for (int i = 2; i < num ; i++){
			if (num % i == 0){
				return false;
			}
		}
		return true;
	}
	
}
