/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Feb 21 06:55:51 GMT 2020
 */

package org.apache.groovy.util.concurrent.concurrentlinkedhashmap;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class ConcurrentLinkedHashMap_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/84/hf1w65113t71s05svflntk740000gn/T/"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/Users/xusong/Desktop/Projects/Groovy-Song"); 
    java.lang.System.setProperty("user.home", "/Users/xusong"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "xusong"); 
    java.lang.System.setProperty("user.timezone", "America/New_York"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ConcurrentLinkedHashMap_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.Weighers",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$DrainStatus$2",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.EvictionListener",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$DrainStatus$1",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.Weighers$ListWeigher",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$ValueIterator",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.LinkedDeque",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$DrainStatus$3",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.Weighers$MapWeigher",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$Builder",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.Weighers$ByteArrayWeigher",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$Values",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.Weighers$SingletonEntryWeigher",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$EntryIterator",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$KeySet",
      "org.apache.groovy.util.ObjectHolder",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$BoundedEntryWeigher",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$AddTask",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.Weighers$SingletonWeigher",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$UpdateTask",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.Linked",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.LinkedDeque$2",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$Node",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.Weighers$SetWeigher",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$WeightedValue",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.Weigher",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$DiscardingQueue",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$SerializationProxy",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$DiscardingListener",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.Weighers$IterableWeigher",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$EntrySet",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$DrainStatus",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.Weighers$EntryWeigherView",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.Weighers$CollectionWeigher",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$RemovalTask",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.LinkedDeque$AbstractLinkedIterator",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.EntryWeigher",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$WriteThroughEntry",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$KeyIterator",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.LinkedDeque$1"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.lang.ThreadGroup", false, ConcurrentLinkedHashMap_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.groovy.util.concurrent.concurrentlinkedhashmap.EvictionListener", false, ConcurrentLinkedHashMap_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.groovy.util.concurrent.concurrentlinkedhashmap.Weigher", false, ConcurrentLinkedHashMap_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.codehaus.groovy.reflection.CachedMethod", false, ConcurrentLinkedHashMap_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ConcurrentLinkedHashMap_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$DiscardingQueue",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$Node",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$WeightedValue",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$DrainStatus",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$AddTask",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$UpdateTask",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$RemovalTask",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$KeySet",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$Values",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$EntrySet",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$SerializationProxy",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$DiscardingListener",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.Weighers$SingletonEntryWeigher",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$Builder",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.Weighers",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.Weighers$SingletonWeigher",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.Weighers$EntryWeigherView",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.LinkedDeque",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$EntryIterator",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$KeyIterator",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.ConcurrentLinkedHashMap$BoundedEntryWeigher",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.LinkedDeque$AbstractLinkedIterator",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.LinkedDeque$2",
      "org.apache.groovy.util.concurrent.concurrentlinkedhashmap.LinkedDeque$1"
    );
  }
}
