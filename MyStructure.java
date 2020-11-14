package com.company;

import java.util.List;

public class MyStructure implements IMyStructure {
    private List<INode> nodes;

    public MyStructure(List<INode> nodesList) {
        nodes = nodesList;
    }

    @Override
    public INode findByCode(String code) {
        return find(code, "code");
    }

    @Override
    public INode findByRenderer(String renderer) {
        return find(renderer, "renderer");
    }

    @Override
    public int count() {
        int count = 0;
        for (INode node : nodes) {
            count += node.getCount();
        }
        return count;
    }

    private INode find(String value, String search_what) {
        INode found_node = null;
        String val;

        for (INode node : nodes) {
            val = search_what.equals("code") ? node.getCode() : node.getRenderer();
            if (val.equals(value)) {
                found_node = node;
                break;
            }
        }
        return found_node;
    }
}
