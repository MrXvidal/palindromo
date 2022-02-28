package poli;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.*;

public class Polindromo {

	public static void main(String[] args){
	
	Scanner nombre = new Scanner(System.in);
	String word;
	char[] palindromo;
	int izq, der;
	System.out.println("Dame una palabra");
	word = nombre.nextLine();
	word = word.toLowerCase();
	word = word.replace(" "," ");
	palindromo = word.toCharArray();
	izq = 0;
	der = palindromo.length - 1;
	
	while(izq < der){
        if(palindromo[izq] == palindromo[der]){
            der --;
            izq++;
        }else{
            System.out.println("La palabra no es un palindromo");
            break;
        }
    }
    
    if (izq == der){
        System.out.println("La palabra es un palindromo");
    }
 }
 
}