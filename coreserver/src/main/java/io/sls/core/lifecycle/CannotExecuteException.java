package io.sls.core.lifecycle;

/**
 * Created by IntelliJ IDEA.
 * User: jarisch
 * Date: 10.02.2012
 * Time: 12:55:36
 */
public class CannotExecuteException extends LifecycleException {
    public CannotExecuteException(String message) {
        super(message);
    }
}