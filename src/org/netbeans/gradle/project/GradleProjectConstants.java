package org.netbeans.gradle.project;

public final class GradleProjectConstants {
    public static final String BUILD_FILE_NAME = "build.gradle";
    public static final String SETTINGS_FILE_NAME = "settings.gradle";

    public static final String NB_SETTINGS_DIR = ".nbsettings";
    public static final String NB_SETTINGS_FILE = "project.settings";

    public static final String SOURCES = "project-sources";
    public static final String TEST_SOURCES = "project-test-sources";
    public static final String RESOURCES = "project-resources";
    public static final String TEST_RESOURCES = "test-resources";

    private GradleProjectConstants() {
        throw new AssertionError();
    }
}
