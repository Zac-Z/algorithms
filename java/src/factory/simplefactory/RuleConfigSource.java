package factory.simplefactory;

import factory.entity.config.RuleConfig;
import factory.entity.parser.*;

public class RuleConfigSource {

    public RuleConfig load(String ruleConfigFilePath){
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParser parser = RuleConfigParserFactory.getParser(ruleConfigFileExtension);
        if (null == parser) {
            return null;
        }
        String configText = "";
        //从ruleConfigFilePath文件中读取配置文本到configText中
        RuleConfig ruleConfig = parser.parse(configText);
        return ruleConfig;
    }

    private String getFileExtension(String filePath) {
        //...解析文件名获取扩展名，比如rule.json，返回json
        return "json";
    }
}
