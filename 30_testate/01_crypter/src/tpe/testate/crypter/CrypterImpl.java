package tpe.testate.crypter;

public class CrypterImpl implements Crypter{

	
	@Override
	public String encrypt(String input) throws IllegalArgumentException{
		String cryptedText="";
		String text="";
		text=input.toLowerCase();
		char[] array=text.toCharArray();
		for(int i=0; i<array.length;i++){
			if((array[i]>47&&array[i]<58)||(array[i]>96&&array[i]<128)||array[i]==32){
		switch(array[i]){
		case 'e': { cryptedText=cryptedText+'3'; break;}
		case '3': { cryptedText=cryptedText+'e'; break;}
		case 'l': { cryptedText=cryptedText+'1'; break;}
		case '1': { cryptedText=cryptedText+'l'; break;}
		case 'o': { cryptedText=cryptedText+'0'; break;}
		case '0': { cryptedText=cryptedText+'o'; break;}
		case 'a': { cryptedText=cryptedText+'4'; break;}
		case '4': { cryptedText=cryptedText+'a'; break;}
		case 't': { cryptedText=cryptedText+'7'; break;}
		case '7': { cryptedText=cryptedText+'t'; break;}
		default: {cryptedText=cryptedText+array[i]; break;
		} 
		}
		
			}
			else{
				throw new IllegalArgumentException();
			}}
	
		return cryptedText;
	}

	@Override
	public String decrypt(String input) throws IllegalArgumentException {
		for(int i=0; i<input.length();i++){
			if(Character.isUpperCase(input.charAt(i))) {
				throw new IllegalArgumentException();
		}}
			
		return encrypt(input);}
	
		
		
		
	}

