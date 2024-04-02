package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class MainTest extends TestCase {
    @Test
    public static void testMethod(){
        String v="hello";
        assertEquals("hello",v);
}
}