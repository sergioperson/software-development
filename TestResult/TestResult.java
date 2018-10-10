/*
TestResult.java
S Rodriguez
10/09/2018
*/

public class TestResult{

	//declare variables
	private Double englishNote;
	private Double mathNote;
	private final Double PASSNOTE;
	private final Double LOWESTNOTE;
	private Double finalNote;
	private String result;

	//constructor
	public TestResult(){
		PASSNOTE=150.0;
		LOWESTNOTE=60.0;
	}

	//setters
	public void setEnglishNote(Double englishNote){
		this.englishNote=englishNote;
	}
	public void setMathNote(Double mathNote){
		this.mathNote=mathNote;
	}

	//process
	public void compute(){
		finalNote=englishNote+mathNote;
		if((finalNote>=PASSNOTE)&&(englishNote>=60)&&(mathNote>=60)){
			result="Passed!";
		}else{
			result="Failed!";
		}
	}

	//output
	public String getResult(){
		return result;
	}

}