
package modelo;

import static java.lang.System.in;	
	import static java.lang.System.out;
	import java.util.HashMap;
	import java.util.Scanner;
	public class ClaveMorse{
	public static final void main(String args[]){
	HashMap<Character,String>cMorse=new HashMap<Character,String>();
	cMorse.put('A',".-");
	cMorse.put('B',"-...");
	cMorse.put('C',"-.-.");
	cMorse.put('D',"-..");
	cMorse.put('E',".");
	cMorse.put('F',"..-.");
	cMorse.put('G',"--.");
	cMorse.put('H',"....");
	cMorse.put('I',"..");
	cMorse.put('J',".---");
	cMorse.put('K',"-.-");
	cMorse.put('L',".-..");
	cMorse.put('M',"--");
	cMorse.put('N',"-.");
	cMorse.put('O',"---");
	cMorse.put('P',".--.");
	cMorse.put('Q',"--.-");
	cMorse.put('R',".-.");
	cMorse.put('S',"...");
	cMorse.put('T',"-");
	cMorse.put('U',"..-");
	cMorse.put('V',"...-");
	cMorse.put('W',".--");
	cMorse.put('X',"-..-");
	cMorse.put('Y',"-.--");
	cMorse.put('Z',"--..");
	cMorse.put('1',".----");
	cMorse.put('2',"..---");
	cMorse.put('3',"...--");
	cMorse.put('4',"....-");
	cMorse.put('5',".....");
	cMorse.put('6',"-....");
	cMorse.put('7',"--...");
	cMorse.put('8',"---..");
	cMorse.put('9',"----.");
	cMorse.put('0',"-----");
	cMorse.put(' ',"  ");
	HashMap<String,Character>mTexto=new HashMap<String,Character>();
	mTexto.put(".-",'A');
	mTexto.put("-...",'B');
	mTexto.put("-.-.",'C');
	mTexto.put("-..",'D');
	mTexto.put(".",'E');
	mTexto.put("..-.",'F');
	mTexto.put("--.",'G');
	mTexto.put("....",'H');
	mTexto.put("..",'I');
	mTexto.put(".---",'J');
	mTexto.put("-.-",'K');
	mTexto.put(".-..",'L');
	mTexto.put("--",'M');
	mTexto.put("-.",'N');
	mTexto.put("---",'O');
	mTexto.put(".--.",'P');
	mTexto.put("--.-",'Q');
	mTexto.put(".-.",'R');
	mTexto.put("...",'S');
	mTexto.put("-",'T');
	mTexto.put("..-",'U');
	mTexto.put("...-",'V');
	mTexto.put(".--",'W');
	mTexto.put("-..-",'X');
	mTexto.put("-.--",'Y');
	mTexto.put("--..",'Z');
	mTexto.put(".----",'1');
	mTexto.put("..---",'2');
	mTexto.put("...--",'3');
	mTexto.put("....-",'4');
	mTexto.put(".....",'5');
	mTexto.put("-....",'6');
	mTexto.put("--...",'7');
	mTexto.put("---..",'8');
	mTexto.put("----.",'9');
	mTexto.put("-----",'0');
	out.println("Ingresa el texto o codigo morse");
	String entrada=new Scanner(in).nextLine();
	entrada=entrada.toUpperCase();
	boolean morse=entrada.contains("\\.")||entrada.contains("-"),bandera=true;
	for(String elemento:entrada.split(morse?" ":"")){
	if(elemento.length()<1){
	bandera=!bandera;
	if(bandera){out.print(" ");}
	continue;
	}
	Object conversion=(morse?mTexto:cMorse).get(morse?elemento:elemento.charAt(0));
	if(conversion==null){continue;}
	out.print(conversion+(morse?"":" "));
	}
	}
	}
