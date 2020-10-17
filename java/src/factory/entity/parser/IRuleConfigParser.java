package factory.entity.parser;

import factory.entity.config.RuleConfig;

public abstract class IRuleConfigParser {
    public abstract RuleConfig parse(String configText);
}
