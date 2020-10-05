package io.quarkus.workshop.superheroes.quack.runtime;
public final class QuackConfig$$accessor {
    private QuackConfig$$accessor() {}
    @SuppressWarnings("unchecked")
    public static boolean get_enabled(Object __instance) {
        return ((QuackConfig)__instance).enabled;
    }
    @SuppressWarnings("unchecked")
    public static void set_enabled(Object __instance, boolean enabled) {
        ((QuackConfig)__instance).enabled = enabled;
    }
    @SuppressWarnings("unchecked")
    public static Object get_delay(Object __instance) {
        return ((QuackConfig)__instance).delay;
    }
    @SuppressWarnings("unchecked")
    public static void set_delay(Object __instance, Object delay) {
        ((QuackConfig)__instance).delay = (java.util.Optional<java.time.Duration>)delay;
    }
    @SuppressWarnings("unchecked")
    public static double get_delayRatio(Object __instance) {
        return ((QuackConfig)__instance).delayRatio;
    }
    @SuppressWarnings("unchecked")
    public static void set_delayRatio(Object __instance, double delayRatio) {
        ((QuackConfig)__instance).delayRatio = delayRatio;
    }
    @SuppressWarnings("unchecked")
    public static double get_faultRatio(Object __instance) {
        return ((QuackConfig)__instance).faultRatio;
    }
    @SuppressWarnings("unchecked")
    public static void set_faultRatio(Object __instance, double faultRatio) {
        ((QuackConfig)__instance).faultRatio = faultRatio;
    }
    @SuppressWarnings("unchecked")
    public static Object get_faultMessage(Object __instance) {
        return ((QuackConfig)__instance).faultMessage;
    }
    @SuppressWarnings("unchecked")
    public static void set_faultMessage(Object __instance, Object faultMessage) {
        ((QuackConfig)__instance).faultMessage = (String)faultMessage;
    }
    @SuppressWarnings("unchecked")
    public static int get_faultStatusCode(Object __instance) {
        return ((QuackConfig)__instance).faultStatusCode;
    }
    @SuppressWarnings("unchecked")
    public static void set_faultStatusCode(Object __instance, int faultStatusCode) {
        ((QuackConfig)__instance).faultStatusCode = faultStatusCode;
    }
    public static Object construct() {
        return new QuackConfig();
    }
}
