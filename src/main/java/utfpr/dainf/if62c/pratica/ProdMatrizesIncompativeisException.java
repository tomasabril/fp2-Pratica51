/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utfpr.dainf.if62c.pratica;

/**
 *
 * @author tomas
 */
public class ProdMatrizesIncompativeisException extends MatrizesIncompativeisException {

	public ProdMatrizesIncompativeisException(Matriz m1, Matriz m2) {
		super(m1, m2, String.format("Matrizes de [%d][%d] e [%d][%d] não podem ser multiplicadas"
	          , m1.getMatriz().length, m1.getMatriz()[0].length
		  , m2.getMatriz().length, m2.getMatriz()[0].length )); }
}
