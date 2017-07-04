#include <jni.h>
#include <stdio.h>
#include "JNIHello.h"
/*
 * Class:     JNIHello
 * Method:    sayHello
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_JNIHello_sayHello
  (JNIEnv *env, jobject obj) {
        printf("Hello world!\n");
        return;
}
