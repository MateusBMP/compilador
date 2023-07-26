package compiler.nelang;

import org.antlr.v4.runtime.*;

public record VisitorContext(EvalVisitor visitor, ParserRuleContext context) {}
