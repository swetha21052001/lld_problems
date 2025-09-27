package abstractFactory.factories;

import abstractFactory.tool.ToolA;
import abstractFactory.tool.ToolAImpl2;
import abstractFactory.tool.ToolB;
import abstractFactory.tool.ToolBImpl2;

public class ToolFactory2 implements ToolFactory{
    @Override
    public ToolA createToolA() {
        return new ToolAImpl2();
    }

    @Override
    public ToolB createToolB() {
        return new ToolBImpl2();
    }
}
