package com.company;

import java.util.List;

public class CompositeNode extends Node implements ICompositeNode {
    List<INode> nodes;

    public CompositeNode(String code, String renderer, List<INode> nodes){
        super(code, renderer);
        this.nodes = nodes;
    }

    @Override
    public List<INode> getNodes() {
        return nodes;
    }

    @Override
    public int getCount() {
        return nodes.size();
    }
}
