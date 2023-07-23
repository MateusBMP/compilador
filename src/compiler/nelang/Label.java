package compiler.nelang;

import java.util.HashMap;
import java.util.Map;

public record Label(String name, Map<String, Variable> variables) {

    public Label(String name) {
        this(name, new HashMap<String, Variable>());
    }

    public String name() {
        return (String) this.name;
    }

    public Map<String, Variable> variables() {
        return (Map<String, Variable>) this.variables;
    }

    public Map<String, Variable> addVariable(Variable variable) {
        this.variables.put(variable.name(), variable);
        return this.variables;
    }
}
