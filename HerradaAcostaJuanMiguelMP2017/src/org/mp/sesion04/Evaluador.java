package org.mp.sesion04;

import java.util.StringTokenizer;
/**
 * Evaluador
 *
 * @author Juan Miguel Herrada Acosta
 * @version 07.05.2017
 */
public class Evaluador{
	private GenericStack<Integer> pila;
	/**
	 * Constructor inicializa pila
	 */
	public Evaluador(){
		this.pila = new GenericStack<Integer>();
	}
	/**
	 * Elimina los espacios de una cadena y lo devuelve un Array de String.
	 * @param expresion
	 * @return sinBlancos
	 */
	public String[] eliminarBlancos(String expresion){
		StringTokenizer clasificacion = new StringTokenizer(expresion, "+-*/ ", true);
		GenericQueue <String> colaSinBlancos = new GenericQueue<String>();
		String token;
		while(clasificacion.hasMoreTokens()){
			token = clasificacion.nextToken();
			if(!token.equals(" ")){
				colaSinBlancos.enqueue(token);
			}
		}
		String[] sinBlancos = new String[colaSinBlancos.getSize()];
		for (int i = 0; i < sinBlancos.length;i++){
			sinBlancos[i] = colaSinBlancos.dequeue();
		}
		return sinBlancos;
	}
	/**
	 * Procesa un operador con dos valores de la pila
	 * @param op
	 * @param operandosPila
	 *
	 */
	public void procesarUnOperador(char op, GenericStack<Integer> operandosPila) {

		int op2 = ((Integer)(operandosPila.pop())).intValue();
		int op1 = ((Integer)(operandosPila.pop())).intValue();
		Integer resultado = 0;

		switch(op){
		case '+':
			resultado = new Integer(op1+op2);
			operandosPila.push(resultado);
			break;
		case '-':
			resultado = new Integer(op1-op2);
			operandosPila.push(resultado);
			break;
		case '*':
			resultado = new Integer(op1*op2);
			operandosPila.push(resultado);
			break;
		case '/':
			if(op2 == 0){
				throw new RuntimeException("No es posible una división por cero");
			}else{
				resultado = new Integer(op1/op2);
				operandosPila.push(resultado);
			break;
			}
		}
	}
	/**
	 * Procesa un String hasta obtener el valor definitivo dejandolo solo en digitos
	 * @param op
	 * @param operandosPila
	 *
	 */
	public int evaluarExpresion(String expresion){
		String[] sinBlancos = eliminarBlancos(expresion);
		String expresionSinBlancos = "";
		String token;
		for (int i = 0;i<sinBlancos.length;i++){
			expresionSinBlancos += sinBlancos[i];
		}
		if(soloDigitos(expresionSinBlancos)){
			pila.push(Integer.parseInt(expresionSinBlancos));
		}else{
			for (int i = 0; i < sinBlancos.length; i++) {
				token = sinBlancos[i];
				if (esOperador(token)) {
					char op = token.charAt(0);
					procesarUnOperador(op, pila);
				} else {
					pila.push(Integer.parseInt(token));
				}
			}
		}
		return ((Integer)(pila.pop())).intValue();
	}
	/**
	 * Comprueba si un String contiene algun operador
	 * @param token
	 * @return true or false
	 */
	private boolean esOperador(String token){
		if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/"))
			return true;
		else
			return false;
	}
	/**
	 * Comprueba si un String esta solo compuesto por digiotos
	 * @param expresion
	 * @return true or false
	 */
	private boolean soloDigitos(String expresion){
		char caracter;
		for(int i= 0 ; i < expresion.length() ; i++){
			caracter = expresion.charAt(i);
			if(!Character.isDigit(caracter)){
				return false;
			}
		}
		return true;
	}
}
