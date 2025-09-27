package abstractFactory.factories;

import abstractFactory.tool.ToolA;
import abstractFactory.tool.ToolAImpl1;
import abstractFactory.tool.ToolB;
import abstractFactory.tool.ToolBImpl1;

public class ToolFactory1 implements ToolFactory{
    @Override
    public ToolA createToolA() {
        return new ToolAImpl1();
    }

    @Override
    public ToolB createToolB() {
        return new ToolBImpl1();
    }
}
