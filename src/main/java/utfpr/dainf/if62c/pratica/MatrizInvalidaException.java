package utfpr.dainf.if62c.pratica;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomas
 */
public class MatrizInvalidaException extends Exception {
	protected final int i;
	protected final int j;
	
	public MatrizInvalidaException(int i, int j) {
		super( String.format("Matriz de [" +i +"][" +j +"] não pode ser criada") );
		this.i = i;
		this.j = j; }
	
	public MatrizInvalidaException() {
		super(String.format("MAtriz nao pode ser criada"));
		this.i=0;
		this.j=0; }
	
	public int getI() {
		return i; }
	
	public int getJ() {
		return j; }
}
