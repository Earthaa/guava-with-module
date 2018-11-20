module guava {
    requires java.compiler;
    requires java.logging;
    requires animal.sniffer.annotations;
    requires checker.qual;
    requires error.prone.annotations;
    requires failureaccess;
    requires j2objc.annotations;
    requires jdk.unsupported;
    requires jsr305;

    exports com.google.common.annotations;
    exports com.google.common.base ;
    exports com.google.common.collect ;
    exports com.google.common.escape;
    exports com.google.common.io;
    exports com.google.common.primitives;
    exports com.google.common.reflect;
    exports com.google.common.util.concurrent;
}