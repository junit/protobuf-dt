package com.google.eclipse.protobuf.ui.preferences.compiler;

import static com.google.eclipse.protobuf.ui.preferences.compiler.PreferenceNames.AS_CODE_GENERATION_ENABLED;
import static com.google.eclipse.protobuf.ui.preferences.compiler.PreferenceNames.AS_OUTPUT_DIRECTORY;
import static com.google.eclipse.protobuf.ui.preferences.compiler.PreferenceNames.AS_PROTOC_FILE_PATH;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * 
 * @author Ethan
 *
 */
public class AsCodeGenerationPreference implements CodeGenerationPreference {
	  private final IPreferenceStore store;
	  private final IProject project;

	  AsCodeGenerationPreference(IPreferenceStore store, IProject project) {
	    this.store = store;
	    this.project = project;
	  }

	  @Override public boolean isEnabled() {
	    return store.getBoolean(AS_CODE_GENERATION_ENABLED);
	  }

	  @Override public String outputDirectory() {
	    return store.getString(AS_OUTPUT_DIRECTORY);
	  }

	  public String protocFilePath() {
		  return store.getString(AS_PROTOC_FILE_PATH);
	  }
	  
	  @Override public IProject project() {
	    return project;
	  }
	}
