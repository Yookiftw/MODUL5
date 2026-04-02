public class RekeningBank {
    private String noRekening;
    private double saldo;

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double newSaldo){
        if (newSaldo < 0){
            System.out.println("Saldo tidak boleh negatif");
        } 
        
        else {
            saldo = newSaldo;
        }
    }
}