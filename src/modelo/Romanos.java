/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import static java.lang.System.exit;	
	import static java.lang.System.in;
	import static java.lang.System.out;
	import static java.lang.Integer.parseInt;
	import java.util.Scanner;
	public class Romanos{
	public static final void main(String args[]){
	out.println("Ingrese el numero que desea convertir a numero romano");
	String digitos=new Scanner(in).nextLine();
	int numero=0;
	try{numero=parseInt(digitos);}
	catch(NumberFormatException e){exit(0);}
	if(numero<1||numero>1000){exit(0);}
	int digito1=digitos.length()>3?parseInt(""+digitos.charAt(digitos.length()-4)):0;
	int digito2=digitos.length()>2?parseInt(""+digitos.charAt(digitos.length()-3)):0;
	int digito3=digitos.length()>1?parseInt(""+digitos.charAt(digitos.length()-2)):0;
	int digito4=digitos.length()>0?parseInt(""+digitos.charAt(digitos.length()-1)):0;
	String salida="";
	switch(digito1){
	case 1:salida+="M";
	}
	switch(digito2){
	case 1:
	salida+="C";
	break;
	case 2:
	salida+="CC";
	break;
	case 3:
	salida+="CCC";
	break;
	case 4:
	salida+="CD";
	break;
	case 5:
	salida+="D";
	break;
	case 6:
	salida+="DC";
	break;
	case 7:
	salida+="DCC";
	break;
	case 8:
	salida+="DCCC";
	break;
	case 9:
	salida+="CM";
	}
	switch(digito3){
	case 1:
	salida+="X";
	break;
	case 2:
	salida+="XX";
	break;
	case 3:
	salida+="XXX";
	break;
	case 4:
	salida+="XL";
	break;
	case 5:
	salida+="L";
	break;
	case 6:
	salida+="LX";
	break;
	case 7:
	salida+="LXX";
	break;
	case 8:
	salida+="LXXX";
	break;
	case 9:
	salida+="XC";
	}
	switch(digito4){
	case 1:
	salida+="I";
	break;
	case 2:
	salida+="II";
	break;
	case 3:
	salida+="III";
	break;
	case 4:
	salida+="IV";
	break;
	case 5:
	salida+="V";
	break;
	case 6:
	salida+="VI";
	break;
	case 7:
	salida+="VII";
	break;
	case 8:
	salida+="VIII";
	break;
	case 9:
	salida+="IX";
	}
	out.println(salida);
	}
      }