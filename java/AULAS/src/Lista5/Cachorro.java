package Lista5;

public class Cachorro extends Animais {
	
	//ATRIBUTO
    private boolean latidoAlto;//"V" "F"
    //CONSTRUTOR
  

	public Cachorro(String especie, boolean latidoAlto) {
		super(especie);
		this.latidoAlto = latidoAlto;
		
		
	}

	public Cachorro(String especie, int anoNasciment, boolean latidoAlto) {
		super(especie, anoNasciment);
		this.latidoAlto = latidoAlto;       
		// TODO Auto-generated constructor stub
	}

	// ENCAPSULAMENTO
    public boolean isLatidoAlto() {
        return latidoAlto;
    }

    public void setLatidoAlto(boolean latidoAlto) {
        this.latidoAlto = latidoAlto;
    }

    @Override
	@Override
    public void emiteSom(){
        System.out.println("au au au au au au ");
    }
}

	

}
