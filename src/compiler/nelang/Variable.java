package compiler.nelang;

public record Variable(String name, Integer value) {

    public Variable(String name) {
        this(name, 0);
    }

    public Integer value() {
        return (Integer) this.value;
    }
}