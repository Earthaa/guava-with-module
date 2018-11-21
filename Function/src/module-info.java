module Function {
    requires java.compiler;
    requires java.logging;
    requires checker.qual;
    requires error.prone.annotations;
    requires j2objc.annotations;
    requires jdk.unsupported;
    requires Base;
    requires KeyComponent;

    exports com.google.common.escape;
    exports com.google.common.io;
    exports com.google.common.reflect;
}