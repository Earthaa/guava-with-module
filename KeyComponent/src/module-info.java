module KeyComponent {
    requires java.compiler;
    requires java.logging;
    requires animal.sniffer.annotations;
    requires checker.qual;
    requires error.prone.annotations;
    requires failureaccess;
    requires j2objc.annotations;
    requires jdk.unsupported;
    requires Base;

    exports com.google.common.collect;
    exports com.google.common.util.concurrent;
}