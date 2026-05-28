package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	public String getMyChoice () {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner mychoice = new Scanner(System.in);
		//String choice = mychoice.next();
		//mychoice.close();
		//System.out.println(choice); 
		
			while(true){
				
				String choice = mychoice.next();
				
			if(choice.equals( "r") || choice.equals( "s") || choice.equals("p")){
				
				return choice;
			}
				System.out.println("正しいじゃんけんの手を入力してください");
		}		
	}
	
	
	public String getRandom () {
		String[] choices = {"グー", "チョキ","パー"};
		
		int val1 = (int)Math.floor(Math.random() * 3);
		
		return(choices[val1]);
		
	}
	
	public void playGame () {
		HashMap<String,String> output = new HashMap <String,String>();
		
		output.put("r","グー");
		output.put("s","チョキ");
		output.put("p","パー");
		
		String Mychoice = getMyChoice () ;
		String Enemychoice =  getRandom ();
		
		String myHand = output.get(Mychoice);
		
		System.out.println("自分の手は" +myHand);
		System.out.println("相手の手は" + Enemychoice);
	
		if(myHand.equals(Enemychoice)){
			System.out.println("あいこです");
		} else if (myHand == "グー" && Enemychoice == "チョキ") {
			System.out.println("自分の勝ちです");
		} else if (myHand == "チョキ" && Enemychoice == "パー") {
			System.out.println("自分の勝ちです");
		} else if (myHand == "パー" && Enemychoice == "グー") {
			System.out.println("自分の勝ちです");
		} else if (myHand == "グー" && Enemychoice == "パー") {
			System.out.println("自分の負けです");
		} else if (myHand == "チョキ" && Enemychoice == "グー") {
			System.out.println("自分の負けです");
		} else if (myHand == "パー" && Enemychoice == "チョキ") {
			System.out.println("自分の負けです");
		}
		
	}

}
