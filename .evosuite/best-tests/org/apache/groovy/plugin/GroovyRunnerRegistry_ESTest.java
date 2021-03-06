/*
 * This file was automatically generated by EvoSuite
 * Fri Feb 21 06:54:00 GMT 2020
 */

package org.apache.groovy.plugin;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import org.apache.groovy.plugin.GroovyRunner;
import org.apache.groovy.plugin.GroovyRunnerRegistry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GroovyRunnerRegistry_ESTest extends GroovyRunnerRegistry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GroovyRunnerRegistry groovyRunnerRegistry0 = GroovyRunnerRegistry.getInstance();
      ClassLoader.getSystemClassLoader();
      GroovyRunner groovyRunner0 = groovyRunnerRegistry0.remove((Object) "org.apache.groovy.plugin.DefaultRunners$Junit4TestRunner");
      assertNotNull(groovyRunner0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GroovyRunnerRegistry groovyRunnerRegistry0 = GroovyRunnerRegistry.getInstance();
      // Undeclared exception!
      try { 
        groovyRunnerRegistry0.putAll((Map<? extends String, ? extends GroovyRunner>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.groovy.plugin.GroovyRunnerRegistry", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GroovyRunnerRegistry groovyRunnerRegistry0 = null;
      try {
        groovyRunnerRegistry0 = new GroovyRunnerRegistry((Map<? extends String, ? extends GroovyRunner>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.groovy.plugin.GroovyRunnerRegistry", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GroovyRunnerRegistry groovyRunnerRegistry0 = GroovyRunnerRegistry.getInstance();
      Set<Map.Entry<String, GroovyRunner>> set0 = (Set<Map.Entry<String, GroovyRunner>>)groovyRunnerRegistry0.entrySet();
      assertFalse(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GroovyRunnerRegistry groovyRunnerRegistry0 = GroovyRunnerRegistry.getInstance();
      groovyRunnerRegistry0.size();
      Collection<GroovyRunner> collection0 = groovyRunnerRegistry0.values();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GroovyRunnerRegistry groovyRunnerRegistry0 = GroovyRunnerRegistry.getInstance();
      Collection<GroovyRunner> collection0 = groovyRunnerRegistry0.values();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<String, GroovyRunner> hashMap0 = new HashMap<String, GroovyRunner>(1);
      GroovyRunnerRegistry groovyRunnerRegistry0 = new GroovyRunnerRegistry(hashMap0);
      hashMap0.put("", (GroovyRunner) null);
      groovyRunnerRegistry0.putAll(hashMap0);
      assertEquals(1, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GroovyRunnerRegistry groovyRunnerRegistry0 = GroovyRunnerRegistry.getInstance();
      HashMap<String, GroovyRunner> hashMap0 = new HashMap<String, GroovyRunner>();
      hashMap0.put((String) null, (GroovyRunner) null);
      groovyRunnerRegistry0.putAll(hashMap0);
      assertFalse(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GroovyRunnerRegistry groovyRunnerRegistry0 = GroovyRunnerRegistry.getInstance();
      groovyRunnerRegistry0.putAll(groovyRunnerRegistry0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GroovyRunnerRegistry groovyRunnerRegistry0 = GroovyRunnerRegistry.getInstance();
      GroovyRunner groovyRunner0 = groovyRunnerRegistry0.putIfAbsent("org.apache.groovy.plugin.DefaultRunners$Junit4TestRunner", (GroovyRunner) null);
      GroovyRunner groovyRunner1 = groovyRunnerRegistry0.put("org.apache.groovy.plugin.DefaultRunners$Junit4TestRunner", groovyRunner0);
      assertSame(groovyRunner0, groovyRunner1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GroovyRunnerRegistry groovyRunnerRegistry0 = GroovyRunnerRegistry.getInstance();
      GroovyRunner groovyRunner0 = groovyRunnerRegistry0.get((Object) null);
      assertNull(groovyRunner0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GroovyRunnerRegistry groovyRunnerRegistry0 = GroovyRunnerRegistry.getInstance();
      GroovyRunner groovyRunner0 = groovyRunnerRegistry0.get("org.apache.groovy.plugin.DefaultRunners$Junit4TestRunner");
      assertNotNull(groovyRunner0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<String, GroovyRunner> hashMap0 = new HashMap<String, GroovyRunner>(1);
      GroovyRunnerRegistry groovyRunnerRegistry0 = new GroovyRunnerRegistry(hashMap0);
      Set<String> set0 = groovyRunnerRegistry0.keySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GroovyRunnerRegistry groovyRunnerRegistry0 = GroovyRunnerRegistry.getInstance();
      Set<String> set0 = groovyRunnerRegistry0.keySet();
      assertEquals(3, set0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GroovyRunnerRegistry groovyRunnerRegistry0 = GroovyRunnerRegistry.getInstance();
      GroovyRunner groovyRunner0 = groovyRunnerRegistry0.remove((Object) null);
      assertNull(groovyRunner0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GroovyRunnerRegistry groovyRunnerRegistry0 = GroovyRunnerRegistry.getInstance();
      GroovyRunner groovyRunner0 = groovyRunnerRegistry0.put((String) null, (GroovyRunner) null);
      assertNull(groovyRunner0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<String, GroovyRunner> hashMap0 = new HashMap<String, GroovyRunner>();
      GroovyRunnerRegistry groovyRunnerRegistry0 = new GroovyRunnerRegistry(hashMap0);
      Set<Map.Entry<String, GroovyRunner>> set0 = (Set<Map.Entry<String, GroovyRunner>>)groovyRunnerRegistry0.entrySet();
      boolean boolean0 = groovyRunnerRegistry0.containsValue(set0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GroovyRunnerRegistry groovyRunnerRegistry0 = GroovyRunnerRegistry.getInstance();
      boolean boolean0 = groovyRunnerRegistry0.containsValue((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GroovyRunnerRegistry groovyRunnerRegistry0 = GroovyRunnerRegistry.getInstance();
      GroovyRunner groovyRunner0 = groovyRunnerRegistry0.putIfAbsent("org.apache.groovy.plugin.DefaultRunners$Junit4TestRunner", (GroovyRunner) null);
      boolean boolean0 = groovyRunnerRegistry0.containsValue(groovyRunner0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GroovyRunnerRegistry groovyRunnerRegistry0 = GroovyRunnerRegistry.getInstance();
      boolean boolean0 = groovyRunnerRegistry0.containsKey("org.apache.groovy.plugin.DefaultRunners$Junit4TestRunner");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GroovyRunnerRegistry groovyRunnerRegistry0 = GroovyRunnerRegistry.getInstance();
      BiFunction<Object, Object, GroovyRunner> biFunction0 = (BiFunction<Object, Object, GroovyRunner>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((GroovyRunner) null).when(biFunction0).apply(any() , any());
      GroovyRunner groovyRunner0 = groovyRunnerRegistry0.compute((String) null, biFunction0);
      assertNull(groovyRunner0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GroovyRunnerRegistry groovyRunnerRegistry0 = GroovyRunnerRegistry.getInstance();
      Iterator<GroovyRunner> iterator0 = groovyRunnerRegistry0.iterator();
      boolean boolean0 = groovyRunnerRegistry0.containsKey(iterator0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashMap<String, GroovyRunner> hashMap0 = new HashMap<String, GroovyRunner>(1);
      GroovyRunnerRegistry groovyRunnerRegistry0 = new GroovyRunnerRegistry(hashMap0);
      boolean boolean0 = groovyRunnerRegistry0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GroovyRunnerRegistry groovyRunnerRegistry0 = GroovyRunnerRegistry.getInstance();
      boolean boolean0 = groovyRunnerRegistry0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GroovyRunnerRegistry groovyRunnerRegistry0 = GroovyRunnerRegistry.getInstance();
      groovyRunnerRegistry0.load((ClassLoader) null);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HashMap<String, GroovyRunner> hashMap0 = new HashMap<String, GroovyRunner>();
      GroovyRunnerRegistry groovyRunnerRegistry0 = new GroovyRunnerRegistry(hashMap0);
      int int0 = groovyRunnerRegistry0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HashMap<String, GroovyRunner> hashMap0 = new HashMap<String, GroovyRunner>();
      GroovyRunnerRegistry groovyRunnerRegistry0 = new GroovyRunnerRegistry(hashMap0);
      groovyRunnerRegistry0.clear();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GroovyRunnerRegistry groovyRunnerRegistry0 = GroovyRunnerRegistry.getInstance();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      groovyRunnerRegistry0.load(classLoader0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GroovyRunnerRegistry groovyRunnerRegistry0 = GroovyRunnerRegistry.getInstance();
      String string0 = groovyRunnerRegistry0.toString();
      assertNotNull(string0);
  }
}
