package Sistema_RH.src;

public class Gerente extends Funcionario{

    private double bonusAnual;

    public Gerente(String nome, String cpf, double salario, double bonusAnual){
        super( nome, cpf, salario);
        this.bonusAnual = bonusAnual;
    }

    public double getBonusAnual(){
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual){
        this.bonusAnual = bonusAnual;
    }

    public double remuneraçãoTotal(){
        double total = getSalario() + (getSalario() * bonusAnual);
        return total;
    }

    @Override
    public void exibirDados (){
        System.out.println("Nome: " + getNome());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Salario: " + getSalario());
        System.out.println("Salario + Bonus: " + remuneraçãoTotal());
    }
    
}
