package abstractFactory.factories;

import abstractFactory.tool.ToolA;
import abstractFactory.tool.ToolB;

public interface ToolFactory {
    ToolA createToolA();
    ToolB createToolB();
}
