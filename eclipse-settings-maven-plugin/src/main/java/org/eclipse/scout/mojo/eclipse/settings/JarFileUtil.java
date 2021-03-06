package org.eclipse.scout.mojo.eclipse.settings;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarFile;

import org.apache.maven.artifact.Artifact;

public final class JarFileUtil {

	private JarFileUtil() {
	}

	@SuppressWarnings("resource")
	public static List<JarFile> resolveJar(final List<Artifact> additionalArtifacts) throws IOException {
		List<JarFile> jarFiles = new ArrayList<>();
		for (int i = 0; i < additionalArtifacts.size(); i++) {
			Artifact artifact = additionalArtifacts.get(i);
				jarFiles.add(new JarFile(artifact.getFile()));
		}
		return jarFiles;
	}
}
