package EJERPOOY.temperatura;

public class temperatura {
    public double temperatura;

    public temperatura(double temperatura) {
        this.temperatura = temperatura;
    } 
    public double CalcularT(){  
        return (temperatura * 1.8) + 32; 
    }

}
