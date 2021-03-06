/*
 * This file was automatically generated by EvoSuite
 * Fri Feb 21 06:51:37 GMT 2020
 */

package org.apache.groovy.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.groovy.util.BeanUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BeanUtils_ESTest extends BeanUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = BeanUtils.decapitalize("e/");
      assertEquals("e/", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        BeanUtils.capitalize("");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        BeanUtils.capitalize((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.groovy.util.BeanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = BeanUtils.capitalize("hN|=6~P{?r^GJ");
      assertEquals("hN|=6~P{?r^GJ", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = BeanUtils.capitalize("o");
      assertEquals("O", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = BeanUtils.capitalize("qc?");
      assertEquals("Qc?", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = BeanUtils.capitalize("ZIVg@Xk:m(t");
      assertEquals("ZIVg@Xk:m(t", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = BeanUtils.decapitalize("hN|=6~P{?r^GJ");
      assertEquals("hN|=6~P{?r^GJ", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = BeanUtils.decapitalize("Qc?");
      assertEquals("qc?", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = BeanUtils.decapitalize("o");
      assertEquals("o", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = BeanUtils.decapitalize("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = BeanUtils.decapitalize("ZIVg@Xk:m(t");
      assertEquals("ZIVg@Xk:m(t", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = BeanUtils.decapitalize((String) null);
      assertNull(string0);
  }
}
