package compiler.nelang;

import java.util.Stack;

public class NelangException extends RuntimeException {
    Stack<VisitorContext> stacktrace = null;

    public NelangException(String message, Stack<VisitorContext> stacktrace) {
        super(message);
        this.stacktrace = stacktrace;
    }

    @SuppressWarnings("unchecked")
    public Stack<VisitorContext> stacktrace() {
        return (Stack<VisitorContext>) this.stacktrace.clone();
    }
}