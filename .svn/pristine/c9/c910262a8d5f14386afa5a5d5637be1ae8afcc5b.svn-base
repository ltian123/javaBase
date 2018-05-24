package day16.home;

import java.util.Arrays;

public class Question {
	String text;
	String[]options;
	char[]answers;
	public Question()
	{
		
	}
	public Question(String text,String[]options,char []answer){
		this.text = text;
		this.answers = answer;
		this.options = options;
	}
	public boolean check(char[] answers) {
		Arrays.sort(answers);
		Arrays.sort(this.answers);
		return Arrays.equals(answers, this.answers);
	}
	
	public String toString()
	{
		String s = text+"\n";
		for(int i = 0;i<options.length;i++){
			s=s+options[i]+"\n";
		}
		return s;
	}
}
