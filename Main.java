package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
    }
}

interface IMyStructure {
    // zwraca węzeł o podanym kodzie lub null
    INode findByCode(String code);

    // zwraca węzeł o podanym rendererze lub null
    INode findByRenderer(String renderer);

    //zwraca liczbę węzłów
    int count();
}

interface INode {
    String getCode();

    String getRenderer();

    int getCount();
}

interface ICompositeNode extends INode {
    List<INode> getNodes();
}