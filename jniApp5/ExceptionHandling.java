import java.io.File;
import java.lang.reflect.Field ;

public class ExceptionHandling{

    static {
            String libPath = null;
    try{
      String mPath = new File (".").getCanonicalPath()+"/";
       String langKey = "java.library.path" ;
       System.setProperty ( langKey, mPath ) ;

       libPath = System.getProperty("java.library.path");
       System.out.println("java.library.path=" + libPath);
    }catch(Exception e){
      e.printStackTrace();
    }
    System.load(libPath+"libExceptionHandling.so");
       // System.loadLibrary("ExceptionHandling");
    }

public static void main(String[] args) {
    ExceptionHandling obj = new ExceptionHandling();
    
    obj.callExceptionDemo();
       // obj.callFatalErrorDemo();

}

    private void callExceptionDemo() {
    	try {
    		ExceptionDemo();
    	} catch (RuntimeException e) {
    		String msg = e.getMessage();
    		//tv.setText(msg);
            System.out.println(msg);
    	}
    }
    
    private void callFatalErrorDemo() {
    	FatalErrorDemo();
    	//tv.setText("after calling FatalErrorDemo");
        System.out.println("after calling FatalErrorDemo");
    }

    private native void ExceptionDemo();
    private native void FatalErrorDemo();

}