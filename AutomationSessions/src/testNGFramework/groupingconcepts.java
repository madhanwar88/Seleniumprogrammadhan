package testNGFramework;

import org.testng.annotations.Test;

public class groupingconcepts {
@Test(groups="X")
public void f1() {
	System.out.println("printingf1");
}
@Test(groups="X")
public void f2() {
	System.out.println("printingf2");
}
@Test(groups="Y")
public void f3() {
	System.out.println("printingf3");
}
@Test(groups="Y")
public void f4() {
	System.out.println("printingf4");
}
}
