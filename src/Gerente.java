package Sistema_RH.src;

public class Gerente extends Funcionario{

    private double bonusAnual;

    public Gerente(String nome, String cpf, double salario){
        super( nome, cpf, salario);
        this.bonusAnual = bonusAnual;
    }

    public double getBonusAnual(){
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual){
        this.bonusAnual = bonusAnual;
    }

    
    
}
