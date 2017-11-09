package com.company.lesson12;

/**
 * ƒаны два числа, например 3 и 56, необходимо составить следующие строки:
 * 3+56=59; 3Ц56=-53; 3*56=168. »спользуетс€ метод StringBuilder.append.
 * «амен€ем символ У=Ф на слово УравноФ
 * 
 * @author Elen
 *
 */
public class CompilationOfLines {

	public static void main(String[] args) {
		String s;
		int a = 3;
		int b = 56;
		StringBuilder sb = new StringBuilder(40);
		StringBuilder sb1 = new StringBuilder(40);
		StringBuilder sb2 = new StringBuilder(40);

		s = sb.append(a).append("+").append(b).append("=").append(a+b).toString();
		System.out.println(s);
		s = sb1.append(a).append("-").append(b).append("=").append(a-b).toString();
		System.out.println(s);
		s = sb2.append(a).append("*").append(b).append("=").append(a*b).toString();
		System.out.println(s);

		sb.insert(4, " равно ");
		sb.delete(11, 12);
		System.out.println(sb);

		sb1.replace(4, 5, " равно ");
		System.out.println(sb1);

		sb2.replace(4, 5, " равно ");
		System.out.println(sb2);
	}
}
