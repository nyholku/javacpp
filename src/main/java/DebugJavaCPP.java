import org.bytedeco.javacpp.tools.Builder;

//NOTE! requires that current directory is /Users/nyholku/javacpp-occ/src or what ever is necessary, this cannot be set in Java
//      In Eclipse set it in Debug Configurations / Arguments tab

public class DebugJavaCPP {

	public static void main(String[] args) {
		try {
			String platform = "/Users/nyholku/javacpp/src/main/resources/org/bytedeco/javacpp/properties/macosx-x86_64.properties";
			String[] args1 = { "-propertyfile", platform, "occ/TKernelConfig.java" };
			Builder.main(args1);
			String[] args2 = { "-propertyfile", platform, "-nodelete", "occ/TKernel.java"};
			Builder.main(args2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
