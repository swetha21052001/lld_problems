package abstractFactory;

import abstractFactory.factories.ToolFactory;
import abstractFactory.factories.ToolFactory1;
import abstractFactory.factories.ToolFactory2;
import abstractFactory.tool.ToolA;
import abstractFactory.tool.ToolB;

public class AbstractFactoryExecute {
    public static void main(String[] args){
        ToolFactory toolFactory = new ToolFactory1();
        ToolA toolA = toolFactory.createToolA();
        ToolB toolB = toolFactory.createToolB();
        toolA.execute();
        toolB.run();

        toolFactory = new ToolFactory2();
        toolA = toolFactory.createToolA();
        toolB = toolFactory.createToolB();
        toolA.execute();
        toolB.run();
    }
}
