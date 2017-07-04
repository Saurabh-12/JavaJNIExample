public class JNIHello {
                static {
                                System.loadLibrary("JNIHello");
                }
                private native void sayHello();
                public static void main(String args[]) {
                                JNIHello jniHello = new JNIHello();
                                jniHello.sayHello();
                }
}
