package com.company;

import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyStructureTest {
    private static INode obj1;
    private static List<INode> ls;
    private static MyStructure myStructure;
    private static INode obj2;
    private static INode obj3;

    @BeforeAll
    static void setUp() {
        obj1 = new Node("code_1", "renderer_1");
        obj2 = new Node("code_2", "renderer_2");
        ls = new ArrayList<>(3);
        ls.add(obj1);
        ls.add(obj2);
        obj3 = new CompositeNode("code_composite", "renderer_composite", ls);
        ls.add(obj3);
        myStructure = new MyStructure(ls);
    }

    @org.junit.jupiter.api.Test
    void findByCode_Node() {
        INode result = myStructure.findByCode("code_1");
        assertEquals(obj1, result);
    }

    @org.junit.jupiter.api.Test
    void findByCode_CompositeNode() {
        INode result = myStructure.findByCode("code_composite");
        assertEquals(obj3, result);
    }

    @org.junit.jupiter.api.Test
    void findByRenderer_Node() {
        INode result = myStructure.findByRenderer("renderer_2");
        assertEquals(obj2, result);
    }

    @org.junit.jupiter.api.Test
    void findByRenderer_CompositeNode() {
        INode result = myStructure.findByRenderer("renderer_composite");
        assertEquals(obj3, result);
    }

    @org.junit.jupiter.api.Test
    void count_Node() {
        int result = obj1.getCount();
        assertEquals(1, result);
    }

    @org.junit.jupiter.api.Test
    void count_Node_CompositeNode() {
        int result = obj3.getCount();
        assertEquals(3, result);
    }
}