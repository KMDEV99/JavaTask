package com.company;

public class Node implements INode {
    String code;
    String renderer;

    public Node(String code, String renderer) {
        this.code = code;
        this.renderer = renderer;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getRenderer() {
        return renderer;
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public String toString() {
        return code + " " + renderer;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof INode)) {
            return false;
        }
        INode node = (INode) o;

        return code.equals(node.getCode()) && renderer.equals(node.getRenderer());
    }


}
