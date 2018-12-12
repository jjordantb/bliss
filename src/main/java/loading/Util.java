package loading;

import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.tree.ClassNode;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

public class Util {

    public static HashMap<String, ClassNode> load(final InputStream inputStream) throws IOException {
        final HashMap<String, ClassNode> nodeHashMap = new HashMap<>();
        final JarInputStream inStream = new JarInputStream(inputStream);
        JarEntry entry;
        while ((entry = inStream.getNextJarEntry()) != null) {
            if (entry.getName().endsWith(".class")) {

                final ClassReader classReader = new ClassReader(inStream);
                final ClassNode classNode = new ClassNode();
                classReader.accept(classNode, 0);

                nodeHashMap.put(entry.getName().replace(".class", "").replace("/", "."), classNode);
            }
            inStream.closeEntry();
        }
        inStream.close();
        return nodeHashMap;
    }

}
