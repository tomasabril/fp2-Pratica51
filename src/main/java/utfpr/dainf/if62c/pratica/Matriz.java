package utfpr.dainf.if62c.pratica;

import java.util.Arrays;

/**
 * Representa uma matriz de valores double.
 * Tomas Abril
 */
public class Matriz {
    
    // a matriz representada por esta classe
    private final double[][] mat;
    
    /**
     * Construtor que aloca a matriz.
     * @param m O número de linhas da matriz.
     * @param n O número de colunas da matriz.
	 * @throws MatrizInvalidaException
     */
    public Matriz(int m, int n) throws MatrizInvalidaException {
	if(m<=0 || n<=0) {
		throw new MatrizInvalidaException(m, n);
	}
        mat = new double[m][n]; }
    
    /**
     * Retorna a matriz representada por esta classe.
     * @return A matriz representada por esta classe
     */
    public double[][] getMatriz() {
        return mat; }
    
    /**
     * Retorna a matriz transposta.
     * @return A matriz transposta.
	 * @throws MatrizInvalidaException
     */
    public Matriz getTransposta() throws MatrizInvalidaException {
        Matriz t = new Matriz(mat[0].length, mat.length);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                t.mat[j][i] = mat[i][j]; } }
        return t; }
    
    /**
     * Retorna a soma desta matriz com a matriz recebida como argumento.
     * @param matB A matriz a ser somada
     * @return A soma das matrizes
	 * @throws MatrizInvalidaException
     */
    public Matriz soma(Matriz matB) throws MatrizInvalidaException {
	if( mat.length != matB.getMatriz().length 
	  || mat[0].length != matB.getMatriz()[0].length ) {
		throw new SomaMatrizesIncompativeisException(this, matB); }
	Matriz s = new Matriz(mat.length, mat[0].length);
	for( int i=0; i < mat.length; i++) {
		for( int j=0; j < mat[0].length; j++) {
			s.getMatriz()[i][j] = mat[i][j] + matB.getMatriz()[i][j]; }}
	return s; }

    /**
     * Retorna o produto desta matriz com a matriz recebida como argumento.
     * @param mat2 A matriz a ser multiplicada
     * @return O produto das matrizes
	 * @throws MatrizInvalidaException
     */
    public Matriz prod(Matriz mat2) throws MatrizInvalidaException {
	if( mat[0].length != mat2.getMatriz().length ) {
            throw new ProdMatrizesIncompativeisException(this, mat2); }
	
	Matriz p = new Matriz(mat.length, mat2.getMatriz()[0].length);
	for(int i=0; i<mat2.getMatriz()[0].length; i++) {
		for(int j=0; j<mat.length; j++) {
			for(int k=0; k<mat[0].length; k++) {
				p.getMatriz()[i][j] += mat[i][k] * mat2.getMatriz()[k][j]; }}}
	return p; }

    /**
     * Retorna uma representação textual da matriz.
     * Este método não deve ser usado com matrizes muito grandes
     * pois não gerencia adequadamente o tamanho do string e
     * poderia provocar um uso excessivo de recursos.
     * @return Uma representação textual da matriz.
     */
    @Override
    public String toString() {
   /*     StringBuilder s = new StringBuilder();
        for (double[] linha : mat) {
            s.append("[ ");
            for (double x : linha) {
                s.append(x).append(" | "); }
            s.append("]\n"); }
        return s.toString(); }
    */
	return Arrays.deepToString(mat); }
}
