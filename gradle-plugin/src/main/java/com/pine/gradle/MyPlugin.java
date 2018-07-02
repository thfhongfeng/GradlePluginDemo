package com.pine.gradle;

import com.pine.gradle.extension.PersonConfig;
import com.pine.gradle.task.PrintTask;

import org.gradle.api.Action;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class MyPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        System.out.println("========================");
        System.out.println("hello gradle plugin!");
        System.out.println("========================");

        project.getExtensions().add("personExt", PersonConfig.class);
        project.getTasks().create("printTask", PrintTask.class);

        project.afterEvaluate(new Action<Project>() {
            @Override
            public void execute(Project project) {
                System.out.println("afterEvaluate execute");
            }
        });
        project.beforeEvaluate(new Action<Project>() {
            @Override
            public void execute(Project project) {
                System.out.println("beforeEvaluate execute");
            }
        });
    }
}