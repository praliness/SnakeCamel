package snakecamel;

import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelTest {
	@Test
	public void snakeToCamelcase��snake����ϊ�() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String sn1 = "abc_def_ghi";
		System.out.println("abc_def_ghi:"+sc.snakeToCamelcase(sn1));
	}
	@Test
	public void camelToSnakecase��camel����ϊ�() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String ca1 = "AbcDef";
		System.out.println("AbcDef:"+sc.camelToSnakecase(ca1));
	}
}
