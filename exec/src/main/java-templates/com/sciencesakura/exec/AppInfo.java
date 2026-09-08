package com.sciencesakura.exec;

/**
 * The application information.
 */
public interface AppInfo {

  String NAME = "${project.artifactId}";

  String VERSION = "${project.name} ${project.version}";
}
