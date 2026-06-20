/*

TIPOS PRIMITIVOS
 
Os tipos primitivos em java são os tipos de dados nativos da linguagem que servem como blocos de construção básicos para a manipulação de dados.
Eles representam valores brutos, possuem tamanho fixo na memória e não são objetos

Java possui exatamente 8 tipos primitivos, divididos em quatro categorias:

1 - inteiros
byte: 	8 bits
short: 	16 bits
int: 	32 bits :: tipo padrao para inteiros
long: 	64 bits :: numeros muito grandes :: exige a letra 'L' :: long populacao = 8000000000000L;

2 - ponto flutuante
float:	32 bits	:: precisao simples	:: exige a letra 'f' :: float peso = 70.5f;
double: 64 bits :: tipo padrao para decimais

3 - caractere
char:	16 bits :: guarda um unico caractere unicode por aspas simples :: char letra = 'A';

4 - booleano
boolean: true ou false

*/

public class Main {
	public static void main (String[] args){
		byte idade 				= 25;
		short ano 				= 2026;
		int populacaoCidade		= 5000000;	
		long populacaoMundial 	= 8000000000L;
		float altura 			= 1.75f;
		double salario			= 4500.50d;
		boolean estudante		= true;
		char inicialNome		= 'A';

		System.out.println("Idade: " + idade );
		System.out.println("Ano: " + ano );
		System.out.println("População da cidade: " + populacaoCidade );
		System.out.println("População mundial: " + populacaoMundial );
		System.out.println("Altura: " + altura );
		System.out.println("Salário: " + salario );
		System.out.println("É estudante ? " + estudante );
		System.out.println("Inicial do nome: " + inicialNome );
	}
}