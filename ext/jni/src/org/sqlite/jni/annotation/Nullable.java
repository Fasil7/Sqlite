package org.sqlite.jni.annotation;

/**
   This annotation is for flagging parameters which may legally be
   null, noting that they may behave differently if passed null but
   are prepared to expect null as a value. When used in the context of
   callback methods which are called into from the C APIs, this
   annotation communicates that the C API may pass a null value to the
   callback.

   <p>This annotation is solely for the use by the classes in this
   package but is made public so that javadoc will link to it from the
   annotated functions. It is not part of the public API and
   client-level code must not rely on it.
*/
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@java.lang.annotation.Target(java.lang.annotation.ElementType.PARAMETER)
public @interface Nullable{}
