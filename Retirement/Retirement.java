/*

Crie um programa que receba a idade de uma pessoa e a quantidade de tempo que essa pessoa contribuiu com a previdência,
depois verifique se ela pode aposentar ou não.

Nas regras desse programa a pessoa vai precisar ter, pelo menos, 55 anos e ter contribuído com, pelo menos, 25 anos.
Se ela passar nessas duas condições, então mostre pra ela uma mensagem dizendo que ela pode aposentar.

*/

public class Retirement{

	//declare variables
	private int age;
	private int yearsOfContribution;
	private boolean canGetRetired=false;
	private String result;


	//constructor
	public Retirement(){
	}

	//setters
	public void setAge(int age){
		this.age=age;
	}
	public void setYearsOfContribution(int yearsOfContribution){
		this.yearsOfContribution=yearsOfContribution;
	}

	//process
	public void calculate(){
		if((age>=55)&&(yearsOfContribution>=25)){
			canGetRetired=true;
		}
	}

	//getters
	public String Result(){

		if(canGetRetired){
			result="Entitled for retirement.";
		}else{
			result="Not entitled for retirement.";
		}

	return result;
	}
}