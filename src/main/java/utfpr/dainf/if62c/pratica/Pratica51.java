package utfpr.dainf.if62c.pratica;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * por Tomás Abril
 */
public class Pratica51
{
    public static void main(String[] args) throws MatrizInvalidaException {
        Matriz orig = new Matriz(3, 2);
        double[][] m = orig.getMatriz();
        m[0][0] = 0.0;
        m[0][1] = 0.1;
        m[1][0] = 1.0;
        m[1][1] = 1.1;
        m[2][0] = 2.0;
        m[2][1] = 2.1;
        Matriz outra = new Matriz(3, 2);
        double[][] m2 = outra.getMatriz();
        //m2 = m;
	m2[0][0] = 0.0;
        m2[0][1] = 0.1;
        m2[1][0] = 1.0;
        m2[1][1] = 1.1;
        m2[2][0] = 2.0;
        m2[2][1] = 2.1;

	Matriz outra2 = new Matriz(3, 3);
        double[][] m3 = outra2.getMatriz();
        m3[0][0] = 0.0;
        m3[0][1] = 0.1;
        m3[0][2] = 0.1;
	m3[1][0] = 1.0;
        m3[1][1] = 1.1;
        m3[0][2] = 0.1;
	m3[2][0] = 2.0;
        m3[2][1] = 2.1;
	m3[0][2] = 0.1;
	
	Matriz outra3 = new Matriz(3, 3);
        double[][] m4 = outra3.getMatriz();
	m4[0][0] = 0.0;
        m4[0][1] = 0.1;
        m4[0][2] = 0.1;
	m4[1][0] = 1.0;
        m4[1][1] = 1.1;
        m4[0][2] = 0.1;
	m4[2][0] = 2.0;
        m4[2][1] = 2.1;
	m4[0][2] = 0.1;        

	try {
		Matriz outra4 = new Matriz(3,-1);
		System.out.println("Matriz original: \n" + outra4);}
	catch (MatrizInvalidaException e) {
		System.out.println(e); }
	try {
		Matriz somada = orig.soma(outra3);
		System.out.println("somada: \n" + somada); }
	catch (SomaMatrizesIncompativeisException e) {
		System.out.println(e); }
	try {
		Matriz prod = orig.prod(outra);
		System.out.println("Matriz multiplicada: \n" + prod); }
	catch (ProdMatrizesIncompativeisException e) {
		System.out.println(e); }
	
	try {
		Matriz transp = orig.getTransposta();
		Matriz somada = orig.soma(outra);
		Matriz mult   = outra2.prod(outra3);
		System.out.println("Matriz original: \n" + orig);
		System.out.println("Matriz transposta: \n" + transp);
		System.out.println("Matriz somada: \n" + somada);
		System.out.println("Matriz multiplicada: \n" + mult);} 
	catch (MatrizInvalidaException | ProdMatrizesIncompativeisException | SomaMatrizesIncompativeisException e) {
		System.out.println(e); }

    }
}
