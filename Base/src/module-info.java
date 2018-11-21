module Base {
    requires java.compiler;
    requires java.logging;
    requires checker.qual;
    requires error.prone.annotations;
    requires jdk.unsupported;
    requires j2objc.annotations;
    requires jsr305;

    exports com.google.common.annotations;
    exports com.google.common.base;
    exports com.google.common.math;
    exports com.google.common.primitives;
}